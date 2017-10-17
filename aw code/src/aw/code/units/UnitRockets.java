package aw.code.units;

import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitRockets extends Unit {

    @Override
    public void create(int x, int y) {
        this.name = "Rockets";
        this.x = x;
        this.y = y;
        this.hasMoved = true;
        //TODO how?
        //this.faction = 
        this.cost = 15000;
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
        this.rangeHigh = 5;
        this.MainGun = new Gun("Rocket");
        this.SubGun = null;
    }    
}
