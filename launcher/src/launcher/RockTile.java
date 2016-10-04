
package launcher;


public class RockTile extends Tile {
    
    public RockTile( int id) {
        super(Assets.Rock, id);
    }
    @Override
    public boolean itssolid(){
    return true;
    }
    
}
