package aw.code;

/**
 * contains a tile 
 * Tiles can have one Unit and one TileContent on it
 * @author minf102322
 */
public class Tile {
    
    /**
     * coordinates of tile
     */
    public int x;
    public int y;
    
    /** 
     * Things on a tile
     */
    public Unit unit;
    public Object tileContent;
    
}
