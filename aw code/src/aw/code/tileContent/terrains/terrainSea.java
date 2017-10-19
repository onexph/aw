package aw.code.tileContent.terrains;

import aw.code.Unit;
import aw.code.tileContent.Terrain;

/**
 *
 * @author minf102322
 */
public class terrainSea extends Terrain {
    
    public final int cover = 0;

    public terrainSea(int x, int y) {
        super(x, y);
    }
    
    /**
     * @param unit unit on the tile
     * @return mobility cost of the tile
     */
    @Override
    public int getMobilityCost(Unit unit) {
        switch (unit.getDriveType()) {
            case infantry: return 999;
            case bazooka: return 999;
            case tireA: return 999;
            case tireB: return 999;
            case tank: return 999;
            case air: return 1;
            case ship: return 1;
            case transport: return 1;
            default: return 999;
        }
    }
}
