package com.customerms.customer_micro.dto;

import lombok.Data;

@Data
public class ProductDTO {
    private Long id;
    private String name;
    private Integer stockQuantity;
}
