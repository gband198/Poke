
package launcher;


public class GameCamera {
    private Handler handler;
    private float xoffset,yoffset;

    public GameCamera(Handler handler,float xoffset, float yoffset) {
        this.handler=handler;
        this.xoffset = xoffset;
        this.yoffset = yoffset;
    }
    
    public void checkblankS(){
        if (xoffset<0) {
            xoffset=0;
        }else if(xoffset > handler.getWorld().getWidght()*Tile.twidght-handler.getWidght()){
            xoffset=handler.getWorld().getWidght()*Tile.twidght-handler.getWidght();
        }
        if (yoffset<0) {
            yoffset=0;
        }else if(yoffset>handler.getWorld().getHeight()*Tile.theight -handler.getHeight()){
            yoffset=handler.getWorld().getHeight()*Tile.theight -handler.getHeight();
        }
    }
    
    public void centerOentity(Entity e){
    xoffset=e.getX()-handler.getWidght()/2+ e.widght/2;
    yoffset=e.getY()-handler.getHeight()/2+ e.height/2;
    checkblankS();
    }
    public void move(float xamt,float yamt){
    xoffset+=xamt;
    yoffset+=yamt;
    checkblankS();
    }
    
    public float getXoffset() {
        return xoffset;
    }

    public void setXoffset(float xoffset) {
        this.xoffset = xoffset;
    }

    public float getYoffset() {
        return yoffset;
    }

    public void setYoffset(float yoffset) {
        this.yoffset = yoffset;
    }
    
}
