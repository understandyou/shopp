package dao;

import entitys.Producet;
import entitys.UserData;
import entitys.UserInfor;

/**
 * @author 植杨爽
 */
//@Repository("userDao"),有mybatis的mapperScanner类扫描后就不要需要给这个类标注
public interface UserDao {
    /**
     * 添加用户信息包含地址信息或者为null
     * @param userData
     */
    Integer addUserData(UserData userData);

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
     * 查询用户是否存在（login）
     * @param userData
     * @return 返回对应id，如果有id则表明是存在并且对应正确的账户
     */
    Integer loginUserData(UserData userData);

    /**
     * 验证是否重名
     * @param userData
     * @return 返回对应id，如果有id则表明用户名（重复）
     */
    Integer selectUserData(UserData userData);


}
