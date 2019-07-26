package ee.gongz.service;
import ee.gongz.beans.Box;
import java.util.List;

public interface BoxService {
    public List<Box> getAll();

    public Box getTwo(Integer box_id,Integer area_id);

    public void insert(Box box);

    public boolean  update(Box box);

    public boolean  delete(Integer box_id);

    public Box getOne(Integer box_id);

    public Box decide(Integer box_id);



}
