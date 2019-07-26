package ee.gongz.beans;
import ee.gongz.beans.Equipment;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.*;
public class Rtu_strong implements Serializable {
    private Long dev_id;
    private Long area_id;
    private Long box_id;
    private Integer sim_card;
    private Long ip;
    private Long port;
    private String remark;
    public Rtu_strong(){
        super();
    }
    public Rtu_strong(Long dev_id,Long area_id,Long box_id,Integer sim_card,Long ip,Long port,String remark){

       /* super().getDev_id();
        super().setDev_id(dev_id);
        super().getArea_id();
        super().setArea_id(area_id);
        super().getBox_id();
        super().setBox_id(box_id);
        super().getRemark();
        super().setRemark(remark);*/

        //

       /* super(dev_id);
        this.dev_id=dev_id;
        super(area_id);
        this.area_id=area_id;
        super(box_id);
        this.box_id=box_id;
        super(remark);
        this.remark=remark;*/
        super();
        this.dev_id=dev_id;
        this.area_id=area_id;
        this.box_id=box_id;
        this.sim_card=sim_card;
        this.ip=ip;
        this.port=port;
        this.remark=remark;
    }
    public Long getDev_id(){return dev_id;}
    public void setDev_id(Long dev_id){this.dev_id=dev_id;}

    public Long getArea_id() {
        return area_id;
    }
    public void setArea_id(Long area_id){
        this.area_id=area_id;
    }

    public Long getBox_id() {
        return box_id;
    }
    public void setBox_id(Long box_id) {
        this.box_id = box_id;
    }
    public Integer getSim_card(){return sim_card;}
    public void setSim_card(Integer sim_card){this.sim_card=sim_card;}

    public Long getIp(){return ip;}
    public void setIp(Long ip){ this.ip=ip;}

    public Long getPort(){return port;}
    public void setPort( Long port){this.port=port;}

    public String getRemark(){return remark;}
    public void setRemark(String remark){this.remark=remark;}
    @Override
    public String toString(){
        return "dev_id"+dev_id+",area_id"+area_id+",box_id"+box_id+",sim_card"+sim_card+",ip"+ip+",port"+port+",remark"+remark;
    }
}
