package com.phattarapong.learnmvp.home.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Phattarapong on 9/26/2017.
 */

public class MeanSeaLevelPressure implements Parcelable
{

    @SerializedName("Value")
    @Expose
    private Double value;
    @SerializedName("Unit")
    @Expose
    private String unit;
    public final static Parcelable.Creator<MeanSeaLevelPressure> CREATOR = new Creator<MeanSeaLevelPressure>() {


        @SuppressWarnings({
                "unchecked"
        })
        public MeanSeaLevelPressure createFromParcel(Parcel in) {
            return new MeanSeaLevelPressure(in);
        }

        public MeanSeaLevelPressure[] newArray(int size) {
            return (new MeanSeaLevelPressure[size]);
        }

    }
            ;

    protected MeanSeaLevelPressure(Parcel in) {
        this.value = ((Double) in.readValue((Double.class.getClassLoader())));
        this.unit = ((String) in.readValue((String.class.getClassLoader())));
    }

    public MeanSeaLevelPressure() {
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