package com.szaman.auth.service;

import com.szaman.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
