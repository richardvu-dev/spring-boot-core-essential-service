package com.richard.springdatajpa.service;

import java.util.UUID;

import com.richard.springdatajpa.apis.models.response.AuthorityRes;

public interface AuthorityService {

  AuthorityRes getAuthorityByIdUsingNativeQuery(UUID id);

  AuthorityRes getAllAuthorityUsingNativeQuery();
  
}
