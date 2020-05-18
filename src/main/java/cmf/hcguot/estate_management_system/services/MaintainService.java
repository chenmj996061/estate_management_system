package cmf.hcguot.estate_management_system.services;

import cmf.hcguot.estate_management_system.dao.maintainMapper;
import cmf.hcguot.estate_management_system.entity.Maintain;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class MaintainService {

    @Resource
    maintainMapper maintainMapper;

    public List<Maintain> findAllMaintains() {
        return maintainMapper.findAllMaintains();
    }


    public int insertSelective(Maintain maintain) {
        return maintainMapper.insertSelective(maintain);
    }


    public Maintain selectByPrimaryKey(Integer id) {
        return maintainMapper.selectByPrimaryKey(id);
    }


    public List<Maintain> findMaintainByMaintainer(String maintainer) {
        return maintainMapper.findMaintainByMaintainer(maintainer);
    }


    public int updateByPrimaryKeySelective(Maintain maintain) {
        return maintainMapper.updateByPrimaryKeySelective(maintain);
    }

    public int deleteByPrimaryKey(Integer id) {
        return maintainMapper.deleteByPrimaryKey(id);
    }
}
