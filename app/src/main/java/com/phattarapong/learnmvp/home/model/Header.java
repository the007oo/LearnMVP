package com.phattarapong.learnmvp.home.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Phattarapong on 9/26/2017.
 */

public class Header implements Parcelable
{

    @SerializedName("Title")
    @Expose
    private String title;
    @SerializedName("Description")
    @Expose
    private String description;
    @SerializedName("Uri")
    @Expose
    private String uri;
    @SerializedName("LastBuiltDate")
    @Expose
    private String lastBuiltDate;
    @SerializedName("CopyRight")
    @Expose
    private String copyRight;
    @SerializedName("Generator")
    @Expose
    private String generator;
    public final static Parcelable.Creator<Header> CREATOR = new Creator<Header>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Header createFromParcel(Parcel in) {
            return new Header(in);
        }

        public Header[] newArray(int size) {
            return (new Header[size]);
        }

    }
            ;

    protected Header(Parcel in) {
        this.title = ((String) in.readValue((String.class.getClassLoader())));
        this.description = ((String) in.readValue((String.class.getClassLoader())));
        this.uri = ((String) in.readValue((String.class.getClassLoader())));
        this.lastBuiltDate = ((String) in.readValue((String.class.getClassLoader())));
        this.copyRight = ((String) in.readValue((String.class.getClassLoader())));
        this.generator = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Header() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getLastBuiltDate() {
        return lastBuiltDate;
    }

    public void setLastBuiltDate(String lastBuiltDate) {
        this.lastBuiltDate = lastBuiltDate;
    }

    public String getCopyRight() {
        return copyRight;
    }

    public void setCopyRight(String copyRight) {
        this.copyRight = copyRight;
    }

    public String getGenerator() {
        return generator;
    }

    public void setGenerator(String generator) {
        this.generator = generator;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(title);
        dest.writeValue(description);
        dest.writeValue(uri);
        dest.writeValue(lastBuiltDate);
        dest.writeValue(copyRight);
        dest.writeValue(generator);
    }

    public int describeContents() {
        return 0;
    }

}
