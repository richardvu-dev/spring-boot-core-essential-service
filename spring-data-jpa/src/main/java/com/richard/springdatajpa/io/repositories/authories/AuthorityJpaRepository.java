package com.richard.springdatajpa.io.repositories.authories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.richard.springdatajpa.io.entities.AuthorityEntity;

@Repository
public interface AuthorityJpaRepository extends JpaRepository<AuthorityEntity, UUID> {

}
