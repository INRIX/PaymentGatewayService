package com.example.paymentgateway.service.impl;

import com.example.paymentgateway.model.request.ProviderOnePaymentRequest;
import com.example.paymentgateway.model.response.ProviderOnePaymentResponse;
import com.example.paymentgateway.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ProviderOnePaymentServiceImpl implements PaymentService<ProviderOnePaymentRequest, ProviderOnePaymentResponse> {

    @Override
    public ProviderOnePaymentResponse pay(ProviderOnePaymentRequest request) {
        log.debug("In the pay for the ProviderOnePaymentRequest");
        // TODO payment logic with provider 1 ...
        ProviderOnePaymentResponse response = new ProviderOnePaymentResponse();
        response.setSomeText("This is the response from the ProviderOnePayment service");
        response.setWasPaymentSuccessful(true);
        return response;
    }

}
