package ee.gongz.controller;

import com.github.pagehelper.PageHelper;
import ee.gongz.beans.Rtu_weak;
import ee.gongz.service.Rtu_weakService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class Rtu_weakController {
    @Resource
    private Rtu_weakService rtu_weakService;
    @RequestMapping("/getRtu_weaks")
    public List<Rtu_weak> getRtu_weaks(Integer pagenum) {
        PageHelper.startPage(pagenum,1);
        return rtu_weakService.getAll();
    }
    @RequestMapping("/getRtu_weak/{dev_id}/{area_id}")
    public Rtu_weak getRtu_weak(@PathVariable Integer dev_id,@PathVariable Integer area_id){
        return rtu_weakService.getTwo(dev_id,area_id);
    }
    @RequestMapping("/getRtu_weak/{dev_id}")
    public Rtu_weak getRtu_weak(@PathVariable Integer dev_id){
        return rtu_weakService.getOne(dev_id);
    }

    @RequestMapping("/addWeak")
    public String insert(Rtu_weak rtu_weak,Integer dev_id) {
        Rtu_weak rtu_weak1=rtu_weakService.decide(dev_id);
        if(rtu_weak1==null){
            if (rtu_weak != null && dev_id != null){
                rtu_weak.setDev_id(rtu_weak.getDev_id());
                rtu_weak.setArea_id(rtu_weak.getArea_id());
                rtu_weak.setBox_id(rtu_weak.getBox_id());
                rtu_weak.setSim_card(rtu_weak.getSim_card());
                rtu_weak.setIp(rtu_weak.getIp());
                rtu_weak.setPort(rtu_weak.getPort());
                rtu_weak.setRemark(rtu_weak.getRemark());
                rtu_weakService.insert(rtu_weak);
            }
            return "添加成功";
        }else {
            return "该用户已存在,请重新输入用户名";
        }
    }

    @RequestMapping("/updateWeak")//value="update"
    public String update(Rtu_weak rtu_weak,Integer dev_id) {
        Rtu_weak rtu_weak2=rtu_weakService.decide(dev_id);
        if (rtu_weak2!=null){
            if (rtu_weak!=null&&dev_id!=null){
                Rtu_weak rtu_weak1=rtu_weakService.getOne(dev_id);
                rtu_weak1.setArea_id(rtu_weak.getArea_id());
                rtu_weak1.setBox_id(rtu_weak.getBox_id());
                rtu_weak1.setSim_card(rtu_weak.getSim_card());
                rtu_weak1.setIp(rtu_weak.getIp());
                rtu_weak1.setPort(rtu_weak.getPort());
                rtu_weak1.setRemark(rtu_weak.getRemark());
                rtu_weakService.update(rtu_weak);
            }
            return "修改成功";
        }else{
            return "该用户名不存在，请重新输入";
        }
    }
    @RequestMapping(value="/deleteWeak/{dev_id}")
    public void delete(@PathVariable("dev_id") Integer dev_id) {
        rtu_weakService.delete(dev_id);
    }





}

