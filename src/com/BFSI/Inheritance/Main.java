package com.BFSI.Inheritance;

public class Main {

    /*
        The circus has hired two riders – a bike rider and a cycle rider.
        Both of them ride vehicles but bike rider rides the bike in a dome
        whereas the cycle rider rides the cycle blind folded.
        The circus manger has also ensured that both of them are trained and
        have enough experience of performing these stunts in circus.
        Apart from this, bike rider also has a race license.
        Create the class diagram for representing the above scenario using the data given below.
        -- experience
        -- Rider
        -- ridesBlindfolded()
        -- trainedStatus
        -- ridesVehicle()
        -- BikeRider
        -- CycleRider
        -- raceLicense
        -- ridesInDome().
        ridesVehicle(), ridesInDome(), ridesBlindfolded() methods should display
        appropriate messages. Assume that trainedStatus and raceLicense are boolean variables
        and experience is an integer.
     */
    public static void main(String[] args){
        Rider someRider = new Rider(2, true);
        someRider.ridesVehicle(someRider);
        Rider someRider1 = new Rider(2, false);
        someRider1.ridesVehicle(someRider1);
        BikeRider bikeRider = new BikeRider(true, true, 2);
        bikeRider.ridesInDoom(bikeRider);
        BikeRider bikeRider1 = new BikeRider(false, true, 2);
        bikeRider1.ridesInDoom(bikeRider1);
        BikeRider bikeRider2 = new BikeRider(true, false, 2);
        bikeRider2.ridesInDoom(bikeRider2);
        CycleRider cycleRider = new CycleRider(true, 2);
        cycleRider.ridesBlindfolded(cycleRider);
        CycleRider cycleRider1 = new CycleRider(false, 2);
        cycleRider1.ridesBlindfolded(cycleRider1);
    }



}
