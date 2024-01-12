package com.inrix.paymentgateway.model.request;

import com.inrix.paymentgateway.model.constant.PaymentProviderType;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor

public class PaymentRequest {
    public PaymentRequest(com.inrix.paymentgateway.model.constant.PaymentProviderType paymentProviderType) {
        PaymentProviderType = paymentProviderType;
    }

    // any common fields
    private String creditCardNumber;
    private PaymentProviderType PaymentProviderType;
    private double paymentAmount;
    public PaymentProviderType getPaymentProviderType(){
        return PaymentProviderType;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public void setPaymentProviderType(com.inrix.paymentgateway.model.constant.PaymentProviderType paymentProviderType) {
        PaymentProviderType = paymentProviderType;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public PaymentRequest() {
    }
}
