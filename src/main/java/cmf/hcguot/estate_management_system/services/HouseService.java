package cmf.hcguot.estate_management_system.services;

import cmf.hcguot.estate_management_system.dao.houseMapper;
import cmf.hcguot.estate_management_system.entity.House;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class HouseService {

    @Resource
    houseMapper houseMapper;

    public List<House> findAllHouse(){
        return houseMapper.findAllHouse();
    }

    public List<House> findAllHouseByOwnerid(Integer id) {
        return houseMapper.findAllHouseByOwnerid(id);
    }


    public House findById(Integer id) {
        return houseMapper.selectByPrimaryKey(id);
    }


    public int insertSelective(House h) {
        return houseMapper.insertSelective(h);
    }


    public int deleteByPrimaryKey(Integer id) {
        return houseMapper.deleteByPrimaryKey(id);
    }


    public int updateByPrimaryKeySelective(House h) {
        return houseMapper.updateByPrimaryKeySelective(h);
    }
}
