package com.richard.springdatajpa.io.repositories.authories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.richard.springdatajpa.io.entities.AuthorityEntity;

@Repository
public interface AuthorityNativeQueryRepository extends JpaRepository<AuthorityEntity, UUID> {

  @Query(nativeQuery = true, value = "SELECT * FROM authorities WHERE id = :id AND is_delete = false")
  AuthorityEntity getAuthorityByIdUsingNativeQuery(UUID id);

}
