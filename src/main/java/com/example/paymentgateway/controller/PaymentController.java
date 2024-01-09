package com.example.paymentgateway.controller;

import com.example.paymentgateway.config.PaymentGatewayConstants;
import com.example.paymentgateway.gateway.PaymentGateway;
import com.example.paymentgateway.model.request.*;
import com.example.paymentgateway.model.response.PaymentResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments-"+ PaymentGatewayConstants.LIVE_API_VERSION)
@RequiredArgsConstructor
@Slf4j
public class PaymentController {
    private final PaymentGateway<PaymentResponse, PaymentRequest> paymentGateway;

    @PostMapping("/pay-PCI")
    public ResponseEntity<PaymentResponse> processPayment(@RequestBody PCIProxyPaymentRequest paymentRequest) {
        log.debug("Before make-PCI-Payment");
        return ResponseEntity.ok(paymentGateway.makePayment(paymentRequest));
    }
    @PostMapping("/pay1")
    public ResponseEntity<PaymentResponse> processPayment(@RequestBody ProviderOnePaymentRequest paymentRequest) {
        log.debug("Before make-PaymentOne");
        return ResponseEntity.ok(paymentGateway.makePayment(paymentRequest));
    }
    @PostMapping("/pay2")
    public ResponseEntity<PaymentResponse> processPayment(@RequestBody ProviderTwoPaymentRequest paymentRequest) {
        log.debug("Before make-PaymentTwo");
        return ResponseEntity.ok(paymentGateway.makePayment(paymentRequest));
    }
    @PostMapping("/pay3")
    public ResponseEntity<PaymentResponse> processPayment(@RequestBody ProviderThreePaymentRequest paymentRequest) {
        log.debug("Before make-PaymentThree");
        return ResponseEntity.ok(paymentGateway.makePayment(paymentRequest));
    }
    @GetMapping("/ping")
    public ResponseEntity<String> doPing(){
        log.debug("Before Ping response");
        return ResponseEntity.ok("Ping was successful");
    }

}
