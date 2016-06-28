package com.company;

/**
 * Created by stacyzolnikov on 6/28/16.
 */
public class Dinosaur extends Reptile {
    private boolean mEatsHumans;


    public Dinosaur (String name, int numLegs, int topSpeed, boolean isEndangered) {
        super (name, 2, 30, true);
        mEatsHumans = true;
    }



    public boolean getEatsHumans () {
        return mEatsHumans;
    }

}
