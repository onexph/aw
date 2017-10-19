package aw.code.tileContent.terrains;

import aw.code.Unit;
import aw.code.tileContent.Terrain;

/**
 *
 * @author minf102322
 */
public class terrainForest extends Terrain {
    
    public final int cover = 3;

    public terrainForest(int x, int y) {
        super(x, y);
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
            case tireA: return 3;
            case tireB: return 3;
            case tank: return 2;
            case air: return 1;
            case ship: return 999;
            case transport: return 999;
            default: return 999;
        }
    }
}
