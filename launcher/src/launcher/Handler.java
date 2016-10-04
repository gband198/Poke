
package launcher;


public class Handler {
    
    private Juego juego;
    private World world;

    public int getWidght(){
    return juego.getWidght();
    }
    public GameCamera getGameCamera(){
    return juego.getGameCamera();
    }
    public keyBoard getkeyBoard(){
    return juego.getkeyBoard();
    }
            
    public int getHeight(){
    return juego.getHeight();
    }
    public Handler(Juego juego) {
        this.juego = juego;
    }

    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }
    
}
