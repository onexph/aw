package aw.code.units;

import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitFlare extends Unit {

    @Override
    public void create(int x, int y) {
        this.name = "Flare";
        this.x = x;
        this.y = y;
        this.hasMoved = true;
        //TODO how?
        //this.faction = 
        this.cost = 5000;
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.vehicle;
        this.driveType = Drive.tank;
        this.gas = 60;
        this.ammunition = 3;
        this.currentHealth = health;
        this.currentGas = gas;
        this.currentAmmo = ammunition;
        //TODO balancing
        //this.defStrength = 99;
        this.mobility = 5;
        this.vision = 2;
        this.rangeLow = 1;
        this.rangeHigh = 1;
        this.MainGun = null;
        this.SubGun = new Gun("Machine Gun");
    }    
}
