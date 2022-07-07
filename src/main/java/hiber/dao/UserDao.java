package hiber.dao;

import hiber.model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {
    public User getUser(int id);

    void add(User user);

    List<User> listUsers();
}
