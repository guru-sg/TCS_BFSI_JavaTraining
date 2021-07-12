package com.BFSI.Inheritance;

public class BikeRider extends Rider {
    boolean raceLicense;

    //trainedStatus and experience inherited from parent class Rider

    public BikeRider(boolean raceLicense, boolean trainedStatus, int experience) {
        this.raceLicense = raceLicense;
        this.trainedStatus = trainedStatus;
        this.experience = experience;
    }
    public void ridesInDoom(BikeRider obj)
    {
        if(!(obj.raceLicense))
            System.out.println("The BikeRider cannot perform as he has no race license");
        else if(!(trainedStatus))
            System.out.println("The BikeRider cannot perform as he has no trained status");
        else
            System.out.println("The BikeRider is riding bike in the dome");
    }
}
