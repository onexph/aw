package aw.code.units;

import aw.code.Map;
import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitCruiser extends Unit {
    
    /**
     * loaded units
     * can load helis
     */
    Unit[] load = new Unit[2];

    public UnitCruiser(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.name = "Cruiser";
        this.hasMoved = true;
        this.cost = 16000;
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.ship;
        this.driveType = Drive.transport;
        this.mainGun = "Anti-Ship Missiles";
        this.subGun = "Anti-Air Gun";
        this.gas = 99;
        this.ammunition = 9;
        this.currentHealth = health;
        this.currentGas = gas;
        this.currentAmmo = ammunition;
        this.mobility = 6;
        this.vision = 5;
        this.rangeLow = 1;
        this.rangeHigh = 1;
    }  
}
