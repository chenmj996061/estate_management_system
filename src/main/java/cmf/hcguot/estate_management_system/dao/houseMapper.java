package cmf.hcguot.estate_management_system.dao;

import cmf.hcguot.estate_management_system.entity.House;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface houseMapper {

    List<House> findAllHouse();

    List<House> findAllHouseByOwnerid(Integer id);

    int deleteByPrimaryKey(Integer id);

    int insert(House record);

    int insertSelective(House record);

    House selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(House record);

    int updateByPrimaryKey(House record);
}