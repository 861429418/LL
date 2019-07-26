package ee.gongz.serviceimpl;

import ee.gongz.beans.Rtu_weak;
import ee.gongz.mapper.Rtu_weakMapper;
import ee.gongz.service.Rtu_weakService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("rtu_weakService")
public class Rtu_weakServiceImpl implements Rtu_weakService {
    @Resource
    private Rtu_weakMapper rtu_weakMapper;

    @Override
    public void insert(Rtu_weak rtu_weak) {
        rtu_weakMapper.insert(rtu_weak);
    }

    @Override
    public List<Rtu_weak> getAll() {
        return rtu_weakMapper.getAll();
    }

    @Override
    public Rtu_weak getOne(Integer dev_id) {
        return rtu_weakMapper.getOne(dev_id);
    }
    @Override
    public Rtu_weak getTwo(Integer dev_id, Integer area_id) {
        return rtu_weakMapper.getTwo(dev_id, area_id);
    }

    @Override
    public boolean delete(Integer dev_id) {
        return rtu_weakMapper.delete(dev_id);
    }

    @Override
    public boolean update(Rtu_weak rtu_weak) {
        return rtu_weakMapper.update(rtu_weak);
    }

    @Override
    public Rtu_weak decide(Integer dev_id){
        return rtu_weakMapper.decide(dev_id);
    }
}

