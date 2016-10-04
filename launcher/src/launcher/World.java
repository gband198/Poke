
package launcher;

import java.awt.Graphics;



public  class World {
    Handler handler;
  int widght,height,sx,sy;
  int[][]tilesa;
  int sum=100,sum1=100;
  //entidades////
private EntityManager entitymanager;

public World(Handler handler,String location){
    this.handler=handler;
    entitymanager= new EntityManager(handler, new player(handler,40,40));
    for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 5; j++) {
      entitymanager.addEntity(new HierbaAlta(handler,sum,sum1));
            if (sum1>140) {
              sum1=100;  
            }else{
             sum1+=20;
            }
        }
       sum+=10; 
    }
    
    loadworld(location);
    entitymanager.getJug().setX(sx);
    entitymanager.getJug().setY(sy);
    
}
  public void tick(){
  entitymanager.tick(); 
  }
  public void render(Graphics g){
      int xstart=(int) Math.max(0,handler.getGameCamera().getXoffset()/Tile.twidght);
      int xend=(int) Math.min(widght, (handler.getGameCamera().getXoffset()+handler.getWidght())/Tile.twidght+1);
      int ystart=(int) Math.max(0,handler.getGameCamera().getYoffset()/Tile.theight);;
      int yend=(int)Math.min(height,(handler.getGameCamera().getYoffset()+handler.getHeight())/Tile.theight+1);
      for (int j = ystart; j <yend; j++) {
          for (int i = xstart; i <xend; i++) {
              gettile(i, j).render(g, (int)(i*Tile.twidght-handler.getGameCamera().getXoffset()),(int)( j*Tile.theight-handler.getGameCamera().getYoffset() ));
          }
      }
        //pa la entidad
        entitymanager.render(g);
  }
  public Tile gettile(int x , int y ){
      if (x<0|| y<0||x >=widght|| y>=height  ) {
          return Tile.grasstile;
      }
      
   Tile t = Tile.tiles[tilesa[x][y]]; 
      if (t == null) {
          return Tile.grasstile;
      }else{
      return t;
      }
  }
  public void loadworld(String location){
  String fl=Utils.loadfSt(location);
  String[]tk=fl.split("\\s+");
  widght=Utils.parse(tk[0]);
  height=Utils.parse(tk[1]); 
  sx =Utils.parse(tk[2]);
  sy =Utils.parse(tk[3]);
  tilesa= new int[widght][height];
      for (int j = 0; j <height; j++) {
          for (int i = 0; i <widght; i++) {
              tilesa[i][j]=Utils.parse(tk[((i+j*widght)+4)]);
          }
      }
  }

    public int getWidght() {
        return widght;
    }

    public int getHeight() {
        return height;
    }

    public EntityManager getEntitymanager() {
        return entitymanager;
    }
  
  
  
  
}
