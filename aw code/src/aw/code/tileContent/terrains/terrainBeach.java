package aw.code.tileContent.terrains;

import aw.code.Unit;
import aw.code.tileContent.Terrain;

/**
 *
 * @author minf102322
 */
public class terrainBeach extends Terrain {
    
    public final int cover = 0;

    public terrainBeach(int x, int y) {
        super(x, y);
    }

    @Override
    public int getMobilityCost(Unit unit) {
        switch (unit.getDriveType()) {
            case infantry: return 1;
            case bazooka: return 1;
            case tireA: return 2;
            case tireB: return 2;
            case tank: return 1;
            case air: return 1;
            case ship: return 999;
            case transport: return 1;
            default: return 999;
        }
    }
    
}
