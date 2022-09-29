package com.example.devsuperior_projjpa.repositories;

import com.example.devsuperior_projjpa.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
