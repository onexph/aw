package aw.code.units;

import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitCarrier extends Unit {

    @Override
    public void create(int x, int y) {
        this.name = "Carrier";
        this.x = x;
        this.y = y;
        this.hasMoved = true;
        //TODO how?
        //this.faction = 
        this.cost = 28000;
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.ship;
        this.driveType = Drive.ship;
        this.gas = 99;
        this.currentHealth = health;
        this.currentGas = gas;
        this.currentAmmo = ammunition;
        //TODO balancing
        //this.defStrength = 99;
        this.mobility = 5;
        this.vision = 4;
        this.rangeLow = 1;
        this.rangeHigh = 1;
        this.MainGun = null;
        this.SubGun = new Gun("Anti-Air Gun");
    }    
}
