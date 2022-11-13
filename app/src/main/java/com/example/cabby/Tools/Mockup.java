package com.example.cabby.Tools;

import com.example.cabby.Model.Ride;

import java.util.ArrayList;
import java.util.List;

public class Mockup {

    public static List<Ride> getRides(){
        ArrayList<Ride> rides = new ArrayList<Ride>();
        Ride r1 = new Ride("Test1", "Test1", "Test1", "Test1", "Luka Djordjevic", "SUV");
        Ride r2 = new Ride("Test2", "Test2", "Test2", "Test2", "Marko Janosevic", "Sports");
        Ride r3 = new Ride("Test3", "Test3", "Test3", "Test3", "Milos Cuturic", "Limo");
        rides.add(r1);
        rides.add(r2);
        rides.add(r3);
        rides.add(r3);
        rides.add(r3);
        rides.add(r3);
        rides.add(r3);
        rides.add(r3);
        rides.add(r3);
        rides.add(r3);
        rides.add(r3);
        rides.add(r3);
        rides.add(r3);
        rides.add(r3);
        rides.add(r3);
        rides.add(r3);
        rides.add(r3);
        rides.add(r3);
        rides.add(r3);


        return rides;
    }

}
