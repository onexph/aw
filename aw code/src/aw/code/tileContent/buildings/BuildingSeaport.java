package aw.code.tileContent.buildings;

import aw.code.Map;
import aw.code.Unit;
import aw.code.tileContent.Building;

/**
 *
 * @author minf102322
 */
public class BuildingSeaport extends Building {
    
    public final int cover = 3;
    private int fundsGenerated = 1000;
    private int remainingCaptureTime;

    public BuildingSeaport(int x, int y, Map.Faction faction) {
        super(x, y, faction);
        this.remainingCaptureTime = captureTime;
        this.generatesFunds = true;
    }
    
    /**
     * @param unit unit on the tile
     * @return mobility cost of the tile
     */
    @Override
    public int getMobilityCost(Unit unit) {
        switch (unit.getDriveType()) {
            case infantry: return 1;
            case bazooka: return 1;
            case tireA: return 1;
            case tireB: return 1;
            case tank: return 1;
            case air: return 1;
            case ship: return 1;
            case transport: return 1;
            default: return 999;
        }
    }
}
