package aw.code.units;

import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitBike extends Unit {

    @Override
    public void create(int x, int y) {
        this.name = "Bike";
        this.x = x;
        this.y = y;
        this.hasMoved = true;
        //TODO how?
        //this.faction = 
        this.cost = 2500;
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.infantry;
        this.driveType = Drive.tireB;
        this.gas = 70;
        this.currentHP = HP;
        this.currentGas = gas;
        //TODO balancing
        //this.strength = 99;
        this.mobility = 5;
        this.vision = 2;
        this.rangeLow = 1;
        this.rangeHigh = 1;
        this.MainGun = null;
        this.SubGun = new Gun("Machine Gun");
    }    
}
