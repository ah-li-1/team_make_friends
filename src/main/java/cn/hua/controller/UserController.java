package cn.hua.controller;

import cn.hua.pojo.User;
import cn.hua.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService;

    /*查询所有用户*/
    @RequestMapping("/allUser")
    public String list(Model model) {
        List<User> list = userService.queryAllUser();
        model.addAttribute("list", list);
        System.out.println(list);
        return "allUser";
    }

    /*跳转至登陆界面*/
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }

    /*
    @RequestMapping("/addUser")
    public String addUser(User users) {
        System.out.println(users);
        userService.addUser(users);
        return "redirect:/user/allUser";
    }

    @RequestMapping("/toUpdateUser")
    public String toUpdateBook(Model model, int id) {
        User users = userService.queryUserById(id);
        System.out.println(users);
        model.addAttribute("users",users );
        return "updateUser";
    }

    @RequestMapping("/updateBook")
    public String updateBook(Model model, User user) {
        System.out.println(user);
        userService.updateUser(user);
        User users = userService.queryUserById(user.getU_id());
        model.addAttribute("users", users);
        return "redirect:/user/allUser";
    }

    @RequestMapping("/deleteUser/{u_id}")
    public String deleteUser(@PathVariable("u_id") int u_id) {
        userService.deleteUserById(u_id);
        return null;
    }*/

    /*登陆*/
    @RequestMapping("/login")
    @ResponseBody
    public String login(User user){
        //进行登陆逻辑判断
        //对前台传来的值进行空对象判断
        if(user == null){
            //登陆信息为空，跳转至登陆界面并携带提示信息
            return "redirect:/user/toLogin";
        }

        User user1 = userService.queryUserById(user.getU_id());
        boolean nameEq = user1.getU_username().equals(user.getU_username());
        boolean pwdEq = user1.getU_password().equals(user.getU_password());
        if(nameEq && pwdEq){
            //账号密码匹配，跳转至用户界面
            return "userInfo";
        }

        //密码不正确，跳转至登陆界面并携带提示信息
        return "redirect:/user/toLogin";
    }

    @RequestMapping("/register")
    public String register(User user){
        if(user == null){
            System.out.println("填写信息不完整");
        }

        //需要分表写入
//        userService.addUser()

        //注册成功，跳转至登陆界面并携带注册所用的信息
        return "redirect:/user/toLogin";
    }

    /*通过用户名搜索*/

    @RequestMapping("/queryByName")
    public String queryByName(String u_username,Model model){
        User user = userService.queryByName(u_username);
        model.addAttribute("user",user);
        return "";
    }

}
