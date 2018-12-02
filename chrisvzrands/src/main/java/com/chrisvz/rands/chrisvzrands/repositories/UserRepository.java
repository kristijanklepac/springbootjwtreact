package com.chrisvz.rands.chrisvzrands.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chrisvz.rands.chrisvzrands.entity.User;


/**
 * @author Kristijan Klepač
 * Dec 2, 2018
 * chrisvzrands
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
    User getById(Long id);
}

