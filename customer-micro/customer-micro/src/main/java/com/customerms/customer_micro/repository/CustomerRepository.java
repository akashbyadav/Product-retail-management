package com.customerms.customer_micro.repository;

import com.customerms.customer_micro.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
