package com.raulfelix.springbootcourse.repositories;

import com.raulfelix.springbootcourse.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
