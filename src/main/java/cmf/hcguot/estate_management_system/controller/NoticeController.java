package cmf.hcguot.estate_management_system.controller;

import cmf.hcguot.estate_management_system.entity.Notice;
import cmf.hcguot.estate_management_system.services.NoticeService;
import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class NoticeController {

    @Autowired
    NoticeService noticeService;

    @GetMapping("/findAllNotice")
    public List<Notice> findAllNotice(){
        return noticeService.findAllNotice();
    }

    @PostMapping(value = "/selectNoticeByPrimaryKey",produces = "application/json;charset=UTF-8")
    public Notice selectByPrimaryKey(@RequestBody String SParam){
        Integer id = JSON.parseObject(SParam).getInteger("id");
        return noticeService.selectByPrimaryKey(id);
    }

    @PostMapping(value = "/insertNoticeSelective",produces = "application/json;charset=UTF-8")
    public int insertSelective(@RequestBody String SParam){
        Notice notice = new Notice(SParam);
        return noticeService.insertSelective(notice);
    }

    @PostMapping(value = "/deleteNoticeByPrimaryKey",produces = "application/json;charset=UTF-8")
    public int deleteByPrimaryKey(@RequestBody String SParam){
        Integer id = JSON.parseObject(SParam).getInteger("id");
        return noticeService.deleteByPrimaryKey(id);
    }

    @PostMapping(value = "/updateNoticeByPrimaryKeySelective",produces = "application/json;charset=UTF-8")
    public int updateByPrimaryKeySelective(@RequestBody String SParam){
        Notice notice = new Notice(SParam);
        return noticeService.updateByPrimaryKeySelective(notice);
    }
}
