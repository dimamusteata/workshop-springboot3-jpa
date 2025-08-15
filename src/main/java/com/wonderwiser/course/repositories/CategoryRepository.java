package com.wonderwiser.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wonderwiser.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{


}
