package cmf.hcguot.estate_management_system.controller;

import cmf.hcguot.estate_management_system.entity.Maintain;
import cmf.hcguot.estate_management_system.services.MaintainService;
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
public class MaintainController {

    @Autowired
    MaintainService maintainService;

    @GetMapping("/findAllMaintains")
    public List<Maintain> findAllMaintains(){
        return maintainService.findAllMaintains();
    }

    @PostMapping(value = "/insertMaintainSelective",produces = "application/json;charset=UTF-8")
    public int insertSelective(@RequestBody String SParam){
        Maintain maintain = new Maintain(SParam);
        return maintainService.insertSelective(maintain);
    }

    @PostMapping(value = "/selectMaintainByPrimaryKey",produces = "application/json;charset=UTF-8")
    public Maintain selectByPrimaryKey(@RequestBody String SParam){
        Integer id = JSON.parseObject(SParam).getInteger("id");
        return maintainService.selectByPrimaryKey(id);
    }

    @PostMapping(value = "/findMaintainByMaintainer",produces = "application/json;charset=UTF-8")
    public List<Maintain> findMaintainByMaintainer(@RequestBody String SParam){
        String maintainer = JSON.parseObject(SParam).getString("maintainer");
        return maintainService.findMaintainByMaintainer(maintainer);
    }

    @PostMapping(value = "/updateMaintainByPrimaryKeySelective",produces = "application/json;charset=UTF-8")
    public int updateByPrimaryKeySelective(@RequestBody String SParam){
        Maintain maintain = new Maintain(SParam);
        return maintainService.updateByPrimaryKeySelective(maintain);
    }

    @PostMapping(value = "/deleteMaintainByPrimaryKey",produces = "application/json;charset=UTF-8")
    public int deleteByPrimaryKey(@RequestBody String SParam){
        Integer id = JSON.parseObject(SParam).getInteger("id");
        return maintainService.deleteByPrimaryKey(id);
    }
}
