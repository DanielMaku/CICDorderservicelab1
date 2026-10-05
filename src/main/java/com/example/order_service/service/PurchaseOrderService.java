package com.example.order_service.service;
import com.example.order_service.client.CatalogClient;
import com.example.order_service.dto.ProductResponse;
import com.example.order_service.model.PurchaseOrderModel;
import com.example.order_service.repository.PurchaseOrderRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;



@Service
public class PurchaseOrderService {

 private final PurchaseOrderRepository purchaseOrderRepository;
 private final CatalogClient catalogClient;

    public PurchaseOrderService(PurchaseOrderRepository purchaseOrderRepository, CatalogClient catalogClient) {
        this.purchaseOrderRepository = purchaseOrderRepository;
        this.catalogClient = catalogClient;
    }

    public List<PurchaseOrderModel> getAll() {
        return purchaseOrderRepository.findAll();
    }
    public PurchaseOrderModel create(PurchaseOrderModel order) {
        order.setId(null);
        return purchaseOrderRepository.save(order);
    }

    public ProductResponse testCatalogConnection(Long ProductId)
    {
        return catalogClient.getProductById(ProductId);
    }
}