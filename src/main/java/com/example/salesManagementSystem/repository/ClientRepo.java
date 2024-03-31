package com.example.salesManagementSystem.repository;

import com.example.salesManagementSystem.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepo extends JpaRepository<Client, Long> {
}
