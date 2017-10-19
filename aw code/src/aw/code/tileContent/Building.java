package aw.code.tileContent;

import aw.code.Map.Faction;
import aw.code.TileContent;
import aw.code.Unit;

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
    public boolean generatesFunds;

    public Building(int x, int y, Faction faction) {
        this.remainingCaptureTime = captureTime;
        this.x = x;
        this.y = y;
        this.faction = faction;
    }
    
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
    
    /**
     * reacts on capture of city
     * @param unit unit which captured the city
     */
    public void captured(Unit unit) {
        this.faction = unit.getFaction();
        this.remainingCaptureTime = captureTime;
    }

}
