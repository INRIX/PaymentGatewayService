package com.inrix.paymentgateway.model.request;

import com.inrix.paymentgateway.model.constant.PaymentProviderType;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

//@NoArgsConstructor
//@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class ProviderOnePaymentRequest extends PaymentRequest {


    public ProviderOnePaymentRequest(com.inrix.paymentgateway.model.constant.PaymentProviderType paymentProviderType) {
        super(paymentProviderType);
    }

    public PaymentProviderType getPaymentProviderType() {
        return PaymentProviderType.PROVIDER_ONE;
    }

    public ProviderOnePaymentRequest() {
    }
}
