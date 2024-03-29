package com.inrix.paymentgateway.model.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class PaymentResponse {
    @Builder.Default
    private String someText = "someText";

    private boolean wasPaymentSuccessful;

}
