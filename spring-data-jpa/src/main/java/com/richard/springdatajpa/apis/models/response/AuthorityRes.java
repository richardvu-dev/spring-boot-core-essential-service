package com.richard.springdatajpa.apis.models.response;

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
@Schema(name = "Authority Response", description = "Authority Response")
public class AuthorityRes extends BaseDto {

  @Schema(name = "name", description = "Name of authority")
  private String name;

}
