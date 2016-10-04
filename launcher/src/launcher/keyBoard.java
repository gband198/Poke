
package launcher;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class keyBoard implements KeyListener {
   private boolean[] keys;
           boolean up ,down, left,right;
    public keyBoard() {
        keys = new boolean[256]; 
    }
    
    public void tick(){
    up = keys[KeyEvent.VK_W];
    down = keys[KeyEvent.VK_S];
    left = keys[KeyEvent.VK_A];
    right = keys[KeyEvent.VK_D];
    }

    

    @Override
    public void keyPressed(KeyEvent ke) {
         keys[ke.getKeyCode()]=true;
         System.out.println("Pressed");
         
           }

    @Override
    public void keyReleased(KeyEvent ke) {
        keys[ke.getKeyCode()]= false;
         System.out.println("released");
            }
    
    @Override
    public void keyTyped(KeyEvent ke) {
        // esto no sirve
 }
}
