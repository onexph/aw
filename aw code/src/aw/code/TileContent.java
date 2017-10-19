package aw.code;

/**
 *
 * @author minf102322
 */
public interface TileContent {
    /**
     * @return cover of tile
     */
    public int getCover();
    
    /**
     * @param unit unit on the tile
     * @return mobility cost of the tile
     */
    public int getMobilityCost(Unit unit);
    
}
