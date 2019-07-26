package ee.gongz.service;

import ee.gongz.beans.User;


import java.util.List;

public interface UserService {
    public List<User> getAll();

    public User getTwo(String user_name,String area_name);

    public void insert(User user);

    public boolean  update(User user);

    public boolean  delete(Integer area_id);

    public User getOne(Integer area_id);

    public User decide(Integer area_id);


}

