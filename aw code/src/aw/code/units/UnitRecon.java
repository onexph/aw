package aw.code.units;

import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitRecon extends Unit {

    @Override
    public void create(int x, int y) {
        this.name = "Recon";
        this.x = x;
        this.y = y;
        this.hasMoved = true;
        //TODO how?
        //this.faction = 
        this.cost = 4000;
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.vehicle;
        this.driveType = Drive.tireA;
        this.gas = 80;
        this.currentHealth = health;
        this.currentGas = gas;
        //TODO balancing
        //this.defStrength = 99;
        this.mobility = 8;
        this.vision = 5;
        this.rangeLow = 1;
        this.rangeHigh = 1;
        this.MainGun = null;
        this.SubGun = new Gun("Machine Gun");
    }   
}
