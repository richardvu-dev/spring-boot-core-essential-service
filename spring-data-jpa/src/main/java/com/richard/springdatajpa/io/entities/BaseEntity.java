package com.richard.springdatajpa.io.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false, columnDefinition = "UUID default gen_random_uuid()")
  private UUID id;

  @Column(nullable = false, insertable = true, updatable = false, columnDefinition = "varchar(20) default 'system'")
  private String createdBy = "system";

  @Column(nullable = false, insertable = true, updatable = false, columnDefinition = "varchar(20) default 'system'")
  private String updateBy = "system";

  @Column(nullable = false, insertable = true, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
  private LocalDateTime createdAt = LocalDateTime.now();

  @Column(nullable = false, insertable = true, updatable = true, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
  private LocalDateTime lastModifiedAt = LocalDateTime.now();

  @Column(name = "is_delete", columnDefinition = "boolean default false")
  private Boolean isDelete;

}