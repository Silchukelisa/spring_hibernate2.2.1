package hiber.service;

import hiber.model.User;

import java.util.List;

public interface UserService {
    public User getUser();

    void add(User user);

    List<User> listUsers();
}
