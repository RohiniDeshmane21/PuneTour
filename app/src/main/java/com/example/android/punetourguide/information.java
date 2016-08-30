package com.example.android.punetourguide;

/**
 * Created by Rupali on 30-08-2016.
 */
public class information {

    private String category;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int imageResource = NO_IMAGE_PROVIDED;

    public information(String categoryName,int image)
    {
        category = categoryName;
        imageResource= image;
    }

    public String getCategory()
    {
        return category;
    }

    public int getImageResource()
    {
        return imageResource;
    }
    public boolean hasImage()
    {
        return imageResource != NO_IMAGE_PROVIDED;
    }

}