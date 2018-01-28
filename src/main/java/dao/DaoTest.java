package dao;

import entitys.UserData;
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
        System.out.println("before:"+userData.getUserId());
        userDao.addUserData(userData);
        System.out.println("after:"+userData.getUserId());
        session.commit();
        session.close();
    }
}
