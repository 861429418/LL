package ee.gongz.controller;

import java.util.List;
import com.github.pagehelper.PageHelper;
import ee.gongz.beans.User;
import ee.gongz.service.UserService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;


@RestController
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("/hello")
    public String hello(){
        return "hello,world";
    }
    @RequestMapping("/getUsers")
    public List<User>getUsers(Integer pagenum) {
        PageHelper.startPage(pagenum,1);
        return userService.getAll();
    }
    @RequestMapping("/getUser/{area_name}/{user_name}")
    public User getUser(@PathVariable String area_name,@PathVariable String user_name) {
        return userService.getTwo(user_name,area_name);
    }
    @RequestMapping("/getUser/{area_id}")
    public User getUser(@PathVariable Integer area_id){
        return userService.getOne(area_id);
    }

    @RequestMapping("/add")
    public String insert(User user,Integer area_id) {
        User user1=userService.decide(area_id);
        if(user1==null){
            if (user!=null&&area_id!=null){
                user.setArea_id(user.getArea_id());
                user.setUser_name(user.getUser_name());
                user.setPassword(user.getPassword());
                user.setMobile(user.getMobile());
                user.setEnable(user.isEnable());
                user.setMail(user.getMail());
                user.setRole_id(user.getRole_id());
                user.setRemark(user.getRemark());
                user.setLogin_time(user.getLogin_time());
                user.setLast_login_time(user.getLast_login_time());
                userService.insert(user);
            }
            return "添加成功";
        }else {
            return "该用户已存在,请重新输入用户名";
        }
    }


    @RequestMapping("/update")//value="update"
    public String update(User user,Integer area_id) {
        User user2=userService.decide(area_id);
        if (user2!=null){
            if (user!=null&&area_id!=null){
                User user1=userService.getOne(area_id);
                user1.setUser_name(user.getUser_name());
                user1.setPassword(user.getPassword());
                user1.setMobile(user.getMobile());
                user1.setEnable(user.isEnable());
                user1.setMail(user.getMail());
                user1.setRole_id(user.getRole_id());
                user1.setRemark(user.getRemark());
                user1.setLogin_time(user.getLogin_time());
                user1.setLast_login_time(user.getLast_login_time());
                userService.update(user);
            }
            return "修改成功";
        }else{
            return "该用户名不存在，请重新输入";
        }
    }

    @RequestMapping(value="/delete/{area_id}")
    public void delete(@PathVariable("area_id") Integer area_id) {
        userService.delete(area_id);
    }
}

