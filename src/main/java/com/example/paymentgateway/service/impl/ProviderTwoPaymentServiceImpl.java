package com.example.paymentgateway.service.impl;

import com.example.paymentgateway.model.request.ProviderTwoPaymentRequest;
import com.example.paymentgateway.model.response.ProviderThreePaymentResponse;
import com.example.paymentgateway.model.response.ProviderTwoPaymentResponse;
import com.example.paymentgateway.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ProviderTwoPaymentServiceImpl implements PaymentService<ProviderTwoPaymentRequest, ProviderTwoPaymentResponse> {

    @Override
    public ProviderTwoPaymentResponse pay(ProviderTwoPaymentRequest request) {
        log.debug("In the pay for the ProviderTwoPaymentRequest");
        // TODO payment logic with provider 2 ...
        ProviderTwoPaymentResponse response = new ProviderTwoPaymentResponse();
        response.setSomeText("This is the response from the ProviderTwoPayment service");
        response.setWasPaymentSuccessful(true);
        return response;
    }

}
