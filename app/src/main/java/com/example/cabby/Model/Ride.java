package com.example.cabby.Model;


import android.os.Parcel;
import android.os.Parcelable;

public class Ride implements Parcelable {
    private String from;
    private String to;
    private String date;
    private String time;
    private String driver;



    private String car_type;

    public Ride(String from, String to, String date, String time, String driver, String car_type) {
        this.from = from;
        this.to = to;
        this.date = date;
        this.time = time;
        this.driver = driver;
        this.car_type = car_type;
    }

    protected Ride(Parcel in) {
        from = in.readString();
        to = in.readString();
        date = in.readString();
        time = in.readString();
        driver = in.readString();
        car_type = in.readString();
    }

    public static final Creator<Ride> CREATOR = new Creator<Ride>() {
        @Override
        public Ride createFromParcel(Parcel in) {
            return new Ride(in);
        }

        @Override
        public Ride[] newArray(int size) {
            return new Ride[size];
        }
    };

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

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getCar_type() {
        return car_type;
    }

    public void setCar_type(String car_type) {
        this.car_type = car_type;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(from);
        parcel.writeString(to);
        parcel.writeString(date);
        parcel.writeString(time);
        parcel.writeString(driver);
    }
}
