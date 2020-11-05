package com.graficoeweb.appservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graficoeweb.appservices.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
