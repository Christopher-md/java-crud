package com.prisbank.api.service;

import com.prisbank.api.entity.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserService {
    List<User> findAllUser();
    Optional<User> findById(UUID id);
    User saveUser(User user);
    User updateUser(User user);
    void deleteUser(UUID id);
}
