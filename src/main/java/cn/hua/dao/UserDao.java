package cn.hua.dao;

import cn.hua.entity.User;

import java.util.List;

public interface UserDao {
   int insertByUser(User user);

   List<User> seachByUserName(User user);
}
