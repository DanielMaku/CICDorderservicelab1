package com.example.order_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "catalog-service", url = "https://localhost:8081")
public interface CatalogClient {
    String getProductById(@PathVariable("id") Long id);
}
