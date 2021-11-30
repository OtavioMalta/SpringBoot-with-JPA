package com.course.sb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.sb.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
