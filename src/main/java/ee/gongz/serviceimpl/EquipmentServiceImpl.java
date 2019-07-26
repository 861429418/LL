package ee.gongz.serviceimpl;

import ee.gongz.beans.Equipment;
import ee.gongz.mapper.EquipmentMapper;
import ee.gongz.service.EquipmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("equipmentService")
public class EquipmentServiceImpl implements EquipmentService {
    @Resource
    private EquipmentMapper equipmentMapper;

    @Override
    public void insert(Equipment equipment){equipmentMapper.insert(equipment);}

    @Override
    public List<Equipment> getAll(){return equipmentMapper.getAll();}

    @Override
    public Equipment getOne(Integer dev_id){return equipmentMapper.getOne(dev_id);}

    @Override
    public Equipment getTwo(Integer dev_id,Integer area_id){return equipmentMapper.getTwo(dev_id,area_id);}

    @Override
    public boolean  delete(Integer dev_id){return equipmentMapper.delete(dev_id);}

    @Override
    public boolean  update(Equipment equipment){return equipmentMapper.update(equipment);}

    @Override
    public Equipment decide(Integer dev_id){return equipmentMapper.decide(dev_id);}
}
