package aw.code.units;

import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitCruiser extends Unit {

    @Override
    public void create(int x, int y) {
        this.name = "Cruiser";
        this.x = x;
        this.y = y;
        this.hasMoved = true;
        //TODO how?
        //this.faction = 
        this.cost = 16000;
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.ship;
        this.driveType = Drive.transport;
        this.gas = 99;
        this.ammunition = 9;
        this.currentHealth = health;
        this.currentGas = gas;
        this.currentAmmo = ammunition;
        //TODO balancing
        //this.defStrength = 99;
        this.mobility = 6;
        this.vision = 5;
        this.rangeLow = 1;
        this.rangeHigh = 1;
        this.MainGun = new Gun("Anti-Ship Missiles");
        this.SubGun = new Gun("Anti-Air Gun");
    }  
}
