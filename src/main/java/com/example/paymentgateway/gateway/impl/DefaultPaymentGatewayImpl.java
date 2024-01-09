package com.example.paymentgateway.gateway.impl;

import com.example.paymentgateway.controller.PaymentController;
import com.example.paymentgateway.gateway.PaymentGateway;
import com.example.paymentgateway.model.request.PaymentRequest;
import com.example.paymentgateway.model.response.PaymentResponse;
import com.example.paymentgateway.provider.PaymentProvider;
import com.example.paymentgateway.service.PaymentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class DefaultPaymentGatewayImpl implements PaymentGateway<PaymentResponse, PaymentRequest> {
    private final PaymentProvider<PaymentService<PaymentRequest, PaymentResponse>> paymentProvider;

    @Override
    public PaymentResponse makePayment(PaymentRequest paymentRequest) {
        log.debug("in the DefaultPaymentGatewayImpl");
        return paymentProvider.getProvider(paymentRequest.getPaymentProviderType()).pay(paymentRequest);
    }

}
