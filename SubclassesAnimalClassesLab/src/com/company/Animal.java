package com.company;

/**
 * Created by stacyzolnikov on 6/28/16.
 */
public class Animal {
    private String mName;
    private int mNumLegs;
    private int mTopSpeed;
    private Boolean mIsEndangered;

    public Animal (String name, int numLegs, int topSpeed, boolean isEndangered) {
        mName = name;
        mNumLegs = numLegs;
        mTopSpeed = topSpeed;
        mIsEndangered = isEndangered;
    }

    public Animal () {
        mName = "no name";
        mNumLegs = 4;
        mTopSpeed = 5;
        mIsEndangered = false;
    }

    public void setSpeed (int topSpeed) {
        mTopSpeed = topSpeed;
    }

    public int getSpeed () {
        return mTopSpeed;
    }
    public void setLegs (int numLegs){
        mNumLegs = numLegs;
    }
    public int getLegs() {
        return mNumLegs;
    }
    public String getName() {
        return mName;
    }
    public boolean getIsEndangered() {
        return mIsEndangered;
    }
}
