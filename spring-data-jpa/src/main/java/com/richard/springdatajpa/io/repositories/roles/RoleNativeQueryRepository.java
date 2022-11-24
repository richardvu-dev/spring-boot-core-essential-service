package com.richard.springdatajpa.io.repositories.roles;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.richard.springdatajpa.io.entities.RoleEntity;

@Repository
public interface RoleNativeQueryRepository extends JpaRepository<RoleEntity, UUID> {

  @Query(nativeQuery = true, value = "SELECT * FROM role WHERE id = :id AND is_delete = false")
  RoleEntity getRoleByIdUsingNativeQuery(UUID id);

}
