package com.course.sb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.sb.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
