package com.inrix.paymentgateway.gateway;

import com.inrix.paymentgateway.model.request.PaymentRequest;
import com.inrix.paymentgateway.model.response.PaymentResponse;

public interface PaymentGateway<T extends PaymentResponse, K extends PaymentRequest> {
    T makePayment(K paymentRequest);
}
