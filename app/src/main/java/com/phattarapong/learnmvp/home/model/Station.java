package com.phattarapong.learnmvp.home.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Phattarapong on 9/26/2017.
 */

public class Station implements Parcelable
{

    @SerializedName("WmoNumber")
    @Expose
    private String wmoNumber;
    @SerializedName("StationNameTh")
    @Expose
    private String stationNameTh;
    @SerializedName("StationNameEng")
    @Expose
    private String stationNameEng;
    @SerializedName("Province")
    @Expose
    private String province;
    @SerializedName("Latitude")
    @Expose
    private Latitude latitude;
    @SerializedName("Longitude")
    @Expose
    private Longitude longitude;
    @SerializedName("Observe")
    @Expose
    private Observe observe;
    public final static Parcelable.Creator<Station> CREATOR = new Creator<Station>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Station createFromParcel(Parcel in) {
            return new Station(in);
        }

        public Station[] newArray(int size) {
            return (new Station[size]);
        }

    }
            ;

    protected Station(Parcel in) {
        this.wmoNumber = ((String) in.readValue((String.class.getClassLoader())));
        this.stationNameTh = ((String) in.readValue((String.class.getClassLoader())));
        this.stationNameEng = ((String) in.readValue((String.class.getClassLoader())));
        this.province = ((String) in.readValue((String.class.getClassLoader())));
        this.latitude = ((Latitude) in.readValue((Latitude.class.getClassLoader())));
        this.longitude = ((Longitude) in.readValue((Longitude.class.getClassLoader())));
        this.observe = ((Observe) in.readValue((Observe.class.getClassLoader())));
    }

    public Station() {
    }

    public String getWmoNumber() {
        return wmoNumber;
    }

    public void setWmoNumber(String wmoNumber) {
        this.wmoNumber = wmoNumber;
    }

    public String getStationNameTh() {
        return stationNameTh;
    }

    public void setStationNameTh(String stationNameTh) {
        this.stationNameTh = stationNameTh;
    }

    public String getStationNameEng() {
        return stationNameEng;
    }

    public void setStationNameEng(String stationNameEng) {
        this.stationNameEng = stationNameEng;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Latitude getLatitude() {
        return latitude;
    }

    public void setLatitude(Latitude latitude) {
        this.latitude = latitude;
    }

    public Longitude getLongitude() {
        return longitude;
    }

    public void setLongitude(Longitude longitude) {
        this.longitude = longitude;
    }

    public Observe getObserve() {
        return observe;
    }

    public void setObserve(Observe observe) {
        this.observe = observe;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(wmoNumber);
        dest.writeValue(stationNameTh);
        dest.writeValue(stationNameEng);
        dest.writeValue(province);
        dest.writeValue(latitude);
        dest.writeValue(longitude);
        dest.writeValue(observe);
    }

    public int describeContents() {
        return 0;
    }

}
