package com.BFSI.Interface;

public class PurchaseDetails implements Tax{
    private String purchaseID;
    private String paymentType;
    private double taxPercentage;

    public PurchaseDetails(String purchaseID, String paymentType) {
        this.purchaseID = purchaseID;
        this.paymentType = paymentType;
    }

    public String getPurchaseID() {
        return purchaseID;
    }

    public void setPurchaseID(String purchaseID) {
        this.purchaseID = purchaseID;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public double getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    @Override
    public double calculateTax(double price) {
        if(getPaymentType().equals("Debit Card"))
            setTaxPercentage(2);
        else if(getPaymentType().equals("Credit Card"))
            setTaxPercentage(3);
        else
            setTaxPercentage(4);
        return (price + (price * (getTaxPercentage()/(double)100)));
    }
}
