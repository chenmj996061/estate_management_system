package cmf.hcguot.estate_management_system.entity;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Maintain {
    private Integer id;

    private String thing;

    private String status;

    private String homesnumber;

    @JsonFormat(pattern="yyyy年MM月dd日")
    private Date sdate;

    @JsonFormat(pattern="yyyy年MM月dd日")
    private Date rdate;

    private Double tcost;

    private Double scost;

    private String maintainer;

    private String smemo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getThing() {
        return thing;
    }

    public void setThing(String thing) {
        this.thing = thing == null ? null : thing.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getHomesnumber() {
        return homesnumber;
    }

    public void setHomesnumber(String homesnumber) {
        this.homesnumber = homesnumber == null ? null : homesnumber.trim();
    }

    public Date getSdate() {
        return sdate;
    }

    public void setSdate(Date sdate) {
        this.sdate = sdate;
    }

    public Date getRdate() {
        return rdate;
    }

    public void setRdate(Date rdate) {
        this.rdate = rdate;
    }

    public Double getTcost() {
        return tcost;
    }

    public void setTcost(Double tcost) {
        this.tcost = tcost;
    }

    public Double getScost() {
        return scost;
    }

    public void setScost(Double scost) {
        this.scost = scost;
    }

    public String getMaintainer() {
        return maintainer;
    }

    public void setMaintainer(String maintainer) {
        this.maintainer = maintainer == null ? null : maintainer.trim();
    }

    public String getSmemo() {
        return smemo;
    }

    public void setSmemo(String smemo) {
        this.smemo = smemo == null ? null : smemo.trim();
    }

    public Maintain() {
        super();
    }

    public Maintain(String SParam) {
        this.id = JSON.parseObject(SParam).getInteger("id");
        this.thing = JSON.parseObject(SParam).getString("thing");
        this.status = JSON.parseObject(SParam).getString("status");
        this.homesnumber = JSON.parseObject(SParam).getString("homesnumber");
        this.sdate = JSON.parseObject(SParam).getDate("sdate");
        this.rdate = JSON.parseObject(SParam).getDate("rdate");
        this.tcost = JSON.parseObject(SParam).getDouble("tcost");
        this.scost = JSON.parseObject(SParam).getDouble("scost");
        this.maintainer = JSON.parseObject(SParam).getString("maintainer");
        this.smemo = JSON.parseObject(SParam).getString("smemo");
    }
}