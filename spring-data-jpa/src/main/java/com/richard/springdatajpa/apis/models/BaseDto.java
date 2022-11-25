package com.richard.springdatajpa.apis.models;

import java.io.Serializable;
import java.time.ZonedDateTime;
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

  @Schema(name = "id", description = "Identity of object")
  private UUID id;

  @Schema(name = "created_by", description = "Created By of object")
  private String createdBy = "system";

  @Schema(name = "update_by", description = "Update By of object")
  private String updateBy = "system";

  @Schema(name = "created_at", description = "Created At of object")
  private ZonedDateTime createdAt = ZonedDateTime.now();

  @Schema(name = "last_modified_at", description = "Last Modified At of object")
  private ZonedDateTime lastModifiedAt = ZonedDateTime.now();

  @Schema(name = "is_delete", description = "Is Delete of object")
  private Boolean isDelete;

}