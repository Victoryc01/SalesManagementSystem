package com.example.salesManagementSystem.repository;

import com.example.salesManagementSystem.entity.SalesItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleItemRepo extends JpaRepository<SalesItem, Long> {
}
