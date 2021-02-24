package com.example.tourguideapp;

public class Data {

    private String mPlaceName;
    private String mPlacedetails;
    private int mPlaceImageId;
    private String mNumber;
    private String mAddress;
    private String mCoordinate;


    public Data(String placeName, int placeImageId, String placeDetails, String number, String address, String coordinate) {

        mPlaceName = placeName;
        mPlacedetails = placeDetails;
        mPlaceImageId = placeImageId;
        mNumber = number;
        mAddress = address;
        mCoordinate = coordinate;
    }


    public String getPlaceName() {
        return mPlaceName;
    }

    public String getPlacedetails() {
        return mPlacedetails;
    }

    public int getPlaceImageId() {
        return mPlaceImageId;
    }

    public String getCoordinate() {
        return mCoordinate;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getNumber() {
        return mNumber;
    }

}