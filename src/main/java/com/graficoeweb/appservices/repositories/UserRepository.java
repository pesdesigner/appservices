package com.graficoeweb.appservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graficoeweb.appservices.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
