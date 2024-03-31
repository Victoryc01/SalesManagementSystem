package com.example.salesManagementSystem.service;

import com.example.salesManagementSystem.entity.Sale;

import java.util.List;

public interface SaleService {
    List<Sale> getAllSaleService();
    Sale getSaleById(Long id);
    Sale createSale(Sale sale);
    Sale updateSale(Long id, Sale sale);
    void deleteSale(Long id);
}
