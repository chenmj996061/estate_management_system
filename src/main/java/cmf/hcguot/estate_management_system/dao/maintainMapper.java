package cmf.hcguot.estate_management_system.dao;

import cmf.hcguot.estate_management_system.entity.Maintain;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface maintainMapper {

    List<Maintain> findAllMaintains();

    List<Maintain> findMaintainByMaintainer(String maintainer);

    int deleteByPrimaryKey(Integer id);

    int insert(Maintain record);

    int insertSelective(Maintain record);

    Maintain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Maintain record);

    int updateByPrimaryKey(Maintain record);
}