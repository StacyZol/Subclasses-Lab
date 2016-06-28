package com.company;

/**
 * Created by stacyzolnikov on 6/28/16.
 */
public class Mammal extends Animal {
    private boolean mLivesOnLand;

    public Mammal () {
        super ();
        mLivesOnLand = true;
    }

    public Mammal (String name, boolean livesOnLand){
        super(name, 2, 30, false);
        mLivesOnLand = livesOnLand;

    }

    public boolean getLivesOnLand () {
        return mLivesOnLand;
    }

}
