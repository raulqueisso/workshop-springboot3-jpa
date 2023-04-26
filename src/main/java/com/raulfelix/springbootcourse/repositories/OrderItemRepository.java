package com.raulfelix.springbootcourse.repositories;

import com.raulfelix.springbootcourse.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
