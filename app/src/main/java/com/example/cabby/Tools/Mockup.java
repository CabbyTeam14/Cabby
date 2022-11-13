package com.example.cabby.Tools;

import com.example.cabby.Model.Ride;

import java.util.ArrayList;
import java.util.List;

public class Mockup {

    public static List<Ride> getRides(){
        ArrayList<Ride> rides = new ArrayList<Ride>();
        Ride r1 = new Ride("Test1", "Test1", "Test1", "Test1", "/C:/Users/lukac/Downloads/luka.png");
        Ride r2 = new Ride("Test1", "Test1", "Test1", "Test1", "\"C:\\Users\\lukac\\Downloads\\luka.png\"");
        Ride r3 = new Ride("Test1", "Test1", "Test1", "Test1", "\"C:\\Users\\lukac\\Downloads\\luka.png\"");
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
