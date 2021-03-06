package com.phattarapong.learnmvp.home.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Phattarapong on 9/26/2017.
 */

public class WindDirection implements Parcelable
{

    @SerializedName("Value")
    @Expose
    private String value;
    @SerializedName("Unit")
    @Expose
    private String unit;
    public final static Parcelable.Creator<WindDirection> CREATOR = new Creator<WindDirection>() {


        @SuppressWarnings({
                "unchecked"
        })
        public WindDirection createFromParcel(Parcel in) {
            return new WindDirection(in);
        }

        public WindDirection[] newArray(int size) {
            return (new WindDirection[size]);
        }

    }
            ;

    protected WindDirection(Parcel in) {
        this.value = ((String) in.readValue((String.class.getClassLoader())));
        this.unit = ((String) in.readValue((String.class.getClassLoader())));
    }

    public WindDirection() {
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
