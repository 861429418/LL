package ee.gongz.serviceimpl;

import ee.gongz.beans.Box;
import ee.gongz.mapper.BoxMapper;
import ee.gongz.service.BoxService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;//实现类

@Service("boxService")
public class BoxServiceImpl implements BoxService {
    @Resource
    private BoxMapper boxMapper;

    @Override
    public void insert(Box user) {
        boxMapper.insert(user);
    }

    @Override
    public List<Box> getAll() {
        return boxMapper.getAll();
    }

    @Override
    public Box getOne(Integer box_id) {
        return boxMapper.getOne(box_id);
    }

    @Override
    public boolean delete(Integer box_id) {
        return boxMapper.delete(box_id);
    }

    @Override
    public boolean update(Box user) {
        return boxMapper.update(user);
    }

    @Override
    public Box decide(Integer box_id){
        return boxMapper.decide(box_id);
    }

    @Override
    public Box getTwo(Integer box_id,Integer area_id) {
        return boxMapper.getTwo(box_id, area_id);
    }
}


