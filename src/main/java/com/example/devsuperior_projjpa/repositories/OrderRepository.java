package com.example.devsuperior_projjpa.repositories;

import com.example.devsuperior_projjpa.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {

}