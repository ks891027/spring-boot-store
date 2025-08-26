package com.yang.storeapi.mappers;

import com.yang.storeapi.dtos.OrderDto;
import com.yang.storeapi.entities.Order;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    OrderDto toDto(Order order);
}
