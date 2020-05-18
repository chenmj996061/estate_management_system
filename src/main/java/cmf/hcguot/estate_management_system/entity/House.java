package cmf.hcguot.estate_management_system.entity;

import com.alibaba.fastjson.JSON;

public class House {

    private Integer id;
    //门牌号
    private String num;
    //楼号
    private String dep;
    //类型
    private String type;
    //地区
    private String area;
    //出售状况
    private String sell;
    //单元
    private String unit;
    //楼层
    private String floor;
    //朝向
    private String direction;
    //备注
    private String memo;
    //业主编号
    private String ownerid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num == null ? null : num.trim();
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep == null ? null : dep.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getSell() {
        return sell;
    }

    public void setSell(String sell) {
        this.sell = sell == null ? null : sell.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor == null ? null : floor.trim();
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction == null ? null : direction.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(String ownerid) {
        this.ownerid = ownerid == null ? null : ownerid.trim();
    }

    public House() {
        super();
    }

    public House(String SParam) {
        this.id = JSON.parseObject(SParam).getInteger("id");
        this.num = JSON.parseObject(SParam).getString("num");
        this.dep = JSON.parseObject(SParam).getString("dep");
        this.type = JSON.parseObject(SParam).getString("type");
        this.area = JSON.parseObject(SParam).getString("area");
        this.sell = JSON.parseObject(SParam).getString("sell");
        this.unit = JSON.parseObject(SParam).getString("unit");
        this.floor = JSON.parseObject(SParam).getString("floor");
        this.direction = JSON.parseObject(SParam).getString("direction");
        this.memo = JSON.parseObject(SParam).getString("memo");
        this.ownerid = JSON.parseObject(SParam).getString("ownerid");
    }
}