package com.example.paymentgateway.service.impl;

import com.example.paymentgateway.model.request.ProviderThreePaymentRequest;
import com.example.paymentgateway.model.response.ProviderOnePaymentResponse;
import com.example.paymentgateway.model.response.ProviderThreePaymentResponse;
import com.example.paymentgateway.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ProviderThreePaymentServiceImpl implements PaymentService<ProviderThreePaymentRequest, ProviderThreePaymentResponse> {

    @Override
    public ProviderThreePaymentResponse pay(ProviderThreePaymentRequest request) {
        log.debug("In the pay for the ProviderThreePaymentRequest");
        // TODO payment logic with provider 1 ...
        ProviderThreePaymentResponse response = new ProviderThreePaymentResponse();
        response.setSomeText("This is the response from the ProviderThreePayment service");
        response.setWasPaymentSuccessful(true);
        return response;
    }

}
