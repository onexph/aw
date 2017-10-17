package aw.code.units;

import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitDuster extends Unit {

    @Override
    public void create(int x, int y) {
        this.name = "Duster";
        this.x = x;
        this.y = y;
        this.hasMoved = true;
        //TODO how?
        //this.faction = 
        this.cost = 13000;
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.air;
        this.driveType = Drive.air;
        this.gas = 99;
        this.currentHP = HP;
        this.currentGas = gas;
        //TODO balancing
        //this.strength = 99;
        this.mobility = 8;
        this.vision = 4;
        this.rangeLow = 1;
        this.rangeHigh = 1;
        this.MainGun = new Gun("Machine Gun");
        this.SubGun = null;
    }   
}
