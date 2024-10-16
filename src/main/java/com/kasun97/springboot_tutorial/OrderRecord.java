package com.kasun97.springboot_tutorial;

public record OrderRecord(
        String customerName,
        String productName,
        int quantity
) {

}
