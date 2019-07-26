package ee.gongz.beans;

import java.io.Serializable;
import java.util.Date;
public class Equipment implements Serializable {
    private Long dev_id;
    private Long area_id;
    private Long box_id;
    private Long phy_id;
    private boolean type;
    private String name;
    private String model;
    private String manufacturers;
    private String location;
    private Date installation_time;
    private Double longitude;
    private Double latitude;
    private String location_description;
    private boolean gis_type;
    private String remark;
    public Equipment(){
        super();
    }
    public Equipment(Long dev_id,Long area_id,Long box_id,Long phy_id,boolean type, String name,String model,String manufacturers, String location,Date installation_time,Double longitude,Double latitude,String location_description,boolean gis_type, String remark){
        super();
        this.dev_id=dev_id;
        this.area_id=area_id;
        this.box_id=box_id;
        this.phy_id=phy_id;
        this.type=type;
        this.name=name;
        this.model=model;
        this.manufacturers=manufacturers;
        this.location=location;
        this.installation_time=installation_time;
        this.longitude=longitude;
        this.latitude=latitude;
        this.location_description=location_description;
        this.gis_type=gis_type;
        this.remark=remark;
    }
    public Long getDev_id(){return dev_id;}
    public void setDev_id(Long dev_id) {
        this.dev_id = dev_id;
    }

    public Long getArea_id() {
        return area_id;
    }
    public void setArea_id(Long area_id) {
        this.area_id = area_id;
    }

    public Long getBox_id() {
        return box_id;
    }
    public void setBox_id(Long box_id) {
        this.box_id = box_id;
    }

    public Long getPhy_id() {
        return phy_id;
    }
    public void setPhy_id(Long phy_id) {
        this.phy_id = phy_id;
    }

    public boolean isType() {
        return type;
    }
    public void setType(boolean type) {
        this.type = type;
    }

    public String getName(){return name;}
    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturers() {
        return manufacturers;
    }
    public void setManufacturers(String manufacturers) {
        this.manufacturers = manufacturers;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public Date getInstallation_time() {
        return installation_time;
    }
    public void setInstallation_time(Date installation_time) {
        this.installation_time = installation_time;
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

    public String getLocation_description() {
        return location_description;
    }
    public void setLocation_description(String location_description) {
        this.location_description = location_description;
    }

    public boolean isGis_type() {
        return gis_type;
    }
    public void setGis_type(boolean gis_type) {
        this.gis_type = gis_type;
    }

    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    @Override
    public String toString(){
        return "dev_id"+dev_id+",area_id"+area_id+
                ",box_id"+box_id+",phy_id"+phy_id+",type"+type+",name"+name+
                ",model"+model+",manufacturers"+manufacturers+",location"+location+
                ",installation_time"+installation_time+",longitude"+longitude+
                ",latitude"+latitude+",location_description"+location_description+
                ",gis_type"+gis_type+",remark"+remark;
    }
}
