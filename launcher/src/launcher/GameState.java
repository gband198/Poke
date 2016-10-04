package launcher;

import java.awt.Graphics;

public class GameState extends State {

    
    public World wor;

    public GameState(Handler handler) {
        super(handler);
          wor = new World(handler,"123.txt");
          handler.setWorld(wor);
        
      
    }

    @Override
    public void tick() {
        wor.tick();
        
        
    }

    @Override
    public void render(Graphics g) {
        wor.render(g);
        

    }

}
