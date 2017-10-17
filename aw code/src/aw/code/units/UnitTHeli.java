package aw.code.units;

import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitTHeli extends Unit {

    @Override
    public void create(int x, int y) {
        this.name = "Transport Heli";
        this.x = x;
        this.y = y;
        this.hasMoved = true;
        //TODO how?
        //this.faction = 
        this.cost = 5000;
        this.attackMode = AttackMode.none;
        this.unitType = UnitType.air;
        this.driveType = Drive.air;
        this.gas = 99;
        this.currentHP = HP;
        this.currentGas = gas;
        //TODO balancing
        //this.strength = 99;
        this.mobility = 6;
        this.vision = 1;
        this.rangeLow = 1;
        this.rangeHigh = 1;
        this.MainGun = null;
        this.SubGun = null;
    }   
}
