package com.example.cabby.Tools;

import com.example.cabby.Model.Message;
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

    public static List<Message> getPassengerMessages(){
        ArrayList<Message> messages = new ArrayList<Message>();
        Message m1 = new Message("Jovan", "Stigao sam", "11.11.2022.");
        Message m2 = new Message("Vukasin", "Stizem", "10.11.2022.");
        Message m3 = new Message("Vlada", "Dolazim", "09.11.2022.");

        messages.add(m1);
        messages.add(m2);
        messages.add(m3);

        return messages;

    }

}
