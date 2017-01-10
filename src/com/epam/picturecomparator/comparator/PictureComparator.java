package com.epam.picturecomparator.comparator;

import java.awt.image.BufferedImage;

/**
 * Created by Konstantin_Yalovik on 11/9/2016.
 */
public class PictureComparator
{
    public static double compare(BufferedImage whatImage, BufferedImage withImage) {
        int width1 = whatImage.getWidth(null);
        int width2 = withImage.getWidth(null);
        int height1 = whatImage.getHeight(null);
        int height2 = withImage.getHeight(null);
        if ((width1 != width2) || (height1 != height2)) {
            return 1;
        }
        long diff = 0;
        for (int y = 0; y < height1; y++) {
            for (int x = 0; x < width1; x++) {
                int rgb1 = whatImage.getRGB(x, y);
                int rgb2 = withImage.getRGB(x, y);
                int r1 = (rgb1 >> 16) & 0xff;
                int g1 = (rgb1 >>  8) & 0xff;
                int b1 = (rgb1      ) & 0xff;
                int r2 = (rgb2 >> 16) & 0xff;
                int g2 = (rgb2 >>  8) & 0xff;
                int b2 = (rgb2      ) & 0xff;
                diff += Math.abs(r1 - r2);
                diff += Math.abs(g1 - g2);
                diff += Math.abs(b1 - b2);
            }
        }
        double n = width1 * height1 * 3;
        double p = diff / n / 255.0;

        return p;
    }
}
