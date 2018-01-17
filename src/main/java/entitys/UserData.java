package entitys;



public class UserData {
    private Integer userId;
    private String userName;
    private String passWord;

    @Override
    public String toString() {
        return "UserData{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }

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

}
