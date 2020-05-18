package cmf.hcguot.estate_management_system.services;


import cmf.hcguot.estate_management_system.dao.inspectionMapper;
import cmf.hcguot.estate_management_system.entity.Inspection;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class InspectionService {

    @Resource
    inspectionMapper inspectionMapper;

    public List<Inspection> findAllInspections() {
        return inspectionMapper.findAllInspection();
    }


    public int insertSelective(Inspection i) {
        return inspectionMapper.insertSelective(i);
    }


    public Inspection selectByPrimaryKey(Integer id) {
        return inspectionMapper.selectByPrimaryKey(id);
    }


    public int updateByPrimaryKeySelective(Inspection i) {
        return inspectionMapper.updateByPrimaryKeySelective(i);
    }


    public int deleteByPrimaryKey(Integer id) {
        return inspectionMapper.deleteByPrimaryKey(id);
    }
}
