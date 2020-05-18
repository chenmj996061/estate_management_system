package cmf.hcguot.estate_management_system.entity;

import com.alibaba.fastjson.JSON;

public class custom_account {
    private Integer accountid;

    private String username;

    private String password;

    private String ownerid;

    private String carid;

    public Integer getAccountid() {
        return accountid;
    }

    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(String ownerid) {
        this.ownerid = ownerid == null ? null : ownerid.trim();
    }

    public String getCarid() {
        return carid;
    }

    public void setCarid(String carid) {
        this.carid = carid == null ? null : carid.trim();
    }

    public custom_account() {
        super();
    }

    public custom_account(String SParam) {
        this.accountid = JSON.parseObject(SParam).getInteger("accountid");
        this.username = JSON.parseObject(SParam).getString("username");
        this.password = JSON.parseObject(SParam).getString("password");
        this.ownerid = JSON.parseObject(SParam).getString("ownerid");
        this.carid = JSON.parseObject(SParam).getString("carid");
    }
}