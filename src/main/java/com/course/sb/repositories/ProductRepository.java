package com.course.sb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.sb.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
