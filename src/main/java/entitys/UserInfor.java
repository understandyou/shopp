package entitys;

public class UserInfor {
    private  Integer userInforId;
    private String address;
    private String phone;
    private UserData userData;

    /**
     * 用户基本信息
     * @return
     */
    public UserData getUserData() {
        return userData;
    }

    /**
     * 用户基本信息
     */
    public void setUserData(UserData userData) {
        this.userData = userData;
    }

    /**
     * 用户详细信息id
     * @return
     */
    public Integer getUserInforId() {
        return userInforId;
    }

    /**
     * 用户详细信息id
     */
    public void setUserInforId(Integer userInforId) {
        this.userInforId = userInforId;
    }

    /**
     * 用户地址
     * @return
     */
    public String getAddress() {
        return address;
    }

    /**
     * 用户地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 用户电话
     * @return
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 用户电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
