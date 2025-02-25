package com.solucaotecnologia.TechCommerce.repositories;

import com.solucaotecnologia.TechCommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
