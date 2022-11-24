package com.richard.springdatajpa.apis.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.MappedSuperclass;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class BaseDto implements Serializable {

  private static final long serialVersionUID = 1L;

  @Schema(name = "Identity", description = "Identity of object")
  private UUID id;

  @Schema(name = "Created By", description = "Created By of object")
  private String createdBy = "system";

  @Schema(name = "Created By", description = "Created By of object")
  private String updateBy = "system";

  @Schema(name = "Created By", description = "Created By of object")
  private LocalDateTime createdAt = LocalDateTime.now();

  @Schema(name = "Last Modified At", description = "Last Modified At of object")
  private LocalDateTime lastModifiedAt = LocalDateTime.now();

  @Schema(name = "Is Delete", description = "Is Delete of object")
  private Boolean isDelete;

}