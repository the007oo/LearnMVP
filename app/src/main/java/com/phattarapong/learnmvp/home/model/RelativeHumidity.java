package com.phattarapong.learnmvp.home.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Phattarapong on 9/26/2017.
 */

public class RelativeHumidity implements Parcelable
{

    @SerializedName("Value")
    @Expose
    private Integer value;
    @SerializedName("Unit")
    @Expose
    private String unit;
    public final static Parcelable.Creator<RelativeHumidity> CREATOR = new Creator<RelativeHumidity>() {


        @SuppressWarnings({
                "unchecked"
        })
        public RelativeHumidity createFromParcel(Parcel in) {
            return new RelativeHumidity(in);
        }

        public RelativeHumidity[] newArray(int size) {
            return (new RelativeHumidity[size]);
        }

    }
            ;

    protected RelativeHumidity(Parcel in) {
        this.value = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.unit = ((String) in.readValue((String.class.getClassLoader())));
    }

    public RelativeHumidity() {
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
