package com.inrix.paymentgateway.model.request;

import com.inrix.paymentgateway.model.constant.PaymentProviderType;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

//@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class ProviderTwoPaymentRequest extends PaymentRequest {

    public ProviderTwoPaymentRequest(com.inrix.paymentgateway.model.constant.PaymentProviderType paymentProviderType) {
        super(paymentProviderType);
    }

    public PaymentProviderType getPaymentProviderType() {
        return PaymentProviderType.PROVIDER_TWO;
    }

    public ProviderTwoPaymentRequest() {
    }
}
