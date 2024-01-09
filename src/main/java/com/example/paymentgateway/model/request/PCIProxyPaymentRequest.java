package com.example.paymentgateway.model.request;

import com.example.paymentgateway.model.constant.PaymentProviderType;
import lombok.*;

@Data
//@Builder
@NoArgsConstructor
//@AllArgsConstructor
public class PCIProxyPaymentRequest extends PaymentRequest{

    public com.example.paymentgateway.model.constant.PaymentProviderType getPaymentProviderType() {
        return PaymentProviderType.PCI_PROXY;
    }
}
