package com.robin.service;

import com.robin.entity.Role;
import com.robin.entity.User;
import com.robin.repository.RoleRepository;
import com.robin.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    private final RoleRepository roleRepository;

    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public User addUser(User user){
        User createdUser = userRepository.save(user);
        if(null != createdUser.getRole() && null != createdUser.getRole().getUserRole())
        {
            System.out.println("User with Role " + createdUser.getRole().getUserRole() + " created");
        }
        else
        {
            // TODO : Make this generic
            Role role = roleRepository.findById(1L).get();
            createdUser.setRole(role);
            createdUser = userRepository.save(createdUser);
        }

        System.out.println("User Created " + createdUser.toString());
       return createdUser;
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).get();
    }
}