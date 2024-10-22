package com.tasks.tasksapp.repository;

import com.tasks.tasksapp.model.RoleModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<RoleModel, Integer> {
    RoleModel findByRole(String roleName);
}
