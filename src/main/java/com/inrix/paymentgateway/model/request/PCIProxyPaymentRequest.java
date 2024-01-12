package com.inrix.paymentgateway.model.request;

import com.inrix.paymentgateway.model.constant.PaymentProviderType;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

//@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class PCIProxyPaymentRequest extends PaymentRequest{

    public PCIProxyPaymentRequest(com.inrix.paymentgateway.model.constant.PaymentProviderType paymentProviderType) {
        super(paymentProviderType);
    }

    public com.inrix.paymentgateway.model.constant.PaymentProviderType getPaymentProviderType() {
        return PaymentProviderType.PCI_PROXY;
    }

    public PCIProxyPaymentRequest() {
    }
}
