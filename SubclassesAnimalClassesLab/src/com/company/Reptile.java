package com.company;

/**
 * Created by stacyzolnikov on 6/28/16.
 */
public class Reptile extends Animal {
    private String mSkinType;

    public Reptile (String name, int numLegs, int topSpeed, boolean isEndangered){
        super (name, 0, 5, false);
        mSkinType = "scales";
    }
    public Reptile ( String skinType){
        super ();
        mSkinType = skinType;
    }

    public String getSkinType () {
        return mSkinType;
    }



}
