package com.inrix.paymentgateway.controller;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.inrix.paymentgateway.config.PaymentGatewayConstants;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class PaymentControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void testPingReturnDefaultMessage() throws Exception {
        this.mockMvc.perform(get("/payments-"+ PaymentGatewayConstants.LIVE_API_VERSION+"/ping")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Ping was successful")));
    }
//    @Test
//    void testPay1shouldReturnPaymentWasSuccessful()  throws Exception {
//        this.mockMvc.perform(post("/payments-"+ PaymentGatewayConstants.LIVE_API_VERSION+"/pay1").contentType(MediaType.APPLICATION_JSON)
//                        .accept(MediaType.APPLICATION_JSON)
//                .content("{\"creditCardNumber\":\"1234-5678-9012-3456\",\"paymentAmount\":69.69,\"paymentProviderType\":\"PROVIDER_ONE\"}"))
//                .andExpect(status().isOk())
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
//                .andExpect(jsonPath("$.someText").value("This is the response from the ProviderOnePayment service"))
//                .andExpect(jsonPath("$.wasPaymentSuccessful").value(true));
//
//    }
    }

