package com.example.android.quakereport;

/**
 * Created by Mohammed Abdullah on 9/8/2017.
 */

public class Earthquake {


    private double mMagnitude;

    private  String mLocation ;

    private long mTimeInMilliseconds;

    private  String url ;

    public Earthquake(double mMagnitude, String mLocation, Long mTimeInMilliseconds , String url) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mTimeInMilliseconds = mTimeInMilliseconds;
        this.url = url ;
    }

    public double getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }
    public String getUrl() {
        return url;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public Earthquake() {
    }
}
