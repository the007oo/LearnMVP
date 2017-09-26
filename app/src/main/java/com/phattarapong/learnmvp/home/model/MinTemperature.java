package com.phattarapong.learnmvp.home.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Phattarapong on 9/26/2017.
 */

public class MinTemperature implements Parcelable
{

    @SerializedName("Value")
    @Expose
    private Double value;
    @SerializedName("Unit")
    @Expose
    private String unit;
    public final static Parcelable.Creator<MinTemperature> CREATOR = new Creator<MinTemperature>() {


        @SuppressWarnings({
                "unchecked"
        })
        public MinTemperature createFromParcel(Parcel in) {
            return new MinTemperature(in);
        }

        public MinTemperature[] newArray(int size) {
            return (new MinTemperature[size]);
        }

    }
            ;

    protected MinTemperature(Parcel in) {
        this.value = ((Double) in.readValue((Double.class.getClassLoader())));
        this.unit = ((String) in.readValue((String.class.getClassLoader())));
    }

    public MinTemperature() {
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
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
