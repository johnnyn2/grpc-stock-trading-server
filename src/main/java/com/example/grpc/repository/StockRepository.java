package com.example.grpc.repository;

import com.example.grpc.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Long> {
    Stock findByStockSymbol(String stockSymbol);
}
