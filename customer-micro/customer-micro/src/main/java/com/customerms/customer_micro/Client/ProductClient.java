package com.customerms.customer_micro.Client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Map;


@FeignClient(name = "product-micro")
public interface ProductClient {

    @GetMapping("/api/products/{id}")
    Map<String, Object> getProductById(@PathVariable("id") Long id);

    @PutMapping("/api/products/{id}/decrement-stock")
    void decrementStock(@PathVariable("id") Long id, @RequestParam("quantity") Integer quantity);
    
    @GetMapping("/api/products/search/name")
    Map<String, Object> getProductsByName(@RequestParam("name") String name);

    @GetMapping("/api/products/search/category")
    Map<String, Object> getProductsByCategory(@RequestParam("category") String category);
    
    @PutMapping("/api/products/{id}/update-stock")
    void updateStock(@PathVariable("id") Long id, @RequestParam("quantity") Integer quantity);
    
    default void decrementStock(Long id, int quantity) {
    	Map<String, Object> product = getProductById(id);
        Integer stockQuantity = (Integer) product.get("stockQuantity");
        Integer finalQuantity = quantity - stockQuantity;
        updateStock(id, finalQuantity);
    }
    
}
