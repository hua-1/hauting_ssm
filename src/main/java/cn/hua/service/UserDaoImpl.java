package cn.hua.service;

import cn.hua.dao.UserDao;
import cn.hua.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDaoImpl implements UserDao {

    @Autowired
    private  UserDao userDao;

    @Override
    public int insertByUser(User user) {
        int i = userDao.insertByUser(user);
        return i;
    }

    @Override
    public List<User> seachByUserName(User user) {
        List<User> users = userDao.seachByUserName(user);
        return users;
    }
}
