package com.phattarapong.learnmvp.home.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Phattarapong on 9/26/2017.
 */

public class Observe implements Parcelable
{

    @SerializedName("Time")
    @Expose
    private String time;
    @SerializedName("MeanSeaLevelPressure")
    @Expose
    private MeanSeaLevelPressure meanSeaLevelPressure;
    @SerializedName("Temperature")
    @Expose
    private Temperature temperature;
    @SerializedName("MaxTemperature")
    @Expose
    private MaxTemperature maxTemperature;
    @SerializedName("DiffMaxTemperature")
    @Expose
    private DiffMaxTemperature diffMaxTemperature;
    @SerializedName("MinTemperature")
    @Expose
    private MinTemperature minTemperature;
    @SerializedName("DiffMinTemperature")
    @Expose
    private DiffMinTemperature diffMinTemperature;
    @SerializedName("RelativeHumidity")
    @Expose
    private RelativeHumidity relativeHumidity;
    @SerializedName("WindDirection")
    @Expose
    private WindDirection windDirection;
    @SerializedName("WindSpeed")
    @Expose
    private WindSpeed windSpeed;
    @SerializedName("Rainfall")
    @Expose
    private Rainfall rainfall;
    public final static Parcelable.Creator<Observe> CREATOR = new Creator<Observe>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Observe createFromParcel(Parcel in) {
            return new Observe(in);
        }

        public Observe[] newArray(int size) {
            return (new Observe[size]);
        }

    }
            ;

    protected Observe(Parcel in) {
        this.time = ((String) in.readValue((String.class.getClassLoader())));
        this.meanSeaLevelPressure = ((MeanSeaLevelPressure) in.readValue((MeanSeaLevelPressure.class.getClassLoader())));
        this.temperature = ((Temperature) in.readValue((Temperature.class.getClassLoader())));
        this.maxTemperature = ((MaxTemperature) in.readValue((MaxTemperature.class.getClassLoader())));
        this.diffMaxTemperature = ((DiffMaxTemperature) in.readValue((DiffMaxTemperature.class.getClassLoader())));
        this.minTemperature = ((MinTemperature) in.readValue((MinTemperature.class.getClassLoader())));
        this.diffMinTemperature = ((DiffMinTemperature) in.readValue((DiffMinTemperature.class.getClassLoader())));
        this.relativeHumidity = ((RelativeHumidity) in.readValue((RelativeHumidity.class.getClassLoader())));
        this.windDirection = ((WindDirection) in.readValue((WindDirection.class.getClassLoader())));
        this.windSpeed = ((WindSpeed) in.readValue((WindSpeed.class.getClassLoader())));
        this.rainfall = ((Rainfall) in.readValue((Rainfall.class.getClassLoader())));
    }

    public Observe() {
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public MeanSeaLevelPressure getMeanSeaLevelPressure() {
        return meanSeaLevelPressure;
    }

    public void setMeanSeaLevelPressure(MeanSeaLevelPressure meanSeaLevelPressure) {
        this.meanSeaLevelPressure = meanSeaLevelPressure;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public MaxTemperature getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(MaxTemperature maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public DiffMaxTemperature getDiffMaxTemperature() {
        return diffMaxTemperature;
    }

    public void setDiffMaxTemperature(DiffMaxTemperature diffMaxTemperature) {
        this.diffMaxTemperature = diffMaxTemperature;
    }

    public MinTemperature getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(MinTemperature minTemperature) {
        this.minTemperature = minTemperature;
    }

    public DiffMinTemperature getDiffMinTemperature() {
        return diffMinTemperature;
    }

    public void setDiffMinTemperature(DiffMinTemperature diffMinTemperature) {
        this.diffMinTemperature = diffMinTemperature;
    }

    public RelativeHumidity getRelativeHumidity() {
        return relativeHumidity;
    }

    public void setRelativeHumidity(RelativeHumidity relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    public WindDirection getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(WindDirection windDirection) {
        this.windDirection = windDirection;
    }

    public WindSpeed getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(WindSpeed windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Rainfall getRainfall() {
        return rainfall;
    }

    public void setRainfall(Rainfall rainfall) {
        this.rainfall = rainfall;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(time);
        dest.writeValue(meanSeaLevelPressure);
        dest.writeValue(temperature);
        dest.writeValue(maxTemperature);
        dest.writeValue(diffMaxTemperature);
        dest.writeValue(minTemperature);
        dest.writeValue(diffMinTemperature);
        dest.writeValue(relativeHumidity);
        dest.writeValue(windDirection);
        dest.writeValue(windSpeed);
        dest.writeValue(rainfall);
    }

    public int describeContents() {
        return 0;
    }

}
