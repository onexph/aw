package aw.code.units;

import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitInfantry extends Unit {

    @Override
    public void create(int x, int y) {
        this.name = "Infantry";
        this.x = x;
        this.y = y;
        this.hasMoved = true;
        //TODO how?
        //this.faction = 
        this.cost = 1500;
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.infantry;
        this.driveType = Drive.infantry;
        this.gas = 99;
        this.currentHealth = health;
        this.currentGas = gas;
        //TODO balancing
        //this.defStrength = 99;
        this.mobility = 3;
        this.vision = 2;
        this.rangeLow = 1;
        this.rangeHigh = 1;
        this.MainGun = null;
        this.SubGun = new Gun("Machine Gun");

    }    
}
