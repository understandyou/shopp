package service;

import entitys.UserData;
import entitys.UserInfor;

public interface UserService {
    /**
     * 添加用户信息包含地址信息或者为null
     * @param userData
     */
    void addUserData(UserData userData);

    /**
     * 添加地址信息
     * @param userInfor
     */
    void addUserInfor(UserInfor userInfor);

    /**
     * 删除地址信息
     * @param userInfor
     */
    void deleteUserInfor(UserInfor userInfor);

    /**
     * 修改用户信息
     * @param userInfor
     */
    void updateUserInfor(UserInfor userInfor);

    /**
     * 查询是否重名
     */
    Integer selectUserData(UserData userData);

    /**
     * 查询用户是否存在
     */
    Integer loginUserData(UserData userData);
}
