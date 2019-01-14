package com.midtrans.sdk.corekit.core.api.snap.model.pay.response;

public class OnlineDebitBriEpayPaymentResponse extends BasePaymentResponse {

    public String getStatusCode() {
        return statusCode;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getGrossAmount() {
        return grossAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public String getTransactionTime() {
        return transactionTime;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public String getFraudStatus() {
        return fraudStatus;
    }

    public String getFinishRedirectUrl() {
        return finishRedirectUrl;
    }
}