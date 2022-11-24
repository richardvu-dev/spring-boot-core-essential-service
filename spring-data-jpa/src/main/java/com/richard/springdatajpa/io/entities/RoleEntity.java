package com.richard.springdatajpa.io.entities;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "role")
public class RoleEntity extends BaseEntity {

  private static final long serialVersionUID = 1L;

  @Column(nullable = false, length = 20)
  private String name;

  @ManyToMany(mappedBy = "roles")
  private Collection<AccountEntity> users;

  @ManyToMany(cascade = { CascadeType.PERSIST }, fetch = FetchType.EAGER)
  @JoinTable(name = "roles_authorities", joinColumns = @JoinColumn(name = "roles_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "authorities_id", referencedColumnName = "id"))
  private Collection<AuthorityEntity> authorities;

}
