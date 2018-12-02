package com.chrisvz.rands.chrisvzrands.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.chrisvz.rands.chrisvzrands.entity.User;
import com.chrisvz.rands.chrisvzrands.exceptions.UsernameAlreadyExistsException;
import com.chrisvz.rands.chrisvzrands.repositories.UserRepository;

/**
 * @author Kristijan Klepač
 * Dec 2, 2018
 * chrisvzrands
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public User saveUser (User newUser){

        try{
            newUser.setPassword(bCryptPasswordEncoder.encode(newUser.getPassword()));
            //Username has to be unique (exception)
            newUser.setUsername(newUser.getUsername());
            // Make sure that password and confirmPassword match
            // We don't persist or show the confirmPassword
            newUser.setConfirmPassword("");
            return userRepository.save(newUser);

        }catch (Exception e){
            throw new UsernameAlreadyExistsException("Username '"+newUser.getUsername()+"' already exists");
        }

    }



}
