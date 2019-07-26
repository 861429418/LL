package ee.gongz.serviceimpl;

import ee.gongz.beans.Rtu_strong;
import ee.gongz.mapper.Rtu_strongMapper;
import ee.gongz.service.Rtu_strongService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("rtu_strongService")
public class Rtu_strongServiceImpl implements Rtu_strongService {
    @Resource
    private Rtu_strongMapper rtu_strongMapper;

    @Override
    public void insert(Rtu_strong rtu_strong) {
        rtu_strongMapper.insert(rtu_strong);
    }

    @Override
    public List<Rtu_strong> getAll() {
        return rtu_strongMapper.getAll();
    }

    @Override
    public Rtu_strong getOne(Integer dev_id) {
        return rtu_strongMapper.getOne(dev_id);
    }
    @Override
    public Rtu_strong getTwo(Integer dev_id, Integer area_id) {
        return rtu_strongMapper.getTwo(dev_id, area_id);
    }

    @Override
    public boolean delete(Integer dev_id) {
        return rtu_strongMapper.delete(dev_id);
    }

    @Override
    public boolean update(Rtu_strong rtu_strong) {
        return rtu_strongMapper.update(rtu_strong);
    }

    @Override
    public Rtu_strong decide(Integer dev_id){
        return rtu_strongMapper.decide(dev_id);
    }
}
