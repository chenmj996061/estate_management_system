package cmf.hcguot.estate_management_system.controller;

import cmf.hcguot.estate_management_system.entity.Admin;
import cmf.hcguot.estate_management_system.services.AdminService;
import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class AdminController {

    @Autowired
    AdminService adminService;

    @GetMapping("/findAllAdmins")
    public List<Admin> findAllAdmins(){
        List<Admin> list = adminService.findAllAdmins();
        return list;
    }

    @PostMapping(value = "/insertAdminSelective",produces = "application/json;charset=UTF-8")
    public int insertSelective(@RequestBody String SParam){
        Admin admin = new Admin(SParam);
        return adminService.insertSelective(admin);

    }

    @PostMapping(value = "/updateAdminByPrimaryKeySelective",produces = "application/json;charset=UTF-8")
    public int updateByPrimaryKeySelective(@RequestBody String SParam){
        Admin admin = new Admin(SParam);
        return adminService.updateByPrimaryKeySelective(admin);
    }

    @PostMapping(value = "/deleteAdminByPrimaryKey",produces = "application/json;charset=UTF-8")
    public int deleteByPrimaryKey(@RequestBody String SParam){
        Integer id = Integer.parseInt(JSON.parseObject(SParam).get("id").toString());
        return adminService.deleteByPrimaryKey(id);
    }

    @PostMapping(value = "/selectAdmin",produces = "application/json;charset=UTF-8")
    public Admin selectAdmin(@RequestBody String SParam){
        Integer id = Integer.parseInt(JSON.parseObject(SParam).get("id").toString());
        return adminService.selectByPrimaryKey(id);
    }

    @PostMapping(value = "/findAdminByNP",produces = "application/json;charset=UTF-8")
    public Admin findAdminByNP(@RequestBody String SParam){
        String name = JSON.parseObject(SParam).getString("name");
        String password = JSON.parseObject(SParam).getString("password");
        Admin admin = adminService.findAdminByNP(name,password);
        return admin;
    }
}
