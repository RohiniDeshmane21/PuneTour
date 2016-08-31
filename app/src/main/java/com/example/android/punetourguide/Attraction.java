package com.example.android.punetourguide;

/**
 * Created by Rupali on 31-08-2016.
 */
public class Attraction {
    private int attractionName;
    private int attractionInfo;
    private double longitude;
    private double latitude;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int attractionPhoto = NO_IMAGE_PROVIDED;

    public Attraction(int attractionNm, int info,int photo,double lang, double lati)
    {
        attractionName=attractionNm;
        attractionInfo = info;
        longitude = lang;
        latitude = lati;
        attractionPhoto = photo;
    }

    public int getAttractionName() {
        return attractionName;
    }

    public int getAttractionInfo() {
        return attractionInfo;
    }

    public double getlongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public int getAttractionPhoto() {
        return attractionPhoto;
    }

    public boolean hasImage()
    {
        return attractionPhoto != NO_IMAGE_PROVIDED;
    }

}
