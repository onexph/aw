package aw.code.units;

import aw.code.Map;
import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitRockets extends Unit {

    public UnitRockets(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.name = "Rockets";
        this.hasMoved = true;
        this.cost = 15000;
        this.attackMode = AttackMode.ranged;
        this.unitType = UnitType.vehicle;
        this.driveType = Drive.tireA;
        this.mainGun = "Rocket";
        this.subGun = "-";
        this.gas = 50;
        this.ammunition = 5;
        this.currentHealth = health;
        this.currentGas = gas;
        this.currentAmmo = ammunition;
        this.mobility = 5;
        this.vision = 5;
        this.rangeLow = 3;
        this.rangeHigh = 5;
    }    
}
