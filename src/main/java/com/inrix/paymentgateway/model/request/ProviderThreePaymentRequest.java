package com.inrix.paymentgateway.model.request;

import com.inrix.paymentgateway.model.constant.PaymentProviderType;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

//@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class ProviderThreePaymentRequest extends PaymentRequest {

    public ProviderThreePaymentRequest(com.inrix.paymentgateway.model.constant.PaymentProviderType paymentProviderType) {
        super(paymentProviderType);
    }

    public PaymentProviderType getPaymentProviderType() {
        return PaymentProviderType.PROVIDER_THREE;
    }

    public ProviderThreePaymentRequest() {
    }
}
