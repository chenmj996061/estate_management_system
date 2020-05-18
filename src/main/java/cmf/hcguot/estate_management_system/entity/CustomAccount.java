package cmf.hcguot.estate_management_system.entity;

public class CustomAccount {

    private int accountid;
    private String username;
    private String password;
    private String owerid;
    private String carid;

    public int getAccountid() {
        return accountid;
    }

    public void setAccountid(int accountid) {
        this.accountid = accountid;
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

    public String getOwerid() {
        return owerid;
    }

    public void setOwerid(String owerid) {
        this.owerid = owerid;
    }

    public String getCarid() {
        return carid;
    }

    public void setCarid(String carid) {
        this.carid = carid;
    }
}
