package cmf.hcguot.estate_management_system.services;

import cmf.hcguot.estate_management_system.dao.noticeMapper;
import cmf.hcguot.estate_management_system.entity.Notice;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class NoticeService {

    @Resource
    noticeMapper noticeMapper;

    public List<Notice> findAllNotice() {
        return noticeMapper.findAllNotice();
    }


    public Notice selectByPrimaryKey(Integer id) {
        return noticeMapper.selectByPrimaryKey(id);
    }


    public int insertSelective(Notice notice) {
        return noticeMapper.insertSelective(notice);
    }


    public int deleteByPrimaryKey(Integer id) {
        return noticeMapper.deleteByPrimaryKey(id);
    }


    public int updateByPrimaryKeySelective(Notice notice) {
        return noticeMapper.updateByPrimaryKeySelective(notice);
    }
}
