package cmf.hcguot.estate_management_system.entity;

import com.alibaba.fastjson.JSON;

public class Admin {
    private Integer id;

    private String name;

    private String password;

    private String sex;

    private Integer age;

    private String tel;

    private String phone;

    private String addr;

    private String memo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Admin() {
        super();
    }

    public Admin(String SParam) {
        this.id = JSON.parseObject(SParam).getInteger("id");
        this.name =JSON.parseObject(SParam).getString("name");
        this.password = JSON.parseObject(SParam).getString("password");
        this.sex = JSON.parseObject(SParam).getString("sex");
        this.age = JSON.parseObject(SParam).getInteger("age");
        this.tel = JSON.parseObject(SParam).getString("tel");
        this.phone = JSON.parseObject(SParam).getString("phone");
        this.addr = JSON.parseObject(SParam).getString("addr");
        this.memo = JSON.parseObject(SParam).getString("memo");
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", tel='" + tel + '\'' +
                ", phone='" + phone + '\'' +
                ", addr='" + addr + '\'' +
                ", memo='" + memo + '\'' +
                '}';
    }
}