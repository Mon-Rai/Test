package com.test1.Payload;

import lombok.Data;

@Data
public class FomDto {
    private Long id;
    private Integer number;  // Use Integer to allow for null values
    private String phoneNumber;
    private String name;
    private Double amount;   // Use Double to allow for null values
}
