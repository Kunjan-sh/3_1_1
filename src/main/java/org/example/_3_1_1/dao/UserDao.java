package org.example._3_1_1.dao;

import org.example._3_1_1.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    void updateUser(User user);

    void deleteUser(Integer id);

    List<User> getUsers();

    User getUser(Integer id);
}
