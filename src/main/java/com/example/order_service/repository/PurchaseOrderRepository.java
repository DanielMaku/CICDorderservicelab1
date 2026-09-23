package com.example.order_service.repository;

import com.example.order_service.model.PurchaseOrderModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrderModel, Long> {
}
