package com.yang.storeapi.controllers;

import com.yang.storeapi.dtos.CheckoutRequest;
import com.yang.storeapi.dtos.CheckoutResponse;
import com.yang.storeapi.dtos.ErrorDto;
import com.yang.storeapi.exceptions.CartEmptyException;
import com.yang.storeapi.exceptions.CartNotFoundException;
import com.yang.storeapi.services.CheckoutService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/checkout")
public class CheckoutController {
    private CheckoutService checkoutService;

    @PostMapping
    public CheckoutResponse checkout(@Valid @RequestBody CheckoutRequest request) {
        return checkoutService.checkout(request);
    }

    @ExceptionHandler({ CartNotFoundException.class, CartEmptyException.class})
    public ResponseEntity<ErrorDto> handleException(Exception ex) {
        return ResponseEntity.badRequest().body(new ErrorDto(ex.getMessage()));
    }
}
