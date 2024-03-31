package com.example.salesManagementSystem.service;

import com.example.salesManagementSystem.entity.Sale;
import com.example.salesManagementSystem.entity.SalesItem;

import java.util.List;

public interface SaleItemService {
    List<SalesItem> getAllSaleItemService();
    SalesItem getSaleItemById(Long id);
    SalesItem createSaleItem(SalesItem salesItem);
    SalesItem updateSaleItem(Long id, SalesItem salesItem);
    void deleteSaleItem(Long id);
}
