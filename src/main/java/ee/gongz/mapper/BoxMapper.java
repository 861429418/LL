package ee.gongz.mapper;

import org.springframework.web.bind.annotation.Mapping;
import ee.gongz.beans.Box;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper

public interface BoxMapper{
    public List<Box> getAll();

    public Box getTwo(Integer box_id,Integer area_id);

    public void insert(Box box);

    public boolean  update(Box box);

    public boolean  delete(Integer box_id);

    public Box getOne(Integer box_id);

    public Box decide(Integer box_id);




}
