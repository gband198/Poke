    
package launcher;

import java.awt.image.BufferedImage;



public class Spritesheet {
    public BufferedImage sprites;
    
    public Spritesheet(BufferedImage sprites) {
        this.sprites = sprites;  
    }
   public  BufferedImage crop (int x, int y ,int widght,int height){
     return sprites.getSubimage(x, y,widght,height);
   }
}
