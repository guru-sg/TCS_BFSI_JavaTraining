package com.BFSI.Interface;

public class Seller implements Tax{

    private String location;
    private double taxPercentage;

    public Seller(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    @Override
    public double calculateTax(double price) {
        if(getLocation().equals("Middle east"))
            setTaxPercentage(15);
        else if(getLocation().equals("Europe"))
            setTaxPercentage(25);
        else if(getLocation().equals("Canada"))
            setTaxPercentage(22);
        else if(getLocation().equals("Japan"))
            setTaxPercentage(12);

        return (price * (getTaxPercentage()/(double)100));
    }
}
