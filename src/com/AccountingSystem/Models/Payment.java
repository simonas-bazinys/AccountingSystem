package com.AccountingSystem.Models;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class Payment implements Serializable {
    //int paymentId;
    float paymentSum;
    LocalDate paymentDate;
    //String paymentDescription;
    //String paymentBeneficiary;
    //String paymentBeneficiaryNumber;


    public Payment(float paymentSum) {
        this.paymentSum = paymentSum;
        this.paymentDate = LocalDate.now();
    }

    public float getPaymentSum() {
        return paymentSum;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }
}
