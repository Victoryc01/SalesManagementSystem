package com.example.salesManagementSystem.service.serviceImplementation;

import com.example.salesManagementSystem.entity.Sale;
import com.example.salesManagementSystem.repository.SaleRepo;
import com.example.salesManagementSystem.service.SaleService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class SaleServiceImpl implements SaleService {

    @Autowired SaleRepo saleRepo;
    @Override
    public List<Sale> getAllSaleService() {
        return saleRepo.findAll();
    }

    @Override
    public Sale getSaleById(Long id) {
        return saleRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Client not found with id " + id));    }

    @Override
    public Sale createSale(Sale sale) {
        return saleRepo.save(sale);
    }

    @Override
    public Sale updateSale(Long id, Sale sale) {
        Sale existingSale = getSaleById(id);
        return saleRepo.save(existingSale);     }

    @Override
    public void deleteSale(Long id) {
        Sale sale = getSaleById(id);
        saleRepo.delete(sale);
    }
}
