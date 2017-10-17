package aw.code.units;

import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitTankBig extends Unit {

    @Override
    public void create(int x, int y) {
        this.name = "War Tank";
        this.x = x;
        this.y = y;
        this.hasMoved = true;
        //TODO how?
        //this.faction = 
        this.cost = 16000;
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.vehicle;
        this.driveType = Drive.tank;
        this.gas = 50;
        this.ammunition = 5;
        this.currentHP = HP;
        this.currentGas = gas;
        this.currentAmmo = ammunition;
        //TODO balancing
        //this.strength = 99;
        this.mobility = 4;
        this.vision = 2;
        this.rangeLow = 1;
        this.rangeHigh = 1;
        this.MainGun = new Gun("War Tank Gun");
        this.SubGun = new Gun("Machine Gun");
    }    
}
