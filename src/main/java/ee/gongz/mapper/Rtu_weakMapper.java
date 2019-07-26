package ee.gongz.mapper;
import ee.gongz.beans.Rtu_weak;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface Rtu_weakMapper {
    public List<Rtu_weak> getAll();

    public Rtu_weak getTwo(Integer dev_id,Integer area_id);

    public void insert(Rtu_weak rtu_weak);

    public boolean  update(Rtu_weak rtu_weak);

    public boolean  delete(Integer dev_id);

    public Rtu_weak getOne(Integer dev_id);

    public Rtu_weak decide(Integer dev_id);
}