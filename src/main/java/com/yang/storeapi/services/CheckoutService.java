package com.yang.storeapi.services;

import com.yang.storeapi.dtos.CheckoutRequest;
import com.yang.storeapi.dtos.CheckoutResponse;
import com.yang.storeapi.dtos.ErrorDto;
import com.yang.storeapi.entities.Order;
import com.yang.storeapi.exceptions.CartEmptyException;
import com.yang.storeapi.exceptions.CartNotFoundException;
import com.yang.storeapi.repositories.CartRepository;
import com.yang.storeapi.repositories.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CheckoutService {
    private final CartRepository cartRepository;
    private final AuthService authService;
    private final OrderRepository orderRepository;
    private final CartService cartService;

    public CheckoutResponse checkout(CheckoutRequest request) {
        var cart = cartRepository.getCartWithItems(request.getCartId()).orElse(null);
        if (cart == null) {
            throw new CartNotFoundException();
        }

        if (cart.isEmpty()) {
            throw new CartEmptyException();
        }

        var order = Order.fromCart(cart, authService.getCurrentUser());

        orderRepository.save(order);

        cartService.clearCart(cart.getId());

        return new CheckoutResponse(order.getId());
    }
}
