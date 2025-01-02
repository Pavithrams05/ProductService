package com.scaler.ProductService.Repositories;

import com.scaler.ProductService.Models.Product;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Override
    Optional<Product> findById(Long id);
    //select * from product where id = id

    List<Product> findAllByTitle(String title);
}
