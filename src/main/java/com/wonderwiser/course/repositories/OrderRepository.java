package com.wonderwiser.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wonderwiser.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{


}
