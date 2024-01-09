package com.example.paymentgateway.service.impl;

import com.example.paymentgateway.model.request.PCIProxyPaymentRequest;
import com.example.paymentgateway.model.response.PCIProxyPaymentResponse;
import com.example.paymentgateway.service.PaymentService;
import org.springframework.stereotype.Component;

@Component
public class PCIProxyPaymentServiceImpl implements PaymentService<PCIProxyPaymentRequest, PCIProxyPaymentResponse> {
    @Override
    public PCIProxyPaymentResponse pay(PCIProxyPaymentRequest request) {
        // FIXME payment logic with PCI Payment Service ...
        PCIProxyPaymentResponse response = new PCIProxyPaymentResponse();
        response.setSomeText("This will be the response from the PCI proxy");
        response.setSomeText("Response from the PCIProxyPayment service");
        response.setWasPaymentSuccessful(true);
        return response;
    }
}
