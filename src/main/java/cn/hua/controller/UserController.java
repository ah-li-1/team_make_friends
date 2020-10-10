package cn.hua.controller;

import cn.hua.pojo.Books;
import cn.hua.pojo.User;
import cn.hua.service.BookService;
import cn.hua.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService;

    @RequestMapping("/allBook")
    public String list(Model model) {
        List<User> list = userService.queryAllUser();
        model.addAttribute("list", list);
        System.out.println(list);
        return "allUser";
    }

    @RequestMapping("/toAddUser")
    public String toAddPaper() {
        return "addUser";
    }

    @RequestMapping("/addUser")
    public String addPaper(User users) {
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
    }
}
