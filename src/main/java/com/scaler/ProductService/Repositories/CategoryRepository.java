package com.scaler.ProductService.Repositories;

import com.scaler.ProductService.Models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    @Override
    Optional<Category> findById(Long categoryId);

    Optional<Category> findByValue(String value);

    Category save(Category category);
}
