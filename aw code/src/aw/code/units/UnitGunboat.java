package aw.code.units;

import aw.code.Map;
import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitGunboat extends Unit {

    public UnitGunboat(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.name = "Missile Boat";
        this.hasMoved = true;
        this.cost = 6000;
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.ship;
        this.driveType = Drive.ship;
        this.mainGun = "Anti-Ship Missiles";
        this.subGun = "-";
        this.gas = 99;
        this.ammunition = 1;
        this.currentHealth = health;
        this.currentGas = gas;
        this.currentAmmo = ammunition;
        this.mobility = 7;
        this.vision = 2;
        this.rangeLow = 1;
        this.rangeHigh = 1;
    }  
}
