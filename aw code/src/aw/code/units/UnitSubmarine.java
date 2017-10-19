package aw.code.units;

import aw.code.Map;
import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitSubmarine extends Unit {

    public UnitSubmarine(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.name = "Submarine";
        this.hasMoved = true;
        this.cost = 20000;
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.sub;
        this.driveType = Drive.ship;
        this.mainGun = "Torpedo";
        this.subGun = "-";
        this.gas = 70;
        this.ammunition = 6;
        this.currentHealth = health;
        this.currentGas = gas;
        this.currentAmmo = ammunition;
        this.mobility = 6;
        this.vision = 5;
        this.rangeLow = 1;
        this.rangeHigh = 1;
    }    
}
