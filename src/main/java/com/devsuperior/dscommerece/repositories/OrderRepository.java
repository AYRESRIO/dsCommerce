package com.devsuperior.dscommerece.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dscommerece.entities.Order;

public interface OrderRepository extends JpaRepository <Order, Long> {

}
