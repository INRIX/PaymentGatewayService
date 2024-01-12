package com.inrix.paymentgateway.gateway.impl;

import com.inrix.paymentgateway.gateway.PaymentGateway;
import com.inrix.paymentgateway.model.request.PaymentRequest;
import com.inrix.paymentgateway.model.response.PaymentResponse;
import com.inrix.paymentgateway.provider.PaymentProvider;
import com.inrix.paymentgateway.service.PaymentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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
