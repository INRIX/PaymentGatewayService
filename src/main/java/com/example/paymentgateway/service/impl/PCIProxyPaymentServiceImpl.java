package com.example.paymentgateway.service.impl;

import com.example.paymentgateway.model.request.PCIProxyPaymentRequest;
import com.example.paymentgateway.model.response.PCIProxyPaymentResponse;
import com.example.paymentgateway.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PCIProxyPaymentServiceImpl implements PaymentService<PCIProxyPaymentRequest, PCIProxyPaymentResponse> {
    @Override
    public PCIProxyPaymentResponse pay(PCIProxyPaymentRequest request) {
        log.debug("In the pay for the PCIProxyPaymentRequest");
        // FIXME payment logic with PCI Payment Service ...
        PCIProxyPaymentResponse response = new PCIProxyPaymentResponse();
        response.setSomeText("This will be the response from the PCI proxy");
        response.setSomeText("Response from the PCIProxyPayment service");
        response.setWasPaymentSuccessful(true);
        return response;
    }
}
