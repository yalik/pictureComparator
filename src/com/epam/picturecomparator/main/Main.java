package com.epam.picturecomparator.main;

import com.epam.picturecomparator.comparator.PictureComparator;
import com.epam.picturecomparator.model.Picture;

import javax.activation.MimetypesFileTypeMap;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final String IMAGE = "image/";

    public static void main(String[] args) {
        int count = 0;
        File shop = new File("d:/ЭФКО-Каскад/Рублевские");
        for (File city: shop.listFiles()){
            for (File adress: city.listFiles())
            {
                List<Picture> addressPictureList = new ArrayList<Picture>();
                if (adress != null && adress.listFiles() != null && adress.listFiles().length != 0)
                {
                    System.out.println("Address " + adress.getName() + " was started");

                    for (File month : adress.listFiles())
                    {
                        if (month.getName().contains("Декабрь"))
                        {
                            if (month != null && month.listFiles() != null && month.listFiles().length != 0)
                            {
                                for (File date : month.listFiles())
                                {
                                    if (date != null && date.listFiles() != null && date.listFiles().length != 0)
                                    {
                                        for (File image : date.listFiles())
                                        {
                                            String mimeType = new MimetypesFileTypeMap().getContentType(image);
                                            if (mimeType.startsWith(IMAGE))
                                            {
                                                try
                                                {
                                                    BufferedImage bufferedImage = ImageIO.read(image);
                                                    Picture picture = new Picture(count, bufferedImage, date.getName(), shop.getName(), image.getName(), month.getName(),
                                                            adress.getName(), city.getName());
                                                    addressPictureList.add(picture);
                                                    count++;
                                                } catch (IOException e)
                                                {
                                                    e.printStackTrace();
                                                }
                                            }
                                        }
                                    } else
                                    {
                                        continue;
                                    }
                                }
                            } else
                            {
                                continue;
                            }
                        }
                    }
                } else {
                    continue;
                }

                for (int i = 0; i < addressPictureList.size(); i++){
                    for (int j = i + 1; j < addressPictureList.size() - 1; j++){
                        if (PictureComparator.compare(addressPictureList.get(i).getImage(), addressPictureList.get(j).getImage()) == 0){
                            System.out.println("found match:");
                            System.out.println(addressPictureList.get(i));
                            System.out.println(addressPictureList.get(j));
                        }
                    }
                }
            }
        }

    }
}
