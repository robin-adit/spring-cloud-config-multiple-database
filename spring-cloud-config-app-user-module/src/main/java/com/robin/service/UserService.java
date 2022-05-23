package com.robin.service;

import com.robin.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserService{

    public User addUser(User user);

    public User getUserById(Long id);
}
