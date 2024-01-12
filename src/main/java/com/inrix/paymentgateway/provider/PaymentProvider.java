package com.inrix.paymentgateway.provider;

import com.inrix.paymentgateway.model.constant.PaymentProviderType;

public interface PaymentProvider<T> {
    T getProvider(PaymentProviderType type);
}
