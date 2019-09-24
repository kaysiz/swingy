package za.co.swingy.util;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * ParseImages
 */
public class ParseImages {

    public static BufferedImage loadImage(String path) {
        BufferedImage myPicture = null;

        try {
            myPicture = ImageIO.read(new File(path));
        } catch (IOException e) {
            System.exit(0);
        }
        return (myPicture);
    }
}