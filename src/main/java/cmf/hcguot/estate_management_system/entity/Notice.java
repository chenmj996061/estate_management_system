package cmf.hcguot.estate_management_system.entity;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Notice {
    private Integer id;

    private String content;

    @JsonFormat(pattern="yyyy年MM月dd日")
    private Date ndate;

    private String title;

    private String uper;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getNdate() {
        return ndate;
    }

    public void setNdate(Date ndate) {
        this.ndate = ndate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getUper() {
        return uper;
    }

    public void setUper(String uper) {
        this.uper = uper == null ? null : uper.trim();
    }

    public Notice() {
        super();
    }

    public Notice(String SParam) {
        this.id = JSON.parseObject(SParam).getInteger("id");
        this.content = JSON.parseObject(SParam).getString("content");
        this.ndate = JSON.parseObject(SParam).getDate("ndate");
        this.title = JSON.parseObject(SParam).getString("title");
        this.uper = JSON.parseObject(SParam).getString("uper");
    }
}