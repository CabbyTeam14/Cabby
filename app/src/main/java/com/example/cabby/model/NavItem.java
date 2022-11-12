package com.example.cabby.model;

import android.os.Parcel;
import android.os.Parcelable;

public class NavItem implements Parcelable {
    private String mTitle;
    private int mIcon;

    public NavItem(String title, int icon) {
        mTitle = title;
        mIcon = icon;
    }

    protected NavItem(Parcel in) {
        mTitle = in.readString();
        mIcon = in.readInt();
    }

    public static final Creator<NavItem> CREATOR = new Creator<NavItem>() {
        @Override
        public NavItem createFromParcel(Parcel in) {
            return new NavItem(in);
        }

        @Override
        public NavItem[] newArray(int size) {
            return new NavItem[size];
        }
    };

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public int getmIcon() {
        return mIcon;
    }

    public void setmIcon(int mIcon) {
        this.mIcon = mIcon;
    }

    @Override
    public String toString() {

        return mTitle;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
        out.writeString(mTitle);
        out.writeInt(mIcon);

    }
}
