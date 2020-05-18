package cmf.hcguot.estate_management_system.services;

import cmf.hcguot.estate_management_system.dao.adminMapper;
import cmf.hcguot.estate_management_system.entity.Admin;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdminService {

    @Resource
    adminMapper adminMapper;


    public List<Admin> findAllAdmins() {
        return adminMapper.findAllAdmin();
    }


    public int insertSelective(Admin a) {
        return adminMapper.insertSelective(a);
    }


    public Admin selectByPrimaryKey(int id) {
        return adminMapper.selectByPrimaryKey(id);
    }


    public Admin findAdminByNP(String name, String password) {
        return adminMapper.findAdminByNP(name,password);
    }


    public int updateByPrimaryKeySelective(Admin a) {
        return adminMapper.updateByPrimaryKeySelective(a);
    }

    public int deleteByPrimaryKey(int id) {
        return adminMapper.deleteByPrimaryKey(id);
    }
}
