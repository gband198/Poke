
package launcher;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;


public class player extends creature {
    //animacion//
    private Animation animd,animu,animr,animl;
    
    
    public player(Handler handler,float x, float y) {
        super(handler,x, y, creature.Dwidght, creature.Dheight);
        bounds.x=5;
        bounds.y=10;
        bounds.width=20;
        bounds.height=20;
        //aqui va una parte de las animaciones//
        animd=new Animation(500,Assets.playerdown);
        animu=new Animation(500,Assets.playerup);
        animl=new Animation(500,Assets.playerleft);
        animr=new Animation(500,Assets.playerright);
        
    }

    @Override
    public void tick() {
        //aqui va otra parte//
        animd.tick();
        animu.tick();
        animl.tick();
        animr.tick();
        //moviento
       getinput();
       moves();
       handler.getGameCamera().centerOentity(this);
    }
    private void getinput(){
    movex=0;
    movey=0;
        if (handler.getkeyBoard().up) {
           movey=-speed; 
        }
        if (handler.getkeyBoard().down) {
           movey=speed; 
        }
        if (handler.getkeyBoard().right) {
           movex=speed; 
        }
        if (handler.getkeyBoard().left) {
           movex=-speed; 
        }
    }

    @Override
    public void render(Graphics g) {
      g.drawImage(getcurrentanimaton(), (int)(x-handler.getGameCamera().getXoffset()),
              (int)(y-handler.getGameCamera().getYoffset()),widght,height, null);
     // g.setColor(Color.yellow);
      //g.fillRect((int)(x+bounds.x -handler.getGameCamera().getXoffset()),
         //     (int)(y+bounds.y -handler.getGameCamera().getYoffset()), 
          //    bounds.width,bounds.height);
    }
    private BufferedImage getcurrentanimaton(){
        if (movex<0) {
            return animl.getCFrames();
        }else if(movex>0){
        return animr.getCFrames();
        }
        if (movey<0) {
            return animu.getCFrames();
        }else if (movey>0) {
            return animd.getCFrames();
            
        }else{
            return Assets.defaultm;
        }
       
    }
    
}
