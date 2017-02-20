package watercup.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Ji on 2017/2/20.
 */
public class SysUser implements Serializable{
    private static final long serialVersionID=1L;
    /*用户ID*/
    private Long userId;
    /*用户名*/
    private String username;
    /*密码*/
    private transient String password;
    /*邮箱*/
    private String email;
    /*手机号*/
    private String mobile;
    /*状态 0:禁用 1:正常*/
    private Integer status;
    /*创建时间*/
    private Date createDate;

    public static long getSerialVersionID() {
        return serialVersionID;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
