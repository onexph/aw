package aw.code.tileContent;

import aw.code.TileContent;

/**
 *
 * @author minf102322
 */
public abstract class Terrain implements TileContent {
    
    /**
     * coordinates of terrain
     */
    public int x;
    public int y;
    
    //TODO image
    
    /**
     * how much cover the terrain provides to unit standing on it
     */
    private int cover;
    
    /**
     * how many mobility points it costs to traverse this terrain
     */
    private int mobilityCost;
    
    //constructor

    public Terrain(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    
    
    //methods
    
    /**
     * @return cover of tile
     */
    @Override
    public int getCover() {
        return cover;
    }
}
