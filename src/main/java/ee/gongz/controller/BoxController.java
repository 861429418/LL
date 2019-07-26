package ee.gongz.controller;

import java.util.List;

import com.github.pagehelper.PageHelper;
import ee.gongz.beans.Box;
import ee.gongz.service.BoxService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;


@RestController
public class BoxController {
    @Resource
    private BoxService boxService;
    /*@RequestMapping("/getUser/{box_id}")
    public User getUser(@PathVariable Integer box_id) {
        return userService.getOne(area_id);
    }*/
    @RequestMapping("/getBoxs")
    public List<Box> getBoxs(Integer pagenum) {
        PageHelper.startPage(pagenum,1);
        return boxService.getAll();
    }

    @RequestMapping("/getBox/{box_id}/{area_id}")
    public Box getBox(@PathVariable Integer box_id, @PathVariable Integer area_id) {
        return boxService.getTwo(box_id,area_id);
    }

    @RequestMapping("/getBox/{box_id}")
    public Box getBox(@PathVariable Integer box_id) {
        return boxService.getOne(box_id);
    }

    @RequestMapping("/addBox")
    public String insert(Box box, Integer box_id) {
        Box box1 = boxService.decide(box_id);
        if (box1 == null) {
            if (box != null && box_id != null) {
                box.setBox_id(box.getBox_id());
                box.setArea_id(box.getArea_id());
                box.setGps_type(box.getGps_type());
                box.setName(box.getName());
                box.setLongitude(box.getLongitude());
                box.setLatitude(box.getLatitude());
                box.setRemark(box.getRemark());
                boxService.insert(box);
            }
            return "添加成功";
        }else{
            return "该用户已存在，请重新输入用户名";
        }
    }
    @RequestMapping(value = "updateBox")
    public String update(Box box, Integer box_id) {
        Box box2 = boxService.decide(box_id);
        if (box2 != null) {
            if (box != null && box_id != null) {
                Box box1 = boxService.getOne(box_id);
                box1.setArea_id(box.getArea_id());
                box1.setGps_type(box.getGps_type());
                box1.setName(box.getName());
                box1.setLongitude(box.getLongitude());
                box1.setLatitude(box.getLatitude());
                box1.setRemark(box.getRemark());
                boxService.update(box);
            }
            return "修改成功";
        } else {
            return "该用户名不存在，请重新输入";
        }
    }

    @RequestMapping(value = "/deleteBox/{box_id}")
    public void delete(@PathVariable("box_id") Integer box_id) {
        boxService.delete(box_id);
    }

}

