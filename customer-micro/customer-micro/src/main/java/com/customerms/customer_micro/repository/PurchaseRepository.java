package com.customerms.customer_micro.repository;

import com.customerms.customer_micro.entity.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {
    List<Purchase> findByCustomerId(Long customerId);
}
