package tsms.base.zl.pojo.po;

import java.math.BigDecimal;

public class Userinfo {
    private BigDecimal userid;

    private String userloginid;

    private String userpass;

    private String username;

    private String usersex;

    private String workphone;

    private String cellphone;

    private String mebmerid;

    private String useremail;

    private String ismakeruser;

    public BigDecimal getUserid() {
        return userid;
    }

    public void setUserid(BigDecimal userid) {
        this.userid = userid;
    }

    public String getUserloginid() {
        return userloginid;
    }

    public void setUserloginid(String userloginid) {
        this.userloginid = userloginid == null ? null : userloginid.trim();
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass == null ? null : userpass.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex == null ? null : usersex.trim();
    }

    public String getWorkphone() {
        return workphone;
    }

    public void setWorkphone(String workphone) {
        this.workphone = workphone == null ? null : workphone.trim();
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone == null ? null : cellphone.trim();
    }

    public String getMebmerid() {
        return mebmerid;
    }

    public void setMebmerid(String mebmerid) {
        this.mebmerid = mebmerid == null ? null : mebmerid.trim();
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail == null ? null : useremail.trim();
    }

    public String getIsmakeruser() {
        return ismakeruser;
    }

    public void setIsmakeruser(String ismakeruser) {
        this.ismakeruser = ismakeruser == null ? null : ismakeruser.trim();
    }
}