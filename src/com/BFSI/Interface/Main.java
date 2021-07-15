package com.BFSI.Interface;

public class Main {

    /* An e-commerce company has made it mandatory for all the customers to pay tax on every purchase and
       also for all the sellers to pay a certain amount of tax based on their location.
       You need to help the e-commerce company by implementing an application for paying tax based on the class:
       -- Seller (Class)
       -- PurchaseDetails (Class)
       -- Tax (Interface)
       Method Description:
       -- PurchaseDetails:
            -- Purchase(String purchaseId, String paymentType)
                   Initialize the purchaseId and paymentType instance variables using the values passed to the constructor.
            -- calculateTax(double price)
                   Initialize the value of the taxPercentage instance variable based on the details given below:
                        -- Debit Card         - 2% tax
                        -- Credit Card        - 3% tax
                        -- Other Payments     - 4% tax
                   Calculate and return the total amount (including the tax amount) that needs to be paid.
      Implement the getter and setter methods appropriately.
      -- Seller:
            -- Seller(String location)
                    Initialize the location instance variable using the value passed to the constructor.
            -- calculateTax(double price)
                    Initialize the value of taxPercentage instance variable based on the details given below:
                        -- Middle East   - 15% tax
                        -- Europe        - 25% tax
                        -- Canada        - 22% tax
                        __ Japan         - 12% tax
                        Calculate and return the tax amount that needs to be paid.
      Implement the getter and setter methods appropriately.
    */

    public static void main(String[] args) {
        System.out.println("Purchase Details\n***************");
        PurchaseDetails purchaseDetails = new PurchaseDetails("P1001","Credit Card");
        System.out.println("Total purchase amount: " + Math.round(purchaseDetails.calculateTax(100)*100)/100.0);
        System.out.println("Tax percentage: "+purchaseDetails.getTaxPercentage());
        System.out.println();

        System.out.println("Seller Details\n***************");
        Seller seller = new Seller("Canada");
        System.out.println("Tax to be paid by the seller: " + Math.round(seller.calculateTax(100)*100)/100.0);
        System.out.println("Tax percentage: "+seller.getTaxPercentage());
        System.out.println();

        System.out.println("Purchase Details\n***************");
        PurchaseDetails purchaseDetails2 = new PurchaseDetails("P1001","Debit Card");
        System.out.println("Total purchase amount: " + Math.round(purchaseDetails2.calculateTax(100)*100)/100.0);
        System.out.println("Tax percentage: "+purchaseDetails2.getTaxPercentage());
        System.out.println();

        System.out.println("Seller Details\n***************");
        Seller seller2 = new Seller("Japan");
        System.out.println("Tax to be paid by the seller: " + Math.round(seller2.calculateTax(100)*100)/100.0);
        System.out.println("Tax percentage: "+seller2.getTaxPercentage());
        System.out.println();
    }
}
