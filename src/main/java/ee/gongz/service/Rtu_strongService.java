package ee.gongz.service;

import ee.gongz.beans.Rtu_strong;

import java.util.List;

public interface Rtu_strongService {
    public List<Rtu_strong> getAll();

    public Rtu_strong getTwo(Integer dev_id,Integer area_id);

    public void insert(Rtu_strong rtu_strong);

    public boolean  update(Rtu_strong rtu_strong);

    public boolean  delete(Integer dev_id);

    public Rtu_strong getOne(Integer dev_id);

    public Rtu_strong decide(Integer dev_id);
}
