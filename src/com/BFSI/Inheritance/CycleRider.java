package com.BFSI.Inheritance;

public class CycleRider extends Rider{

    //trainedStatus and experience inherited from parent class Rider

    public CycleRider(boolean trainedStatus, int experience) {
        this.trainedStatus = trainedStatus;
        this.experience = experience;
    }
    public void ridesBlindfolded(CycleRider obj)
    {
        if(obj.trainedStatus)
            System.out.println("CycleRider who has "+obj.experience+" years experience and trained status is riding the cycle blindfolded");
        else
            System.out.println("CycleRider has no trained status. So, he cannot perform Blindfolded Ride");
    }
}
