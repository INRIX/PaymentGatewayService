package com.example.paymentgateway.controller;

import com.example.paymentgateway.gateway.PaymentGateway;
import com.example.paymentgateway.model.request.*;
import com.example.paymentgateway.model.response.PaymentResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
@RequiredArgsConstructor
public class PaymentController {
    private final PaymentGateway<PaymentResponse, PaymentRequest> paymentGateway;

    @PostMapping("/pay-PCI")
    public ResponseEntity<PaymentResponse> processPayment(@RequestBody PCIProxyPaymentRequest paymentRequest) {
        return ResponseEntity.ok(paymentGateway.makePayment(paymentRequest));
    }
    @PostMapping("/pay1")
    public ResponseEntity<PaymentResponse> processPayment(@RequestBody ProviderOnePaymentRequest paymentRequest) {
        return ResponseEntity.ok(paymentGateway.makePayment(paymentRequest));
    }
    @PostMapping("/pay2")
    public ResponseEntity<PaymentResponse> processPayment(@RequestBody ProviderTwoPaymentRequest paymentRequest) {
        return ResponseEntity.ok(paymentGateway.makePayment(paymentRequest));
    }
    @PostMapping("/pay3")
    public ResponseEntity<PaymentResponse> processPayment(@RequestBody ProviderThreePaymentRequest paymentRequest) {
        return ResponseEntity.ok(paymentGateway.makePayment(paymentRequest));
    }
    @GetMapping("/ping")
    public ResponseEntity<String> doPing(){
        return ResponseEntity.ok("Ping was successful");
    }

}
