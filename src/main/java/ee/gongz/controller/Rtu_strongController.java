package ee.gongz.controller;


import com.github.pagehelper.PageHelper;
import ee.gongz.beans.Rtu_strong;
import ee.gongz.service.Rtu_strongService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class Rtu_strongController {
    @Resource
    private Rtu_strongService rtu_strongService;
    @RequestMapping("/getRtu_strongs")
    public List<Rtu_strong> getRtu_strongs(Integer pagenum) {
        PageHelper.startPage(pagenum,1);
        return rtu_strongService.getAll();
    }
    @RequestMapping("/getRtu_strong/{dev_id}/{area_id}")
    public Rtu_strong getRtu_strong(@PathVariable Integer dev_id,@PathVariable Integer area_id){
        return rtu_strongService.getTwo(dev_id,area_id);
    }
    @RequestMapping("/getRtu_strong/{dev_id}")
    public Rtu_strong getRtu_strong(@PathVariable Integer dev_id){
        return rtu_strongService.getOne(dev_id);
    }

    @RequestMapping("/addStrong")
    public String insert(Rtu_strong rtu_strong,Integer dev_id) {
        Rtu_strong rtu_strong1=rtu_strongService.decide(dev_id);
        if(rtu_strong1==null){
            if (rtu_strong!=null&&dev_id!=null){
                rtu_strong.setDev_id(rtu_strong.getDev_id());
                rtu_strong.setArea_id(rtu_strong.getArea_id());
                rtu_strong.setBox_id(rtu_strong.getBox_id());
                rtu_strong.setSim_card(rtu_strong.getSim_card());
                rtu_strong.setIp(rtu_strong.getIp());
                rtu_strong.setPort(rtu_strong.getPort());
                rtu_strong.setRemark(rtu_strong.getRemark());
                rtu_strongService.insert(rtu_strong);
            }
            return "添加成功";
        }else {
            return "该用户已存在,请重新输入用户名";
        }
    }

    @RequestMapping("/updateStrong")//value="update"
    public String update(Rtu_strong rtu_strong,Integer dev_id) {
        Rtu_strong rtu_strong2=rtu_strongService.decide(dev_id);
        if (rtu_strong2!=null){
            if (rtu_strong!=null&&dev_id!=null){
                Rtu_strong rtu_strong1=rtu_strongService.getOne(dev_id);
                rtu_strong1.setArea_id(rtu_strong.getArea_id());
                rtu_strong1.setBox_id(rtu_strong.getBox_id());
                rtu_strong1.setSim_card(rtu_strong.getSim_card());
                rtu_strong1.setIp(rtu_strong.getIp());
                rtu_strong1.setPort(rtu_strong.getPort());
                rtu_strong1.setRemark(rtu_strong.getRemark());
                rtu_strongService.update(rtu_strong);
            }
            return "修改成功";
        }else{
            return "该用户名不存在，请重新输入";
        }
    }
    @RequestMapping(value="/deleteStrong/{dev_id}")
    public void delete(@PathVariable("dev_id") Integer dev_id) {
        rtu_strongService.delete(dev_id);
    }





}
