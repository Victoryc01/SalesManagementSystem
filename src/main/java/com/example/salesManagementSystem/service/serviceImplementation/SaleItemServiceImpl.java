package com.example.salesManagementSystem.service.serviceImplementation;

import com.example.salesManagementSystem.entity.SalesItem;
import com.example.salesManagementSystem.repository.SaleItemRepo;
import com.example.salesManagementSystem.service.SaleItemService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class SaleItemServiceImpl implements SaleItemService {

    @Autowired
    private SaleItemRepo saleItemRepo;

    @Override
    public List<SalesItem> getAllSaleItemService() {
        return saleItemRepo.findAll();
    }

    @Override
    public SalesItem getSaleItemById(Long id) {
        return saleItemRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Client not found with id " + id));    }

    @Override
    public SalesItem createSaleItem(SalesItem salesItem) {
        return saleItemRepo.save(salesItem);
    }

    @Override
    public SalesItem updateSaleItem(Long id, SalesItem salesItem) {
        SalesItem existingSaleItem = getSaleItemById(id);
        return saleItemRepo.save(existingSaleItem);    }

    @Override
    public void deleteSaleItem(Long id) {
        SalesItem salesItem = getSaleItemById(id);
        saleItemRepo.delete(salesItem);
    }
}
