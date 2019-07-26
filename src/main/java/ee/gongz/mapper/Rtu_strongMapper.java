package ee.gongz.mapper;


import ee.gongz.beans.Rtu_strong;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Rtu_strongMapper {
    public List<Rtu_strong> getAll();

    public Rtu_strong getTwo(Integer dev_id,Integer area_id);

    public void insert(Rtu_strong rtu_strong);

    public boolean  update(Rtu_strong rtu_strong);

    public boolean  delete(Integer dev_id);

    public Rtu_strong getOne(Integer dev_id);

    public Rtu_strong decide(Integer dev_id);
}
