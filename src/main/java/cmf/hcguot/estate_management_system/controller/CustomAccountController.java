package cmf.hcguot.estate_management_system.controller;

import cmf.hcguot.estate_management_system.entity.custom_account;
import cmf.hcguot.estate_management_system.services.CustomAccountService;
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
public class CustomAccountController {

    @Autowired
    CustomAccountService customAccountService;

    @GetMapping("/getCustom")
    public List<custom_account> getCustom(){
        return customAccountService.findAllCustomAccount();
    }

    @PostMapping(value = "/insertCustomSelective",produces = "application/json;charset=UTF-8")
    public int insertSelective(@RequestBody String SParam){
        custom_account c = new custom_account(SParam);
        return customAccountService.insertSelective(c);

    }

    @PostMapping(value = "/updateCustomByPrimaryKeySelective",produces = "application/json;charset=UTF-8")
    public int updateByPrimaryKeySelective(@RequestBody String SParam){
        custom_account c = new custom_account(SParam);
        return customAccountService.updateByPrimaryKeySelective(c);
    }

    @PostMapping(value = "/deleteCustomByPrimaryKey",produces = "application/json;charset=UTF-8")
    public int deleteByPrimaryKey(@RequestBody String SParam){
        Integer accountId = JSON.parseObject(SParam).getInteger("accountId");
        return customAccountService.deleteByPrimaryKey(accountId);

    }

    @PostMapping(value = "/findCustomByNP",produces = "application/json;charset=UTF-8")
    public custom_account findCustomByNP(@RequestBody String SParam){
        String name = JSON.parseObject(SParam).getString("name");
        String password = JSON.parseObject(SParam).getString("password");
        return customAccountService.findCustomByNP(name,password);
    }
}
