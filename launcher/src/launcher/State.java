
package launcher;

import java.awt.Graphics;


public abstract class State {

   public static State cState =null;
    public static void Setstate(State sta){
       cState = sta;
     }
    public static State getstate(){
    return cState;
    }
    
    //////////////////////////////////////////////////
    
    protected Handler handler;
    public State(Handler handler) {
        this.handler = handler;
    } 
    public abstract void tick();
     public abstract void render(Graphics g);
}
