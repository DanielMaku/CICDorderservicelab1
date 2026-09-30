package com.example.order_service.service;
import com.example.order_service.model.PurchaseOrderModel;
import com.example.order_service.repository.PurchaseOrderRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;



@Service
public class PurchaseOrderService {
 private final PurchaseOrderRepository purchaseOrderRepository;

    public PurchaseOrderService(PurchaseOrderRepository purchaseOrderRepository) {
        this.purchaseOrderRepository = purchaseOrderRepository;
    }

    public List<PurchaseOrderModel> getAll() {
        return purchaseOrderRepository.findAll();
    }
    public PurchaseOrderModel create(PurchaseOrderModel order) {
        order.setId(null);
        return purchaseOrderRepository.save(order);
    }
}