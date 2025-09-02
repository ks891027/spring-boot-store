package com.yang.storeapi.carts;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AddItemToCartRequest {
    @NotBlank(message = "productId is required")
    private Long productId;
}
