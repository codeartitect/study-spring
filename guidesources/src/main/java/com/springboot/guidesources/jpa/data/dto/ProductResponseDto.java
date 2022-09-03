package com.springboot.guidesources.jpa.data.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductResponseDto {

    private Long number;

    private String name;

    private int price;

    private int stock;
    
}
