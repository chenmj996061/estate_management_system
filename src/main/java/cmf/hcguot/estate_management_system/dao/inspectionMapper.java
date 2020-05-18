package cmf.hcguot.estate_management_system.dao;

import cmf.hcguot.estate_management_system.entity.Inspection;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface inspectionMapper {

    List<Inspection> findAllInspection();

    int deleteByPrimaryKey(Integer id);

    int insert(Inspection record);

    int insertSelective(Inspection record);

    Inspection selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Inspection record);

    int updateByPrimaryKey(Inspection record);
}