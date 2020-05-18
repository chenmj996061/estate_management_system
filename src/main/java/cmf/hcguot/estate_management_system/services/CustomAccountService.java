package cmf.hcguot.estate_management_system.services;

import cmf.hcguot.estate_management_system.dao.custom_accountMapper;
import cmf.hcguot.estate_management_system.entity.custom_account;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CustomAccountService {

    @Resource
    custom_accountMapper custom_accountMapper;


    public List<custom_account> findAllCustomAccount() {
        return custom_accountMapper.findAllCustom();
    }


    public int insertSelective(custom_account c) {
        return custom_accountMapper.insertSelective(c);
    }


    public int updateByPrimaryKeySelective(custom_account c) {
        return custom_accountMapper.updateByPrimaryKeySelective(c);
    }


    public int deleteByPrimaryKey(Integer accountId) {
        return custom_accountMapper.deleteByPrimaryKey(accountId);
    }


    public custom_account selectByPrimaryKey(Integer accountId) {
        return custom_accountMapper.selectByPrimaryKey(accountId);
    }


    public custom_account findCustomByNP(String username, String password) {
        return custom_accountMapper.findCustomByNP(username,password);
    }
}
