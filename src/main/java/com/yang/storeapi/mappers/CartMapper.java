package com.yang.storeapi.mappers;

import com.yang.storeapi.dtos.CartDto;
import com.yang.storeapi.dtos.CartItemDto;
import com.yang.storeapi.entities.Cart;
import com.yang.storeapi.entities.CartItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CartMapper {
//    @Mapping(target = "items", source = "items")
    @Mapping(target = "totalPrice", expression = "java(cart.getTotalPrice())")
    CartDto toDto(Cart cart);

    @Mapping(target = "totalPrice", expression = "java(cartItem.getTotalPrice())")
    CartItemDto toDto(CartItem cartItem);

}
