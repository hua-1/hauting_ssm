package cn.hua.service;

import cn.hua.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDaoImpl {

    public  String getUserName(){
        User user= new User();
        user.setName("华庭");
        return user.getName();
    }
}
