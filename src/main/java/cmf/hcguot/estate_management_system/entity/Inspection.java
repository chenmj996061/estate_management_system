package cmf.hcguot.estate_management_system.entity;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Inspection {
    private Integer id;

    private String person;

    private String type;

    @JsonFormat(pattern="yyyy年MM月dd日")
    private Date itime;

    private String conductor;

    private String party;

    private String result;

    private String memo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person == null ? null : person.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getItime() {
        return itime;
    }

    public void setItime(Date itime) {
        this.itime = itime;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor == null ? null : conductor.trim();
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party == null ? null : party.trim();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Inspection() {
        super();
    }

    public Inspection(String SParam) {
        this.id = JSON.parseObject(SParam).getInteger("id");
        this.person = JSON.parseObject(SParam).getString("person");
        this.type = JSON.parseObject(SParam).getString("type");
        this.itime = JSON.parseObject(SParam).getDate("itime");
        this.conductor = JSON.parseObject(SParam).getString("conductor");
        this.party = JSON.parseObject(SParam).getString("party");
        this.result = JSON.parseObject(SParam).getString("result");
        this.memo = JSON.parseObject(SParam).getString("memo");
    }
}