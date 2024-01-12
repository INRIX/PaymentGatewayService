package com.inrix.paymentgateway.provider.impl;

import com.inrix.paymentgateway.model.constant.PaymentProviderType;
import com.inrix.paymentgateway.model.request.PaymentRequest;
import com.inrix.paymentgateway.model.response.PaymentResponse;
import com.inrix.paymentgateway.provider.PaymentProvider;
import com.inrix.paymentgateway.service.PaymentService;
import com.inrix.paymentgateway.service.impl.PCIProxyPaymentServiceImpl;
import com.inrix.paymentgateway.service.impl.ProviderOnePaymentServiceImpl;
import com.inrix.paymentgateway.service.impl.ProviderThreePaymentServiceImpl;
import com.inrix.paymentgateway.service.impl.ProviderTwoPaymentServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class DefaultPaymentProviderImpl implements PaymentProvider<PaymentService<PaymentRequest, PaymentResponse>> {

    private final ApplicationContext applicationContext;

    @Override
    @SuppressWarnings("rawtypes")
    public PaymentService getProvider(PaymentProviderType type) {
        log.debug("in the DefaultPaymentProviderImpl with PaymentProviderType::"+type.name());
        switch (type) {
            case PCI_PROXY:
                return applicationContext.getBean(PCIProxyPaymentServiceImpl.class);
            case PROVIDER_ONE:
                return applicationContext.getBean(ProviderOnePaymentServiceImpl.class);
            case PROVIDER_TWO:
                return applicationContext.getBean(ProviderTwoPaymentServiceImpl.class);
            case PROVIDER_THREE:
                return applicationContext.getBean(ProviderThreePaymentServiceImpl.class);
            default:
                throw new UnsupportedOperationException("Notification type: " + type + " not supported");
        }
    }

}
