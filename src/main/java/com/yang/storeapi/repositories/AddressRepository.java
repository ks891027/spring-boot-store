package com.yang.storeapi.repositories;

import com.yang.storeapi.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}