package com.graficoeweb.appservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graficoeweb.appservices.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
