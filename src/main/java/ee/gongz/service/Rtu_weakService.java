package ee.gongz.service;
import ee.gongz.beans.Rtu_weak;
import java.util.List;

public interface Rtu_weakService {
    public List<Rtu_weak> getAll();

    public Rtu_weak getTwo(Integer dev_id,Integer area_id);

    public void insert(Rtu_weak rtu_weak);

    public boolean  update(Rtu_weak  rtu_weak);

    public boolean  delete(Integer dev_id);

    public Rtu_weak getOne(Integer dev_id);

    public Rtu_weak decide(Integer dev_id);
}
