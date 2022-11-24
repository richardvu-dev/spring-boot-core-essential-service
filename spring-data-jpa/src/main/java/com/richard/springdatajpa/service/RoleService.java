package com.richard.springdatajpa.service;

import java.util.UUID;

import com.richard.springdatajpa.apis.models.response.RoleRes;

public interface RoleService {

  RoleRes getRoleByIdUsingNativeQuery(UUID id);
  
}
