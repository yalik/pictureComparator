package com.epam.picturecomparator.utils;

import com.epam.picturecomparator.model.Picture;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Konstantin_Yalovik on 11/10/2016.
 */
public class PictureComparatorUtils
{
    public static List<Picture> getPicturesFromMonth(List<Picture> allPictures, String month) {
        List<Picture> monthPictures = new ArrayList<Picture>();

        for(Picture picture: allPictures) {
            if (picture.getMonthFolder().contains(month)){
                monthPictures.add(picture);
            }
        }

        return monthPictures;
    }

    public static List<Picture> getPicturesFromAddress(List<Picture> allPictures, String address) {
        List<Picture> addressPictures = new ArrayList<Picture>();

        for(Picture picture: allPictures) {
            if (picture.getAdressFolder().contains(address)){
                addressPictures.add(picture);
            }
        }

        return addressPictures;
    }
}
