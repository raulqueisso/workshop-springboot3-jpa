package com.raulfelix.springbootcourse.repositories;

import com.raulfelix.springbootcourse.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
