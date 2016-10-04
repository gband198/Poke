
package launcher;


public abstract class creature extends Entity {
     
     public static final float Defaultspeed= 2.0f;
     public static final int Dwidght=32;
      public static final int Dheight=32; 
    protected float speed; 
    protected float movex,movey; 
    public creature(Handler handler,float x, float y, int widght, int height) {
        super(handler,x, y,widght,height);
        speed= Defaultspeed;
        movex=0;
        movey=0;
    }
    
    
    public void moves(){
        if (!Checkentitycollision(movex, 0f)) {
            System.out.println("getbattle");
        }
        if (!Checkentitycollision(0f, movey)) {
            System.out.println("getbattle");
        }
   movex();
   movey();
    }
    public void movex(){
        //moviendo las caderas 
        if (movex>0) {// a  la derecha
            int tx=(int)(x+movex+bounds.x+bounds.width)/Tile.twidght;
            if (!collisonwiithT(tx,(int)(y+bounds.y)/Tile.theight)&& !collisonwiithT(tx,(int)(y+bounds.y+bounds.height)/Tile.theight )  ) {
                x+=movex;
            }else{
            x=tx*Tile.twidght-bounds.x-bounds.width-1;
            }
        }else if(movex<0){// a la izquierda
             int tx=(int)(x+movex+bounds.x)/Tile.twidght;
            if (!collisonwiithT(tx,(int)(y+bounds.y)/Tile.theight)&& !collisonwiithT(tx,(int)(y+bounds.y+bounds.height)/Tile.theight )  ) {
                x+=movex;
            }else{
            x=tx*Tile.twidght+Tile.twidght-bounds.x;
            }
        }  
    
    }
    public void movey(){
        if (movey<0) {// pa arriba 
            int ty =(int)(y+movey+bounds.y)/Tile.theight;
            if (!collisonwiithT((int)(x+bounds.x)/Tile.twidght, ty)&&
                !collisonwiithT((int)(x+bounds.x+bounds.width)/Tile.twidght, ty)) {
               y+=movey; 
            }else{
            y=ty*Tile.theight+Tile.theight-bounds.y;
            }
        }else if(movey>0){// pa abajo 
        int ty =(int)(y+movey+bounds.y+bounds.height)/Tile.theight;
            if (!collisonwiithT((int)(x+bounds.x)/Tile.twidght, ty)&&
                !collisonwiithT((int)(x+bounds.x+bounds.width)/Tile.twidght, ty)) {
               y+=movey; 
            } else{
            y=ty*Tile.theight-bounds.y-bounds.height-1;
            }
        }
        //pal centro y pa dentro
    }
    protected boolean collisonwiithT(int x, int y ){
    return handler.getWorld().gettile(x, y).itssolid();
    }
    
    
    
    
//||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    public float getMovex() {
        return movex;
    }

    public void setMovex(float movex) {
        this.movex = movex;
    }

    public float getMovey() {
        return movey;
    }

    public void setMovey(float movey) {
        this.movey = movey;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }
    
}
