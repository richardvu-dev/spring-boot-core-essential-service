package com.richard.springdatajpa.io.repositories.authories;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.richard.springdatajpa.io.entities.AuthorityEntity;

@Repository
public interface AuthorityPagingAndSortingRepository extends PagingAndSortingRepository<AuthorityEntity, UUID> {

}
