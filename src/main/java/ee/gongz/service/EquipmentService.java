package ee.gongz.service;

import ee.gongz.beans.Equipment;

import java.util.List;

public interface EquipmentService {

    public List<Equipment> getAll();

    public Equipment getTwo(Integer dev_id,Integer area_id);

    public void insert(Equipment equipment);

    public boolean  update(Equipment equipment);

    public boolean  delete(Integer dev_id);

    public Equipment getOne(Integer dev_id);

    public Equipment decide(Integer dev_id);
}
