package com.course.sb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.sb.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
