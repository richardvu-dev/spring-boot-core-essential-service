package com.richard.springdatajpa.service.impl;

import java.util.Objects;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.richard.springdatajpa.apis.models.response.RoleRes;
import com.richard.springdatajpa.exception.ApplicationException;
import com.richard.springdatajpa.io.entities.RoleEntity;
import com.richard.springdatajpa.io.repositories.roles.RoleNativeQueryRepository;
import com.richard.springdatajpa.service.RoleService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class RoleServiceImpl implements RoleService {

  @Autowired
  private RoleNativeQueryRepository roleNativeQueryRepository;

  ModelMapper modelMapper = new ModelMapper();

  @Override
  public RoleRes getRoleByIdUsingNativeQuery(UUID id) {

    RoleEntity roleEntity = roleNativeQueryRepository.getRoleByIdUsingNativeQuery(id);
    if (Objects.isNull(roleEntity)) {
      log.error("ID {} is not found", id);
      throw new ApplicationException("ID " + id + " is not found", HttpStatus.BAD_REQUEST);
    }

    return modelMapper.map(roleEntity, RoleRes.class);
  }

}
