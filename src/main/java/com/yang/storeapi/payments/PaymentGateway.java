package com.yang.storeapi.payments;

import com.yang.storeapi.orders.Order;

import java.util.Optional;

public interface PaymentGateway {
    CheckSession createCheckoutSession(Order order);
    Optional<PaymentResult> parseWebhookRequest(WebhookRequest request);
}
