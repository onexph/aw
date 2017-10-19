package aw.code.units;

import aw.code.Map;
import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitAT extends Unit {

    public UnitAT(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.name = "Anti-Tank";
        this.hasMoved = true;
        this.cost = 11000;
        this.attackMode = AttackMode.ranged;
        this.unitType = UnitType.vehicle;
        this.driveType = Drive.tireB;
        this.mainGun = "Cannon";
        this.subGun = "-";
        this.gas = 50;
        this.ammunition = 6;
        this.currentHealth = health;
        this.currentGas = gas;
        this.currentAmmo = ammunition;
        this.mobility = 4;
        this.vision = 2;
        this.rangeLow = 1;
        this.rangeHigh = 3;
    }
}
