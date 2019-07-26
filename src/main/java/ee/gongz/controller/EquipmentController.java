package ee.gongz.controller;

import com.github.pagehelper.PageHelper;
import ee.gongz.beans.Equipment;
import ee.gongz.service.EquipmentService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class EquipmentController {
    @Resource
    private EquipmentService equipmentService;
    @RequestMapping("/getEquipments")
    public List<Equipment>getEquipments(Integer pagenum){
        PageHelper.startPage(pagenum,1);
        return equipmentService.getAll();
    }
    @RequestMapping("/getEquipment/{dev_id}/{area_id}")
    public Equipment getEquipment(@PathVariable Integer dev_id,@PathVariable Integer area_id){
        return equipmentService.getTwo(dev_id,area_id);
    }
    @RequestMapping("/getEquipment/{dev_id}")
    public Equipment getEquipment(@PathVariable Integer dev_id){
        return equipmentService.getOne(dev_id);
    }
    @RequestMapping("/addEquipment")
    public String insert(Equipment equipment,Integer dev_id){
        Equipment equipment1=equipmentService.decide(dev_id);
        if(equipment1==null){
            if (equipment !=null&&dev_id !=null){
                equipment.setDev_id(equipment.getDev_id());
                equipment.setArea_id(equipment.getArea_id());
                equipment.setBox_id(equipment.getBox_id());
                equipment.setPhy_id(equipment.getPhy_id());
                equipment.setType(equipment.isType());
                equipment.setName(equipment.getName());
                equipment.setModel(equipment.getModel());
                equipment.setManufacturers(equipment.getManufacturers());
                equipment.setLocation(equipment.getLocation());
                equipment.setInstallation_time(equipment.getInstallation_time());
                equipment.setLongitude(equipment.getLongitude());
                equipment.setLatitude(equipment.getLatitude());
                equipment.setLocation_description(equipment.getLocation_description());
                equipment.setGis_type(equipment.isGis_type());
                equipment.setRemark(equipment.getRemark());
                equipmentService.insert(equipment);
            }
            return "添加成功";
        }else {
            return "该用户已存在，请重新输入用户名";
        }
    }
    @RequestMapping(value = "updateEquipment")
    public String update(Equipment equipment,Integer dev_id){
        Equipment equipment2=equipmentService.decide(dev_id);
        if(equipment2 !=null){
            if (equipment !=null&&dev_id!=null){
                Equipment equipment1=equipmentService.getOne(dev_id);
                equipment1.setArea_id(equipment.getArea_id());
                equipment1.setBox_id(equipment.getBox_id());
                equipment1.setPhy_id(equipment.getPhy_id());
                equipment1.setType(equipment.isType());
                equipment1.setName(equipment.getName());
                equipment1.setModel(equipment.getModel());
                equipment1.setManufacturers(equipment.getManufacturers());
                equipment1.setLocation(equipment.getLocation());
                equipment1.setInstallation_time(equipment.getInstallation_time());
                equipment1.setLongitude(equipment.getLongitude());
                equipment1.setLatitude(equipment.getLatitude());
                equipment1.setLocation_description(equipment.getLocation_description());
                equipment1.setGis_type(equipment.isGis_type());
                equipment1.setRemark(equipment.getRemark());
                equipmentService.update(equipment);
            }
            return "修改成功";
        }else {
            return "该用户名不存在，请重新输入";
        }
    }
    @RequestMapping(value="/deleteEquipment/{dev_id}")
    public void delete(@PathVariable("dev_id") Integer dev_id){equipmentService.delete(dev_id);}
}
