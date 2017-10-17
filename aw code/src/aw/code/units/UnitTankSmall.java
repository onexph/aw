package aw.code.units;

import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitTankSmall extends Unit {

    @Override
    public void create(int x, int y) {
        this.name = "Tank";
        this.x = x;
        this.y = y;
        this.hasMoved = true;
        //TODO how?
        //this.faction = 
        this.cost = 7000;
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.vehicle;
        this.driveType = Drive.tank;
        this.gas = 70;
        this.ammunition = 6;
        this.currentHealth = health;
        this.currentGas = gas;
        this.currentAmmo = ammunition;
        //TODO balancing
        //this.defStrength = 99;
        this.mobility = 6;
        this.vision = 3;
        this.rangeLow = 1;
        this.rangeHigh = 1;
    }
}
