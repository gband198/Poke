
package launcher;

import java.awt.Graphics;
import java.awt.Rectangle;



public abstract class Entity {
    protected Handler handler;
    protected float x ,y ;
    protected int widght, height;
    protected Rectangle bounds;

    public Entity(Handler handler,float x, float y, int widght, int height) {
        this.handler=handler;
        this.x = x;
        this.y = y;
        this.widght = widght;
        this.height = height;
        
        bounds = new Rectangle(0,0,widght,height);
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setWidght(int widght) {
        this.widght = widght;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getWidght() {
        return widght;
    }

    public int getHeight() {
        return height;
    }
    
    public abstract void tick();
    
    public abstract void render(Graphics g);
    
    public boolean Checkentitycollision(float xoffset, float yoffset){
            for (Entity e :handler.getWorld().getEntitymanager().getEntitys()) {
                if (e.equals(this)) 
                    continue;
            if (e.getcollisionbounds(0f,0f).intersects(getcollisionbounds(xoffset, yoffset))) 
            return true ; 
            }
            return false;
    }
    public Rectangle getcollisionbounds(float xoffset,float yoffset){
    return new Rectangle((int)(x+bounds.x+xoffset),(int)(y+bounds.y+yoffset),bounds.width,bounds.height);
    }
}
