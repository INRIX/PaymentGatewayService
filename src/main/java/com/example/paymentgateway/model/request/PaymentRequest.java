package com.example.paymentgateway.model.request;

import com.example.paymentgateway.model.constant.PaymentProviderType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class PaymentRequest {
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

    public void setPaymentProviderType(com.example.paymentgateway.model.constant.PaymentProviderType paymentProviderType) {
        PaymentProviderType = paymentProviderType;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
}
