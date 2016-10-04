
package launcher;

import java.awt.Graphics;
import java.awt.image.BufferedImage;



public class Tile {
    
  public static Tile[] tiles = new Tile[256];   
     public static TileGrass grasstile = new TileGrass(0);  
     public static RockTile rock = new RockTile(1);
     //public static HiebaAlta HA= new HiebaAlta(2);
    
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||//
   protected static final int twidght=40;  
   protected static final int theight=40; 
   protected BufferedImage texture;
   protected final  int id ;

  
    public Tile(BufferedImage texture, int id) {
        this.texture = texture;
        this.id = id;
        tiles[id]=this;
    }
public void tick(){
}

public void render(Graphics g ,int x , int y){
      g.drawImage(texture, x, y, theight,theight, null);
}

public boolean itssolid(){
return false;  
}

    public int getId() {
        return id;
    }
   
   
    
    
}
