package com.richard.springdatajpa.io.entities;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "authorities")
public class AuthorityEntity extends BaseEntity {

  private static final long serialVersionUID = 1L;

  @Column(nullable=false, length=20)
	private String name;
	
	@ManyToMany(mappedBy="authorities")
	private Collection<RoleEntity> roles;

}
