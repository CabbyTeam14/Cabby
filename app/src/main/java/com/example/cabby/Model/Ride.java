package com.example.cabby.Model;


public class Ride {
    private String from;
    private String to;
    private String date;
    private String time;
    private String driverImage;

    public Ride(String from, String to, String date, String time, String driverImage) {
        this.from = from;
        this.to = to;
        this.date = date;
        this.time = time;
        this.driverImage = driverImage;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDriverImage() {
        return driverImage;
    }

    public void setDriverImage(String driverImage) {
        this.driverImage = driverImage;
    }


}
