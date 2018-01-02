package entitys;

import java.util.List;

public class UserData {
    private Integer userId;
    private String userName;
    private String passWord;
    private List<UserInfor> userInfors;

    /**
     * 用户id
     * @return
     */
    public Integer getUserId() {
        return userId;
    }
    /**
     * 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 用户名称
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户名称
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 用户密码
     * @return
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * 用户密码
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    /**
     * 用户详细信息,主要为地址信息
     */
    public List<UserInfor> getUserInfors() {
        return userInfors;
    }

    /**
     * 用户详细信息，主要为地址信息
     * @return
     */
    public void setUserInfors(List<UserInfor> userInfors) {
        this.userInfors = userInfors;
    }
}
