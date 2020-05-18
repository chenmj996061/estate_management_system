package cmf.hcguot.estate_management_system.dao;

import cmf.hcguot.estate_management_system.entity.custom_account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface custom_accountMapper {

    List<custom_account> findAllCustom();

    int deleteByPrimaryKey(Integer accountid);

    int insert(custom_account record);

    int insertSelective(custom_account record);

    custom_account selectByPrimaryKey(Integer accountid);

    int updateByPrimaryKeySelective(custom_account record);

    int updateByPrimaryKey(custom_account record);

    custom_account findCustomByNP(String name,String password);
}