package com.customerms.customer_micro.exception;

public class NoPurchasesFoundException extends RuntimeException {
    public NoPurchasesFoundException(String message) {
        super(message);
    }
}
