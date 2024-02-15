package com.devsuperior.dscommerece.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dscommerece.entities.OrderItem;
import com.devsuperior.dscommerece.entities.OrderItemPK;

public interface OrderItemRepository  extends JpaRepository <OrderItem, OrderItemPK> {

}
