import cn.hua.entity.User;
import cn.hua.service.UserDaoImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class UserTest {

    @Autowired
    private UserDaoImpl userDaoImpl;
    @Test
    public void testFindUserById() {
        String userName = userDaoImpl.getUserName();
        System.out.printf("user"+userName);
    }
}
