package view;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用户信息操作控制器
 * @author 植杨爽
 */
@Controller
@RequestMapping("/userAction")
public class UserAction  {
    /**
     * 添加用户信息包含地址信息或者为null
     *
     */
    @RequestMapping("/addUser.action")
    public void addUserData() {

    }

    /**
     * 添加地址信息
     *
     */
    public void addUserInfor() {

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
