package com.graficoeweb.appservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graficoeweb.appservices.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
