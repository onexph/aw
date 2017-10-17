package aw.code.units;

import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitLander extends Unit {

    @Override
    public void create(int x, int y) {
        this.name = "Lander";
        this.x = x;
        this.y = y;
        this.hasMoved = true;
        //TODO how?
        //this.faction = 
        this.cost = 10000;
        this.attackMode = AttackMode.none;
        this.unitType = UnitType.ship;
        this.driveType = Drive.transport;
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
