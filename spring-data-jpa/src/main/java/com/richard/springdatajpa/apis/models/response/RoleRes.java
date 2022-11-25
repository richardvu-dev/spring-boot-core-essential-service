package com.richard.springdatajpa.apis.models.response;

import java.util.Set;

import com.richard.springdatajpa.apis.models.BaseDto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Role Response")
public class RoleRes extends BaseDto {

  @Schema(name = "name", description = "Name of role")
  private String name;

  @Schema(name = "authorities", description = "Authorities of role")
  private Set<AuthorityRes> authorities;

}
