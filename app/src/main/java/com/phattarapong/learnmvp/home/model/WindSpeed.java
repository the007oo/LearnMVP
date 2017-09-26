package com.phattarapong.learnmvp.home.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Phattarapong on 9/26/2017.
 */

public class WindSpeed implements Parcelable
{

    @SerializedName("Value")
    @Expose
    private Integer value;
    @SerializedName("Unit")
    @Expose
    private String unit;
    public final static Parcelable.Creator<WindSpeed> CREATOR = new Creator<WindSpeed>() {


        @SuppressWarnings({
                "unchecked"
        })
        public WindSpeed createFromParcel(Parcel in) {
            return new WindSpeed(in);
        }

        public WindSpeed[] newArray(int size) {
            return (new WindSpeed[size]);
        }

    }
            ;

    protected WindSpeed(Parcel in) {
        this.value = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.unit = ((String) in.readValue((String.class.getClassLoader())));
    }

    public WindSpeed() {
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
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
