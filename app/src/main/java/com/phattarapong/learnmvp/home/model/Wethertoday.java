package com.phattarapong.learnmvp.home.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Phattarapong on 9/26/2017.
 */

public class Wethertoday implements Parcelable
{

    @SerializedName("Header")
    @Expose
    private Header header;
    @SerializedName("Stations")
    @Expose
    private List<Station> stations = null;
    public final static Parcelable.Creator<Wethertoday> CREATOR = new Creator<Wethertoday>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Wethertoday createFromParcel(Parcel in) {
            return new Wethertoday(in);
        }

        public Wethertoday[] newArray(int size) {
            return (new Wethertoday[size]);
        }

    }
            ;

    protected Wethertoday(Parcel in) {
        this.header = ((Header) in.readValue((Header.class.getClassLoader())));
        in.readList(this.stations, (com.phattarapong.learnmvp.home.model.Station.class.getClassLoader()));
    }

    public Wethertoday() {
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public List<Station> getStations() {
        return stations;
    }

    public void setStations(List<Station> stations) {
        this.stations = stations;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(header);
        dest.writeList(stations);
    }

    public int describeContents() {
        return 0;
    }

}
