package com.inrix.paymentgateway.service;

import com.inrix.paymentgateway.model.request.PaymentRequest;
import com.inrix.paymentgateway.model.response.PaymentResponse;

public interface PaymentService<T extends PaymentRequest, R extends PaymentResponse> {
    R pay(T request);
}
