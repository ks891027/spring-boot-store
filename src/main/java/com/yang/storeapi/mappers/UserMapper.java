package com.yang.storeapi.mappers;

import com.yang.storeapi.dtos.RegisterUserRequest;
import com.yang.storeapi.dtos.UpdateUserRequest;
import com.yang.storeapi.dtos.UserDto;
import com.yang.storeapi.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
    User toEntity(RegisterUserRequest request);
    void update(UpdateUserRequest request, @MappingTarget User user);
}
