package com.robin.controller;

import com.robin.entity.Role;
import com.robin.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("/roles")
    public List<Role> getAllRoles()
    {
        return roleService.getAllRoles();
    }
}