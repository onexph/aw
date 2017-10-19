package aw.code.units;

import aw.code.Map;
import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitTankSmall extends Unit {

    public UnitTankSmall(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.name = "Tank";
        this.hasMoved = true;
        this.cost = 7000;
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.vehicle;
        this.driveType = Drive.tank;
        this.mainGun = "Tank Gun";
        this.subGun = "Machine Gun";
        this.gas = 70;
        this.ammunition = 6;
        this.currentHealth = health;
        this.currentGas = gas;
        this.currentAmmo = ammunition;
        this.mobility = 6;
        this.vision = 3;
        this.rangeLow = 1;
        this.rangeHigh = 1;
    }
}
