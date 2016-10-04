
package launcher;

import java.awt.Graphics;


public class HierbaAlta extends StaticEntity {

    public HierbaAlta(Handler handler, float x, float y) {
        super(handler, x, y, Tile.twidght, Tile.theight*2);
        bounds.x=10;
        bounds.y=(int)(height /1.4f);
        bounds.width=widght-20;
        bounds.height=(int)(height-height/1.4f);
        
    }
    

    @Override
    public void tick() {
        
    }

    @Override
    public void render(Graphics g) {
       g.drawImage(Assets.Halta, (int)(x-handler.getGameCamera().getXoffset()),(int)(y-handler.getGameCamera().getYoffset()),17,17 , null);
    }
    
   
    
    
}
