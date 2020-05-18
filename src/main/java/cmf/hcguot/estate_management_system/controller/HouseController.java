package cmf.hcguot.estate_management_system.controller;

import cmf.hcguot.estate_management_system.entity.House;
import cmf.hcguot.estate_management_system.services.HouseService;
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
public class HouseController {

    @Autowired
    HouseService houseService;

    @GetMapping("/findAllHouses")
    public List<House> findAllHouse(){
        List<House> houseList = houseService.findAllHouse();
        return houseList;
    }

    @PostMapping( value = "/findHouseByOwnerid",produces = "application/json;charset=UTF-8")
    public List<House> findAllHouseByOwnerid(@RequestBody String SParam){
        Integer id = JSON.parseObject(SParam).getInteger("id");
        return houseService.findAllHouseByOwnerid(id);
    }

    @PostMapping(value = "/findHouseById",produces = "application/json;charset=UTF-8")
    public House findById(@RequestBody String SParam){
        Integer id = JSON.parseObject(SParam).getInteger("id");
        return houseService.findById(id);
    }

    @PostMapping(value = "/insertHouseSelective",produces = "application/json;charset=UTF-8")
    public int insertSelective(@RequestBody String SParam){
        House house = new House(SParam);
        return houseService.insertSelective(house);
    }

    @PostMapping(value = "/deleteHouseByPrimaryKey",produces = "application/json;charset=UTF-8")
    public int deleteByPrimaryKey(@RequestBody String SParam){
        Integer id = JSON.parseObject(SParam).getInteger("id");
        return houseService.deleteByPrimaryKey(id);
    }

    @PostMapping(value = "/updateHouseByPrimaryKeySelective",produces = "application/json;charset=UTF-8")
    public int updateByPrimaryKeySelective(@RequestBody String SParam){
        House house = new House(SParam);
        return houseService.updateByPrimaryKeySelective(house);
    }
}
