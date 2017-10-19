package aw.code.units;

import aw.code.Map;
import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitTankMed extends Unit {

    public UnitTankMed(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.name = "Heavy Tank";
        this.hasMoved = true;
        this.cost = 12000;
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.vehicle;
        this.driveType = Drive.tank;
        this.mainGun = "Heavy Tank Gun";
        this.subGun = "Machine Gun";
        this.gas = 50;
        this.ammunition = 5;
        this.currentHealth = health;
        this.currentGas = gas;
        this.currentAmmo = ammunition;
        this.mobility = 5;
        this.vision = 2;
        this.rangeLow = 1;
        this.rangeHigh = 1;
    }    
}
