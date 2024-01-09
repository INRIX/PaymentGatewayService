package com.example.paymentgateway.model.request;

import com.example.paymentgateway.model.constant.PaymentProviderType;

public class ProviderTwoPaymentRequest extends PaymentRequest {

    public PaymentProviderType getPaymentProviderType() {
        return PaymentProviderType.PROVIDER_TWO;
    }

}
