package service.impl;

import entitys.UserData;
import entitys.UserInfor;
import org.springframework.stereotype.Repository;
import service.UserService;

import javax.naming.Name;

/**
 *
 * @author Administrator zys
 * Repository:次注解为对数据访问层bean如果加上(value="*")则表示让spring创建一个名为*的对应此类实例
 * Repository中默认参数表示创建一个类名为userService的对象
 */
@Repository("userService")
public class UserServiceImpl implements UserService {
    /**
     * 添加用户信息包含地址信息或者为null
     *
     * @param userData
     */
    public void addUserData(UserData userData) {
//        Sqlsessionf
    }

    /**
     * 添加地址信息
     *
     * @param userInfor
     */
    public void addUserInfor(UserInfor userInfor) {

    }

    /**
     * 删除地址信息
     *
     * @param userInfor
     */
    public void deleteUserInfor(UserInfor userInfor) {

    }

    /**
     * 修改用户信息
     *
     * @param userInfor
     */
    public void updateUserInfor(UserInfor userInfor) {

    }
}
