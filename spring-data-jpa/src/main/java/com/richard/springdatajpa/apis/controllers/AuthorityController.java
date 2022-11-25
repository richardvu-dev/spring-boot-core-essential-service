package com.richard.springdatajpa.apis.controllers;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.richard.springdatajpa.apis.models.response.AuthorityRes;
import com.richard.springdatajpa.service.AuthorityService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/authorities")
@Tag(name = "Authorities", description = "Authority Controller")
public class AuthorityController {

  @Autowired
  private AuthorityService authorityService;

  @GetMapping("/by-id/{id}")
  @Operation(summary = "Get Authority", description = "Get Authority by id")
  public ResponseEntity<AuthorityRes> getAuthorityByIdUsingNativeQuery(@PathVariable(name = "id") UUID id) {
    AuthorityRes authorityRes = authorityService.getAuthorityByIdUsingNativeQuery(id);
    return new ResponseEntity<>(authorityRes, HttpStatus.OK);
  }

}
