package com.example.android.guideme;

public class Location {
    //mImageResourceId for storing the image resource id
    private int mImageResourceId;
    //mName and mAddress for storing the name of place and its address respectively
    private int mNameResourceId , mAddressResourceId;
    //Constructor for creation of objects of Location class
    public Location(int mImageResourceId,int mName,int mAddress){
        this.mImageResourceId = mImageResourceId;
        this.mNameResourceId = mName;
        this.mAddressResourceId = mAddress;
    }
    //returns the image resource id of current object
    public int getImageResourceId(){
        return mImageResourceId;
    }
    //returns the name of place of the current object
    public int getName() {
        return mNameResourceId;
    }
    //returns the address of place of the current object

    public int getAddress() {
        return mAddressResourceId;
    }
}
