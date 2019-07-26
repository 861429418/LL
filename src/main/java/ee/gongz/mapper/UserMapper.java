package ee.gongz.mapper;

import ee.gongz.beans.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.Mapping;


import java.util.List;
@Mapper
public interface UserMapper{
    public List<User> getAll();

    public User getTwo(String user_name,String area_name);

    public void insert(User user);

    public boolean  update(User user);

    public boolean  delete(Integer area_id);

    public User getOne(Integer area_id);

    public User decide(Integer area_id);


}
