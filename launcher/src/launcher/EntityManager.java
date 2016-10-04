
package launcher;   

import java.awt.Graphics;
import java.util.ArrayList;


public class EntityManager {
private Handler handler;
private player jug;
private ArrayList<Entity>entitys;


    public EntityManager(Handler handler, player jug) {
        this.handler = handler;
        this.jug = jug;
        entitys= new ArrayList<Entity>();
        addEntity(jug);
    }

   public void tick(){
       for (int i = 0; i <entitys.size(); i++) {
           Entity e = entitys.get(i);
           e.tick();
       }  
  }
    public void render(Graphics g ){
    for (Entity e : entitys) {
           e.render(g);
       }
  }
    public void addEntity(Entity e){
    entitys.add(e); 
    }
    
/////////////////////////////////////////////////////////////////////////////////
    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public player getJug() {
        return jug;
    }

    public void setJug(player jug) {
        this.jug = jug;
    }   
   

    public ArrayList<Entity> getEntitys() {
        return entitys;
    }

    public void setEntitys(ArrayList<Entity> entitys) {
        this.entitys = entitys;
    }
    
}
