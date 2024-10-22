package com.tasks.tasksapp.service;


import com.tasks.tasksapp.model.RoleModel;
import com.tasks.tasksapp.repository.RoleRepository;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }


    public RoleModel  indByRoleName(String roleName) {
      return  roleRepository.findByRole(roleName);
    }
}
