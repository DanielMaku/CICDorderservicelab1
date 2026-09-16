package com.example.order_service.service;
import com.example.order_service.model.PurchaseOrderModel;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;



@Service
public class PurchaseOrderService {
    private final List<PurchaseOrderModel> orders = new ArrayList<>();
    private long nextId = 1;
    public List<PurchaseOrderModel> getAll() {
        return orders;
    }
    public PurchaseOrderModel create(PurchaseOrderModel order) {
        order.setId(nextId++);
        orders.add(order);
        return order;
    }
}