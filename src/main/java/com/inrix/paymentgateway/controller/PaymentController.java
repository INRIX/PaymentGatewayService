package com.inrix.paymentgateway.controller;

import com.inrix.paymentgateway.config.PaymentGatewayConstants;
import com.inrix.paymentgateway.gateway.PaymentGateway;
import com.inrix.paymentgateway.model.request.*;
import com.inrix.paymentgateway.model.response.PaymentResponse;
import com.inrix.paymentgateway.model.request.PaymentRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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
        String className = paymentRequest.getClass().getName();
        String canonicalName = paymentRequest.getClass().getCanonicalName();
        String PackageName = paymentRequest.getClass().getPackageName();
        Class<? extends Class> type = paymentRequest.getClass().getClass();
        return ResponseEntity.ok(paymentGateway.makePayment(paymentRequest));
    }
//    @PostMapping("/pay2")
//    public ResponseEntity<PaymentResponse> processPayment(@RequestBody ProviderTwoPaymentRequest paymentRequest) {
//        log.debug("Before make-PaymentTwo");
//        return ResponseEntity.ok(paymentGateway.makePayment(paymentRequest));
//    }
//    @PostMapping("/pay3")
//    public ResponseEntity<PaymentResponse> processPayment(@RequestBody ProviderThreePaymentRequest paymentRequest) {
//        log.debug("Before make-PaymentThree");
//        return ResponseEntity.ok(paymentGateway.makePayment(paymentRequest));
//    }
    @GetMapping("/ping")
    public ResponseEntity<String> doPing(){
        log.debug("Before Ping response");
        return ResponseEntity.ok("Ping was successful");
    }

}
