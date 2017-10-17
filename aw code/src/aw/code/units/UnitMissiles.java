package aw.code.units;

import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitMissiles extends Unit {

    @Override
    public void create(int x, int y) {
        this.name = "Missiles";
        this.x = x;
        this.y = y;
        this.hasMoved = true;
        //TODO how?
        //this.faction = 
        this.cost = 12000;
        this.attackMode = AttackMode.ranged;
        this.unitType = UnitType.vehicle;
        this.driveType = Drive.tireA;
        this.gas = 50;
        this.ammunition = 5;
        this.currentHealth = health;
        this.currentGas = gas;
        this.currentAmmo = ammunition;
        //TODO balancing
        //this.defStrength = 99;
        this.mobility = 5;
        this.vision = 5;
        this.rangeLow = 3;
        this.rangeHigh = 6;
        this.MainGun = new Gun("Anti-Air Missiles");
        this.SubGun = null;
    }   
}
