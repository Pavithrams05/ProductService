package com.scaler.ProductService.Repositories;

import com.scaler.ProductService.Models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
