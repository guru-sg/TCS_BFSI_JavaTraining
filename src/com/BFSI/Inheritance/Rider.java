package com.BFSI.Inheritance;

public class Rider {
    int experience;
    boolean trainedStatus;
    Rider(){}
    public Rider(int experience, boolean trainedStatus) {
        this.experience = experience;
        this.trainedStatus = trainedStatus;
    }

    public void ridesVehicle(Rider obj)
    {       if(obj.trainedStatus)
                System.out.println("Some driver having " + obj.experience+ " years experience and trained status is driving vehicle");
            else
                System.out.println("Some driver having " + obj.experience+ " years experience but no trained status is driving vehicle");
    }

}
