package ee.gongz.beans;

import java.io.Serializable;

public class Box  implements Serializable {
    private Long box_id;
    private Long area_id;
    private String gps_type;
    private String name;
    private Double longitude;
    private Double latitude;
    private String remark;

    public Box(){
        super();
    }
    public Box(Long box_id,Long area_id,String gps_type,String name,Double longitude,Double latitude,String remark){
        super();
        this.box_id=box_id;
        this.area_id=area_id;
        this.gps_type=gps_type;
        this.name=name;
        this.longitude= longitude;
        this.latitude=latitude;
        this.remark=remark;
        /*this.remark=remark;
        this.login_time=login_time;
        this.last_login_time=last_login_time;*/
    }

    public Long getBox_id() {
        return box_id;
    }

    public void setBox_id(Long box_id) {
        this.box_id = box_id;
    }

    public Long getArea_id() {
        return area_id;
    }

    public void setArea_id(Long area_id) {
        this.area_id = area_id;
    }

    public String getGps_type() {
        return gps_type;
    }

    public void setGps_type(String gps_type) {
        this.gps_type = gps_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString(){
        return "box_id"+box_id+",area_id"+area_id+",gps_type"+gps_type+",name"+name+",longitude"+longitude+",latitude"+latitude+",remark"+remark;
    }
}
