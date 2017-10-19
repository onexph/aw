package aw.code.tileContent.terrains;

import aw.code.Unit;
import aw.code.tileContent.Terrain;

/**
 *
 * @author minf102322
 */
public class terrainBridge extends Terrain {
    
    //TODO different types of bridges (river bridge, sea bridge)
    
    public final int cover = 0;

    public terrainBridge(int x, int y) {
        super(x, y);
    }

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
