package dao;

import entitys.Produce;
import entitys.UserData;
import entitys.UserInfor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

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
     *
     * @param userId
     * @return
     */
    //@Select("select u_id,u_name,u_pwd from user_data where u_id=#{userId}")
    UserData selectUserData(Integer userId);

    //@Select("select prod_id,prod_current,prod_price,prod_describe from produce where u_id=#{userId}")
    Produce selectProduce(Integer userId);
}
