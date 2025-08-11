package com.scaler.ProductService.Repositories;

import com.scaler.ProductService.Models.Product;
import com.scaler.ProductService.Projections.ProductWithTitleAndPrice;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Override
    Optional<Product> findById(Long productId);
    //select * from product where id = productId;


    @Override
    List<Product> findAll();

    Product save(Product product);

//    getTitleAndPriceById(@Param("id") Long productId);
}
