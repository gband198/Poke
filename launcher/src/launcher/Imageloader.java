
package launcher;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class Imageloader {
   public static BufferedImage loadImage(String location) {
     // BufferedImage imgAux=null;
       try {
            return ImageIO.read(Imageloader.class.getResource(location));
           //imgAux=ImageIO.read(new File(location));
           //return imgAux;
       } catch (IOException e) {
            System.out.println("nose pudo cargar");
       }
       return null;
   }
}
