package com.example.order_service.Controller;
import com.example.order_service.model.PurchaseOrderModel;
import com.example.order_service.service.PurchaseOrderService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/orders")
public class PurchaseOrderController {
    private final PurchaseOrderService service;
    private final PurchaseOrderService purchaseOrderService;

    public PurchaseOrderController(PurchaseOrderService service, PurchaseOrderService purchaseOrderService) {
        this.service = service;
        this.purchaseOrderService = purchaseOrderService;
    }
    @GetMapping
    public List<PurchaseOrderModel> getAll() {
        return service.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PurchaseOrderModel create(@RequestBody PurchaseOrderModel order) {
        return service.create(order);
    }


    @GetMapping("/test-catalog/{productId}")
    public ProductResponse testCatalogConnection(
            @PathVariable Long productId) {
                return purchaseOrderService.testCatalogConnection(productId);
    }

}