
package launcher;

import java.awt.image.BufferedImage;


public class Assets {

    public static final int width=64,height=64;
    public static BufferedImage[] playerdown,playerup,playerleft,playerright;
    public static BufferedImage grass;
    public static BufferedImage Rock;
    public static BufferedImage defaultm;
    public static BufferedImage Halta;
    public static void init(){
    Spritesheet stesheet= new Spritesheet(Imageloader.loadImage("imagenes/trchar167.png"));
    Spritesheet tesheet= new Spritesheet(Imageloader.loadImage("imagenes/WoodsLight.png"));
    Spritesheet esheet= new Spritesheet(Imageloader.loadImage("imagenes/dawn-preview.png"));
    Spritesheet eshee= new Spritesheet(Imageloader.loadImage("imagenes/Grass.png"));
    
    playerdown = new BufferedImage[4];
    playerup = new BufferedImage[4];
    playerright = new BufferedImage[4];
    playerleft = new BufferedImage[4];
    
    //abajo
    playerdown[0] = stesheet.crop(0, 0, width, height);
    defaultm= playerdown[0];
    playerdown[1] = stesheet.crop(width, 0, width, height);
    playerdown[2] = stesheet.crop(width*2, 0, width, height);
    playerdown[3] = stesheet.crop(width*3, 0, width, height);
    //arriba
    playerup[0] = stesheet.crop(0, width*3, width, height);
    playerup[1] = stesheet.crop(width, width*3, width, height);
    playerup[2] = stesheet.crop(width*2, width*3, width, height);
    playerup[3] = stesheet.crop(width*3, width*3, width, height);
    //derecha
    playerright[0] = stesheet.crop(0, width*2, width, height);
    playerright[1] = stesheet.crop(width, width*2, width, height);
    playerright[2] = stesheet.crop(width*2, width*2, width, height);
    playerright[3] = stesheet.crop(width*3, width*2, width, height);
    //izquierda
    playerleft[0] = stesheet.crop(0, width, width, height);
    playerleft[1] = stesheet.crop(width, width, width, height);
    playerleft[2] = stesheet.crop(width*2, width, width, height);
    playerleft[3] = stesheet.crop(width*3, width, width, height);
    
    grass =tesheet.crop(0,0,30,30);
    Rock=esheet.crop(97,0,47,48);
    Halta=eshee.crop(0,0,16,16);
    
    }
    
    
}
