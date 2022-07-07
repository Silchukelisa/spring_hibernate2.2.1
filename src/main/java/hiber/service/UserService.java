package hiber.service;

import hiber.model.User;

import java.util.List;

public interface UserService {
    public User getUser(int id);

    void add(User user);

    List<User> listUsers();
}
