package aw.code.units;

import aw.code.Map;
import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitCarrier extends Unit {
    
    /**
     * loaded units
     * can load air units
     */
    Unit[] load = new Unit[2];

    public UnitCarrier(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.name = "Carrier";
        this.hasMoved = true;
        this.cost = 28000;
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.ship;
        this.driveType = Drive.ship;
        this.mainGun = "-";
        this.subGun = "Anti-Air Gun";
        this.gas = 99;
        this.currentHealth = health;
        this.currentGas = gas;
        this.currentAmmo = ammunition;
        this.mobility = 5;
        this.vision = 4;
        this.rangeLow = 1;
        this.rangeHigh = 1;
    }    
}
