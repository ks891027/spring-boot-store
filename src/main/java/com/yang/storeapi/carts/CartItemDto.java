package com.yang.storeapi.carts;

import com.yang.storeapi.products.ProductDto;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CartItemDto {
    private ProductDto product;
    private int quantity;
    private BigDecimal totalPrice;
}
