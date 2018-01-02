package view;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.beans.PropertyVetoException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;

//Controller为视图层
@Controller
public class Test {

    static SqlSessionFactoryBean fbean = new SqlSessionFactoryBean();
    //测试是否能访问到
    @RequestMapping("/txt")
    public String test() throws PropertyVetoException {
        /*ComboPooledDataSource cm = new ComboPooledDataSource();
        cm.setDriverClass("com.mysql.jdbc.Driver");
        cm.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/shoop");
        cm.setUser("root");
        cm.setPassword("123456");

        Configuration con = new Configuration();
        con.addLoadedResource("../resources/mybatis/mybatis-config.xml");

        fbean.setConfiguration(con);
        fbean.setDataSource(cm);*/



        System.out.println("OK");
        return "test";
    }
    /*public static void main(String[] args) {
        try {
            Test();
            SqlSessionFactory sf =  fbean.getObject();
            SqlSession session = sf.openSession();
            System.out.println("session为："+session);
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
}
