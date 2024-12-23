package com.example.petproject;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<pet, Integer> {

    //Optional<pet> findByname(String name);
    Iterable<pet> findAllByname(String name);
}
