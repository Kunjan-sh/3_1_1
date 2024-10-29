package org.example._3_1_1.service;

import org.example._3_1_1.model.User;

import java.util.List;

public interface UserService {
    void addUser(String name, String surname, Integer age);

    void updateUser(Integer id, String name, String surname, Integer age);

    void deleteUser(Integer id);

    List<User> getUsers();
}
