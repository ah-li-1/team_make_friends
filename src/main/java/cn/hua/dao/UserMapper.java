package cn.hua.dao;

import cn.hua.pojo.User;

import java.util.List;

public interface UserMapper {
    //增加一个User
    int addUser(User user);

    //根据id删除一个User
    int deleteUserById(int id);

    //更新User
    int updateUser(User User);

    //根据id查询,返回一个User
    User queryUserById(int id);

    //查询全部User,返回list集合
    List<User> queryAllUser();

    //根据用户名进行查询
    User queryByName(String name);
}
