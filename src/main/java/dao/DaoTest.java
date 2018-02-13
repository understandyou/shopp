package dao;

import entitys.UserData;
import entitys.UserInfor;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class DaoTest {
    public static void main(String[] args) throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis/mybatis-config.xml");
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(reader,"mysql");
        System.out.println("获得sqlsession工厂成功："+sf);

        SqlSession session = sf.openSession();
        UserDao userDao = session.getMapper(UserDao.class);
        System.out.println(userDao);
        UserData userData = new UserData();
        userData.setUserName("小明");
        userData.setPassWord("123");
        userData.setUserId(1);
        System.out.println("before:"+userData.getUserId());
        //userDao.addUserData(userData);
        UserInfor ui = new UserInfor();
        ui.setUserData(userData);
        ui.setAddress("成都");
        ui.setPhone("123");
        //测试添加地址信息
        userDao.addUserInfor(ui);
        System.out.println("after:"+ui.getUserInforId());
        session.commit();
        session.close();
    }
}
