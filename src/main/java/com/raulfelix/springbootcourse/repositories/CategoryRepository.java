package com.raulfelix.springbootcourse.repositories;

import com.raulfelix.springbootcourse.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
