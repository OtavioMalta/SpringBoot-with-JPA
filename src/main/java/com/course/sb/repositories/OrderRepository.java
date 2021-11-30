package com.course.sb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.sb.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
