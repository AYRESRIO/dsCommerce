package com.devsuperior.dscommerece.repositories;

import com.devsuperior.dscommerece.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
