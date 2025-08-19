package com.wonderwiser.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wonderwiser.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{


}
