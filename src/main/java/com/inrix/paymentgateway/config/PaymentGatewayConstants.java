package com.inrix.paymentgateway.config;

import org.springframework.beans.factory.annotation.Value;

public class PaymentGatewayConstants {
    @Value("${priority}")
    public final static String LIVE_API_VERSION="V1";
}
