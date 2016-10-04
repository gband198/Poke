
package launcher;

import java.awt.image.BufferedImage;


public class Animation {
    private int speed, index;
    private BufferedImage[] frames;
    private long LastT,timer;
    public Animation(int speed, BufferedImage[] frames) {
        this.speed = speed;
        this.frames = frames;
        index=0;
        timer=0;
        LastT= System.currentTimeMillis();
    }
public void  tick(){
timer+= System.currentTimeMillis()-LastT;
LastT=System.currentTimeMillis();
    if (timer>speed) {
        index++;
        timer=0;
        if (index>=frames.length) {
            index=0;
        }
    }
}
    public BufferedImage getCFrames() {
        return frames[index];
    }
    
}
