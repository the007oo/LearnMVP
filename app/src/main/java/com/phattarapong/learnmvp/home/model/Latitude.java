package com.phattarapong.learnmvp.home.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Phattarapong on 9/26/2017.
 */

public class Latitude implements Parcelable
{

    @SerializedName("Value")
    @Expose
    private String value;
    @SerializedName("Unit")
    @Expose
    private String unit;
    public final static Parcelable.Creator<Latitude> CREATOR = new Creator<Latitude>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Latitude createFromParcel(Parcel in) {
            return new Latitude(in);
        }

        public Latitude[] newArray(int size) {
            return (new Latitude[size]);
        }

    }
            ;

    protected Latitude(Parcel in) {
        this.value = ((String) in.readValue((String.class.getClassLoader())));
        this.unit = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Latitude() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(value);
        dest.writeValue(unit);
    }

    public int describeContents() {
        return 0;
    }

}