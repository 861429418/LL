package ee.gongz.serviceimpl;

import ee.gongz.beans.User;
import ee.gongz.mapper.UserMapper;

import org.springframework.stereotype.Service;
import ee.gongz.service.UserService;
import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }

    @Override
    public User getOne(Integer area_id) {
        return userMapper.getOne(area_id);
    }
    @Override
    public User getTwo(String user_name, String area_name) {
        return userMapper.getTwo(user_name, area_name);
    }

    @Override
    public boolean delete(Integer area_id) {
        return userMapper.delete(area_id);
    }

    @Override
    public boolean update(User user) {
        return userMapper.update(user);
    }

    @Override
    public User decide(Integer area_id){
        return userMapper.decide(area_id);
    }
}
