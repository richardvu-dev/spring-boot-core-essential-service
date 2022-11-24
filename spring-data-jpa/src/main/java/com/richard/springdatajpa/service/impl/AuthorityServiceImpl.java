package com.richard.springdatajpa.service.impl;

import java.util.Objects;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.richard.springdatajpa.apis.models.response.AuthorityRes;
import com.richard.springdatajpa.exception.ApplicationException;
import com.richard.springdatajpa.io.entities.AuthorityEntity;
import com.richard.springdatajpa.io.repositories.authories.AuthorityNativeQueryRepository;
import com.richard.springdatajpa.service.AuthorityService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class AuthorityServiceImpl implements AuthorityService {

  @Autowired
  private AuthorityNativeQueryRepository authorityNativeQueryRepository;

  ModelMapper modelMapper = new ModelMapper();

  @Override
  public AuthorityRes getAuthorityByIdUsingNativeQuery(UUID id) {

    AuthorityEntity authorityEntity = authorityNativeQueryRepository.getAuthorityByIdUsingNativeQuery(id);
    if (Objects.isNull(authorityEntity)) {
      log.error("ID {} is not found", id);
      throw new ApplicationException("ID " + id + " is not found", HttpStatus.BAD_REQUEST);
    }
    return modelMapper.map(authorityEntity, AuthorityRes.class);

  }

  @Override
  public AuthorityRes getAllAuthorityUsingNativeQuery() {
    return null;
  }

}
