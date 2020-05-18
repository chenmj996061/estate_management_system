package cmf.hcguot.estate_management_system.controller;

import cmf.hcguot.estate_management_system.entity.Inspection;
import cmf.hcguot.estate_management_system.services.InspectionService;
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
public class InspectionController {

    @Autowired
    InspectionService inspectionService;

    @GetMapping("/findAllInspections")
    public List<Inspection> findAllInspections(){
        return inspectionService.findAllInspections();
    }

    @PostMapping(value = "/insertInspectionSelective",produces = "application/json;charset=UTF-8")
    public int insertSelective(@RequestBody String SParam){
        Inspection inspection = new Inspection(SParam);
        return inspectionService.insertSelective(inspection);
    }

    @PostMapping(value = "/selectInspectionByPrimaryKey",produces = "application/json;charset=UTF-8")
    public Inspection selectByPrimaryKey(@RequestBody String SParam){
        Integer id = JSON.parseObject(SParam).getInteger("id");
        return inspectionService.selectByPrimaryKey(id);
    }

    @PostMapping(value = "/updateInspectionByPrimaryKeySelective",produces = "application/json;charset=UTF-8")
    public int updateByPrimaryKeySelective(@RequestBody String SParam){
        Inspection inspection = new Inspection(SParam);
        return inspectionService.updateByPrimaryKeySelective(inspection);
    }

    @PostMapping(value = "/deleteInspectionByPrimaryKey",produces = "application/json;charset=UTF-8")
    public int deleteByPrimaryKey(@RequestBody String SParam){
        Integer id = JSON.parseObject(SParam).getInteger("id");
        return inspectionService.deleteByPrimaryKey(id);
    }
}
