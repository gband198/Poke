package launcher;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;
//import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Juego implements Runnable {

   private int widght, height;
    Thread hil;
    Pantalla dsi;
    //BufferedImage image;
    //Spritesheet sheetsp;
    private boolean running = false;
     BufferStrategy bs;
     Graphics g;
     
     //aqui viene lo bueno
     public State gstate;
      // de esto no me voy a acordar mañana 
       public keyBoard ke;
       //efectivamente 
       public GameCamera gc;
       //nose pa que es esto pero igual lo voy a crear
       private Handler handler;
       
    public Juego(int widght, int height) {
        this.widght = widght;
        this.height = height;
        
        ke= new keyBoard();

    }

    void init() {
        dsi = new Pantalla(widght, height);
        Assets.init();
        handler=new Handler(this);
        gc =new GameCamera(handler,0,0);
        gstate = new GameState(handler);
        State.Setstate(gstate);
                dsi.getFrame().addKeyListener(ke);

        //image = Imageloader.loadImage("imagenes/trchar167.png");
           //sheetsp= new Spritesheet(image);
    }

    void tick() {
        ke.tick();
        if (State.getstate()  != null) {
            State.getstate().tick();
        }
        
        
    }

    void render() {
        bs =dsi.getCanvas().getBufferStrategy();
        if (bs == null) {
            dsi.getCanvas().createBufferStrategy(3);
            return;
        }
        g = bs.getDrawGraphics();
        g.clearRect(0, 0, widght, height);
       if (State.getstate()  != null) {
            State.getstate().render(g);
        }
       bs.show();
       g.dispose();
       
    }

    @Override
    public void run() {        
         int fps=60;
         double timepertic =1000000000/fps;
         double delta=0;
         long now;
         long lasttime=System.nanoTime();
         long timer=0;
         int ticks=0;
        init();
        while (running) {
            now =System.nanoTime();
            delta+=(now-lasttime)/timepertic;
            timer+=now-lasttime;
            lasttime = now;
            if (delta >= 1) {
            tick();
            render();
            ticks++;
            delta--;
            }
            if (timer >=1000000000) {
                System.out.println(""+ticks);
                ticks=0;
                timer=0;
            }
        }
        stop();
    }
    public keyBoard getkeyBoard(){
    return ke;
    }

    public GameCamera getGameCamera() {
        return gc;
    }

    public int getWidght() {
        return widght;
    }

    public int getHeight() {
        return height;
    }

    public synchronized void start() {
        if (running) {
            return;
        }
        running = true;
        hil = new Thread(this);
        hil.start();
    }

    public synchronized void stop() {
        if (!running) {
            return;
        }
        running = false;
        try {
            hil.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
