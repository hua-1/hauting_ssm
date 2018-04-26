import cn.hua.entity.User;
import cn.hua.service.UserDaoImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class UserTest {


    @Autowired
    private UserDaoImpl userDaoImpl;
    @Test
    public void testFindUserById() {
        User user= new User();
        user.setId(3);
        user.setNameUser("小飞");
        user.setAge(10);
        user.setAddress("上海");
        userDaoImpl.insertByUser(user);
    }

    @Test
public  void  testUsername(){
        User user= new User();
        user.setNameUser("华庭");
        List<User> users = userDaoImpl.seachByUserName(user);
        for (User us:users
             ) {
            System.out.printf("us"+us.getNameUser());
        }
    }

}
