package aw.code.units;

import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitAT extends Unit {

    @Override
    public void create(int x, int y) {
        this.name = "Anti-Tank";
        this.x = x;
        this.y = y;
        this.hasMoved = true;
        //TODO how?
        //this.faction = 
        this.cost = 11000;
        this.attackMode = AttackMode.ranged;
        this.unitType = UnitType.vehicle;
        this.driveType = Drive.tireB;
        this.gas = 50;
        this.ammunition = 6;
        this.currentHealth = health;
        this.currentGas = gas;
        this.currentAmmo = ammunition;
        //TODO balancing
        //this.defStrength = 99;
        this.mobility = 4;
        this.vision = 2;
        this.rangeLow = 1;
        this.rangeHigh = 3;
        this.MainGun = new Gun("Cannon");
        this.SubGun = null;
    }
}
