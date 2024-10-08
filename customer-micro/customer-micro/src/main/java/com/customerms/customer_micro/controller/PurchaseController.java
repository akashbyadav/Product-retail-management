package com.customerms.customer_micro.controller;

import com.customerms.customer_micro.entity.Purchase;
import com.customerms.customer_micro.service.PurchaseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/purchases")
public class PurchaseController {

    private final PurchaseService purchaseService;

    public PurchaseController(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    @PostMapping("/make-purchase")
    public ResponseEntity<Purchase> makePurchase(
        @RequestParam Long customerId,
        @RequestParam Long productId,
        @RequestParam Integer quantity) {
        return ResponseEntity.ok(purchaseService.makePurchase(customerId, productId, quantity));
    }

    @GetMapping("/history/{customerId}")
    public ResponseEntity<List<Purchase>> getPurchaseHistory(@PathVariable Long customerId) {
        return ResponseEntity.ok(purchaseService.getPurchasesByCustomerId(customerId));
    }
}
