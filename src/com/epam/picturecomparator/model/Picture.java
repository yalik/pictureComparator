package com.epam.picturecomparator.model;

import java.awt.image.BufferedImage;

/**
 * Created by Konstantin_Yalovik on 11/9/2016.
 */
public class Picture
{
    private int id;
    private BufferedImage image;
    private String dateFolder;
    private String shopFolder;
    private String pictureName;
    private String monthFolder;
    private String adressFolder;
    private String cityFolder;

    public Picture(){}

    public Picture(int id, BufferedImage image, String dateFolder, String shopFolder, String pictureName, String monthFolder, String adressFolder, String cityFolder)
    {
        this.id = id;
        this.image = image;
        this.dateFolder = dateFolder;
        this.shopFolder = shopFolder;
        this.pictureName = pictureName;
        this.monthFolder = monthFolder;
        this.adressFolder = adressFolder;
        this.cityFolder = cityFolder;
    }

    public int getId()
    {
        return id;
    }

    public String getAdressFolder()
    {
        return adressFolder;
    }

    public void setAdressFolder(String adressFolder)
    {
        this.adressFolder = adressFolder;
    }

    public String getCityFolder()
    {
        return cityFolder;
    }

    public void setCityFolder(String cityFolder)
    {
        this.cityFolder = cityFolder;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public BufferedImage getImage()
    {
        return image;
    }

    public void setImage(BufferedImage image)
    {
        this.image = image;
    }

    public String getDateFolder()
    {
        return dateFolder;
    }

    public void setDateFolder(String dateFolder)
    {
        this.dateFolder = dateFolder;
    }

    public String getShopFolder()
    {
        return shopFolder;
    }

    public void setShopFolder(String shopFolder)
    {
        this.shopFolder = shopFolder;
    }

    public String getPictureName()
    {
        return pictureName;
    }

    public void setPictureName(String pictureName)
    {
        this.pictureName = pictureName;
    }

    public String getMonthFolder()
    {
        return monthFolder;
    }

    public void setMonthFolder(String monthFolder)
    {
        this.monthFolder = monthFolder;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Picture picture = (Picture) o;

        if (id != picture.id) return false;
        if (!image.equals(picture.image)) return false;
        if (!dateFolder.equals(picture.dateFolder)) return false;
        return shopFolder.equals(picture.shopFolder);

    }

    @Override
    public int hashCode()
    {
        int result = id;
        result = 31 * result + image.hashCode();
        result = 31 * result + dateFolder.hashCode();
        result = 31 * result + shopFolder.hashCode();
        result = 31 * result + pictureName.hashCode();
        result = 31 * result + monthFolder.hashCode();
        result = 31 * result + adressFolder.hashCode();
        result = 31 * result + cityFolder.hashCode();
        return result;
    }

    @Override
    public String toString()
    {
        return "Picture{" +
                "id=" + id +
                ", dateFolder='" + dateFolder + '\'' +
                ", shopFolder='" + shopFolder + '\'' +
                ", pictureName='" + pictureName + '\'' +
                ", monthFolder='" + monthFolder + '\'' +
                ", adressFolder='" + adressFolder + '\'' +
                ", cityFolder='" + cityFolder + '\'' +
                '}';
    }
}
