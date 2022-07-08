package hiber.dao;

import hiber.model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {
    public User getUser(String model,int series);

    void add(User user);

    List<User> listUsers();
}
