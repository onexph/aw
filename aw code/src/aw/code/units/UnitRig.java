package aw.code.units;

import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitRig extends Unit {

    @Override
    public void create(int x, int y) {
        this.name = "Mobile Workshop";
        this.x = x;
        this.y = y;
        this.hasMoved = true;
        //TODO how?
        //this.faction = 
        this.cost = 5000;
        this.attackMode = AttackMode.none;
        this.unitType = UnitType.vehicle;
        this.driveType = Drive.tank;
        this.gas = 99;
        this.currentHealth = health;
        this.currentGas = gas;
        //TODO balancing
        //this.defStrength = 99;
        this.mobility = 6;
        this.vision = 1;
        this.rangeLow = 1;
        this.rangeHigh = 1;
        this.MainGun = null;
        this.SubGun = null;
    }
}
