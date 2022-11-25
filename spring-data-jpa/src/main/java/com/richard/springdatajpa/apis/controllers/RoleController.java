package com.richard.springdatajpa.apis.controllers;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.richard.springdatajpa.apis.models.response.RoleRes;
import com.richard.springdatajpa.service.RoleService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/role")
@Tag(name = "Role", description = "Role Controller")
public class RoleController {

  @Autowired
  private RoleService roleService;

  @GetMapping("/by-id/{id}")
  @Operation(summary = "Get Role", description = "Get Role By Id Using Native Query")
  public ResponseEntity<RoleRes> getRoleByIdUsingNativeQuery(@PathVariable(name = "id") UUID id) {

    RoleRes roleRes = roleService.getRoleByIdUsingNativeQuery(id);

    return new ResponseEntity<>(roleRes, HttpStatus.OK);

  }

}
