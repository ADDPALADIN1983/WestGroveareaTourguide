package com.example.alangregos.westgroveareatourguide;

public class ListEntry {
    /*  class for what each entry will contain.
        getters for information contained in each entry
        constructors build the entry and place it into the arrayList.
     */

    private String mBussinessName;
    private String mBussinessStreetAddress;
    private String mCityStateZip;
    private String mBusinessWebsite = null;
    private String mPhoneNumber = null;
    private double mDecimalLatitude;
    private double mDecimalLongitude;
    private final int NO_IMAGE_PROVIDED = -1;
    private int mImage = NO_IMAGE_PROVIDED;

    //Full constructor for locations that have an address, website and phone number.
    public ListEntry(String name, String street, String cityStateZip, String website, String phone, double lat, double lng, int image) {

        mBussinessName = name;
        mBussinessStreetAddress = street;
        mCityStateZip = cityStateZip;
        mBusinessWebsite = website;
        mPhoneNumber = phone;
        mDecimalLatitude = lat;
        mDecimalLongitude = lng;
        mImage = image;

    }

    //Construtor for locations that don't have website.
    public ListEntry(String name, String street, String cityStateZip, String phone, double lat, double lng, int image) {

        mBussinessName = name;
        mBussinessStreetAddress = street;
        mCityStateZip = cityStateZip;
        mPhoneNumber = phone;
        mDecimalLatitude = lat;
        mDecimalLongitude = lng;
        mImage = image;

    }

    //Constructor for locations that don't have a website or a phone number.
    public ListEntry(String name, String street, String cityStateZip, double lat, double lng, int image) {

        mBussinessName = name;
        mBussinessStreetAddress = street;
        mCityStateZip = cityStateZip;
        mDecimalLatitude = lat;
        mDecimalLongitude = lng;
        mImage = image;

    }

    public String getmBussinessName() {
        return mBussinessName;
    }

    public String getmBussinessStreetAddress() {
        return mBussinessStreetAddress;
    }

    public String getmCityStateZip() {
        return mCityStateZip;
    }

    public String getmBusinessWebsite() {
        return mBusinessWebsite;
    }

    public String getmPhoneNumber() {
        return mPhoneNumber;
    }

    public Double getDecimalLatitude() {
        return mDecimalLatitude;
    }

    public double getmDecimalLongitude() {
        return mDecimalLongitude;
    }

    public int getmImage() {
        return mImage;
    }

    public boolean hasImage() {

        return mImage != NO_IMAGE_PROVIDED;
    }

}