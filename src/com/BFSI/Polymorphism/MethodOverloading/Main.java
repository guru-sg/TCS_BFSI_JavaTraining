package com.BFSI.Polymorphism.MethodOverloading;

public class Main {

    /* The Bill class is used to find the price of items for calculation.
       Implement a class Bill based on the class diagram and description given below.
       findPrice(itemId: int): double
       findPrice(brandName: String, itemType: String, size: int): double
       Method Description:
       -- findPrice(int itemId, Bill arrOfItems):
            Find and return the price based on the itemId.
            If the itemId passed to method is invalid, return the price as 0.
       -- findPrice(String brandName, String itemType, int size, Bill arrOfItems[]):
            Find and return the price based on the brandName, itemType and size.
            If any invalid details are passed to the method, return the price as 0.
     */
    public static void main(String[] args) {
        Bill[] arrOfItems = new Bill[4];
        arrOfItems[0] = new Bill(101, 34, "Puma", "T-Shirt", 500);
        arrOfItems[1] = new Bill(102, 38, "Puma", "Skirt", 550);
        arrOfItems[2] = new Bill(103, 34, "Reebok", "T-Shirt", 480);
        arrOfItems[3] = new Bill(104, 38, "Reebok", "Skirt", 500);

        Bill bill = new Bill();
        double price = bill.findPrice(102, arrOfItems);
        if(price >0)
            System.out.println("Price of the selected item is Rs. "+ price);
        else
            System.out.println("The Item Id is invalid");

        price = bill.findPrice("Reebok","T-Shirt",34, arrOfItems);
        if(price >0)
            System.out.println("Price of the selected item is Rs. "+ price);
        else
            System.out.println("The values are not valid");
    }
}
