package aw.code.tileContent.buildings;

import aw.code.Map.Faction;
import aw.code.tileContent.Building;

/**
 *
 * @author minf102322
 */
public class BuildingAirport extends Building {
    
    public final int cover = 3;
    private int fundsGenerated = 1000;
    private int remainingCaptureTime;

    public BuildingAirport(int x, int y, Faction faction) {
        super(x, y, faction);
        this.remainingCaptureTime = captureTime;
        this.generatesFunds = true;
    }
}
