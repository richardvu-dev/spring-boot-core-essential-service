package com.richard.springdatajpa.apis.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonProperty;

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

  @JsonProperty("created_by")
  @Schema(name = "Created By", description = "Created By of object")
  private String createdBy = "system";

  @JsonProperty("update_by")
  @Schema(name = "Update By", description = "Update By of object")
  private String updateBy = "system";

  @JsonProperty("created_at")
  @Schema(name = "Created At", description = "Created At of object")
  private LocalDateTime createdAt = LocalDateTime.now();

  @JsonProperty("last_modified_at")
  @Schema(name = "Last Modified At", description = "Last Modified At of object")
  private LocalDateTime lastModifiedAt = LocalDateTime.now();

  @JsonProperty("is_delete")
  @Schema(name = "Is Delete", description = "Is Delete of object")
  private Boolean isDelete;

}