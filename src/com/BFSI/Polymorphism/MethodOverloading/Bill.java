package com.BFSI.Polymorphism.MethodOverloading;

public class Bill{
    int itemId, size;
    String brandName, itemType;
    double price;

    public Bill(){}

    public Bill(int itemId, int size, String brandName, String itemType, double price) {
        this.itemId = itemId;
        this.size = size;
        this.brandName = brandName;
        this.itemType = itemType;
        this.price = price;
    }
    //same method with different method signature. i.e. Method Overloading
    public double findPrice(int itemId, Bill[] arrOfItems)
    {
        for(Bill i: arrOfItems)
        {
            if(i.itemId == itemId)
            {
                return i.price;
            }
        }
        return 0;
    }
    public double findPrice(String brandName, String itemType, int size, Bill[] arrOfItems)
    {
        for(Bill i: arrOfItems)
        {
            if(i.brandName.equals(brandName) && i.itemType.equals(itemType) && i.size == size)
            {
                return i.price;
            }
        }
        return 0;
    }
}
