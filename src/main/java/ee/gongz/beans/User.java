package ee.gongz.beans;

import java.io.Serializable;

import java.util.Date;

public class User implements Serializable {
    private Long area_id;
    private String user_name;
    private String password;
    private String mobile;
    private boolean enable;
    private String mail;
    private int role_id;
    private String remark;
    private Date login_time;
    private Date last_login_time;
    public User(){
        super();
    }
    public User(Long area_id,String user_name,String password,String mobile,boolean enable,String mail,int role_id,String remark,Date login_time,Date last_login_time){
        super();
        this.area_id=area_id;
        this.user_name=user_name;
        this.password=password;
        this.mobile=mobile;
        this.enable=enable;
        this.mail=mail;
        this.role_id=role_id;
        this.remark=remark;
        this.login_time=login_time;
        this.last_login_time=last_login_time;
    }

    public Long getArea_id() {
        return area_id;
    }

    public void setArea_id(Long area_id) {
        this.area_id = area_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getLogin_time() {
        return login_time;
    }

    public void setLogin_time(Date login_time) {
        this.login_time = login_time;
    }

    public Date getLast_login_time() {
        return last_login_time;
    }

    public void setLast_login_time(Date last_login_time) {
        this.last_login_time = last_login_time;
    }

    @Override
    public String toString(){
        return "area_id"+area_id+",user_name"+user_name+",password"+password+",mobile"+mobile+",enable"+mail+",role_id"+role_id+",remark"+remark+",login_time"+login_time+",last_login_time"+last_login_time;
    }
}

