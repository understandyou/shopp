package dao;

import entitys.Produce;
import entitys.UserData;
import entitys.UserInfor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * @author 植杨爽
 */
public interface UserDao {
    /**
     * 添加用户信息包含地址信息或者为null
     * @param userData
     */
    @Insert("insert into u_data(u_name,u_pwd),values(" +
            "#{userData.userName}," +
            "#{userData.passWord});" +
            "#{shoop.num}")
    void addUserData(UserData userData);

    /**
     * 添加地址信息
     * @param userInfor
     */
    @Insert("insert into u_infor(u_id,address,phone) values(#{userInfor.userData.userId},#{userInfor.address},#{userInfor.phone})")
    void addUserInfor(UserInfor userInfor);

    /**
     * 删除地址信息
     * @param userInfor
     */
    @Delete("delete from u_infor where u_infor_id=#{userInfor.userInforId}")
    void deleteUserInfor(UserInfor userInfor);

    /**
     * 修改用户信息
     * @param userInfor
     */
    @Update("update u_infor set where u_infor_id=#{userInfor.userInforId}")
    void updateUserInfor(UserInfor userInfor);

    /**
     *
     * @param userId
     * @return
     */
    @Select("select u_id,u_name,u_pwd from user_data where u_id=#{userId}")
    UserData selectUserData(Integer userId);

    @Select("select prod_id,prod_current,prod_price,prod_describe from produce where u_id=#{userId}")
    Produce selectProduce(Integer userId);
}
