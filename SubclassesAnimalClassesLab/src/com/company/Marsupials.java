package com.company;

/**
 * Created by stacyzolnikov on 6/28/16.
 */
public class Marsupials extends Mammal {
    private String mTypesOfPouch;

    public Marsupials () {
        super();
        mTypesOfPouch = "forward";
    }

    public Marsupials (String typeOfPouch) {
        super();
        mTypesOfPouch = typeOfPouch;
    }

    public String getTypeOfPouch () {
        return mTypesOfPouch;
    }
}
