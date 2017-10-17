package aw.code.tileContent;

import aw.code.Map.Faction;
import aw.code.TileContent;

/**
 *
 * @author minf102322
 */
public abstract class Building implements TileContent {
        
    public final int captureTime = 20;
    private int remainingCaptureTime;
    
    /**
     * coordinates of building
     */
    public int x;
    public int y;
    
    //TODO image

    /**
     * faction of the building
     */
    private Faction faction;
    
    /**
     * how much cover the building provides to unit standing on it
     */
    private int cover;

    /**
     * if a building grants you funds
     */
    private boolean generatesFunds;
    
    
    /**
     * @return cover of tile
     */
    @Override
    public int getCover() {
        return cover;
    }
    
    /**
     * @return remaining capture time
     */
    public int getRemCapTime() {
        return remainingCaptureTime;
    }
}
