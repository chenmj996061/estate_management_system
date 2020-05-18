package cmf.hcguot.estate_management_system.dao;

import cmf.hcguot.estate_management_system.entity.Notice;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface noticeMapper {

    List<Notice> findAllNotice();

    int deleteByPrimaryKey(Integer id);

    int insert(Notice record);

    int insertSelective(Notice record);

    Notice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Notice record);

    int updateByPrimaryKey(Notice record);
}