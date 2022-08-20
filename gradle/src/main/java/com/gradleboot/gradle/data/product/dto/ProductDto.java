package com.gradleboot.gradle.data.product.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductDto {

    private String name;

    private int price;

    private int stock;
}