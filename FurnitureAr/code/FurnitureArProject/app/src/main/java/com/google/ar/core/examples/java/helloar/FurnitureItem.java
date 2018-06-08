package com.google.ar.core.examples.java.helloar;

public class FurnitureItem {
    private String mFurnitureName;
    private int mFlagImage;

    public FurnitureItem(String furnitureName, int flagImage) {
        mFurnitureName = furnitureName;
        mFlagImage = flagImage;
    }

    public String getFurnitureName() {
        return mFurnitureName;
    }

    public int getFlagImage() {
        return mFlagImage;
    }
}
