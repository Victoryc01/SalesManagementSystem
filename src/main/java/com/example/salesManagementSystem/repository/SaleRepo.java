package com.example.salesManagementSystem.repository;

import com.example.salesManagementSystem.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepo extends JpaRepository<Sale, Long> {
}
