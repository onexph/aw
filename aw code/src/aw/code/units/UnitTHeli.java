package aw.code.units;

import aw.code.Map;
import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitTHeli extends Unit {
    
    /**
     * loaded units
     * can load infantry and bazooka
     */
    Unit[] load = new Unit[1];

    public UnitTHeli(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.name = "Transport Heli";
        this.hasMoved = true;
        this.cost = 5000;
        this.attackMode = AttackMode.none;
        this.unitType = UnitType.air;
        this.driveType = Drive.air;
        this.mainGun = "-";
        this.subGun = "-";
        this.gas = 99;
        this.currentHealth = health;
        this.currentGas = gas;
        this.mobility = 6;
        this.vision = 1;
        this.rangeLow = 1;
        this.rangeHigh = 1;
    }   
}
