package com.example.devsuperior_projjpa.repositories;

import com.example.devsuperior_projjpa.entities.OrderItem;
import com.example.devsuperior_projjpa.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
