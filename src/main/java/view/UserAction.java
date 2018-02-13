package view;


import entitys.UserData;
import entitys.UserInfor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.UserService;
import service.impl.UserServiceImpl;

import javax.annotation.Resource;

/**
 * 用户信息操作控制器
 * @author 植杨爽
 */
@Controller
@RequestMapping("/userAction")
public class UserAction  {

    /**
     * 注入用户信息服务类
     */
    @Resource(name = "userService")
    private UserService userService;

    /**
     * 添加用户信息包含地址信息或者为null
     *
     */
    @RequestMapping("/addUser.action")
    public void addUserData(UserData userData,UserInfor userInfor) {//使用javabean自动装配机制 把前端参数封装到bean中
        System.out.println("添加userData之前用于查看userId是否加入："+userData);
        //添加
        userService.addUserData(userData);
        System.out.println("执行userData后，查看userId是否加入："+userData);
        userInfor.setUserData(userData);
        addUserInfor(userInfor);
    }

    /**
     * 添加地址信息
     *
     */
    public void addUserInfor(UserInfor userInfor) {
        //用户关联信息
        userService.addUserInfor(userInfor);
    }

    /**
     * 删除地址信息
     *
     */
    @RequestMapping("/deleteUser.action")
    public void deleteUserInfor() {

    }

    /**
     * 修改用户信息
     *
     */
    @RequestMapping("/updateUser.action")
    public void updateUserInfor() {

    }
}
