package aw.code.units;

import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitMech extends Unit {

    @Override
    public void create(int x, int y) {
        this.name = "Mech";
        this.x = x;
        this.y = y;
        this.hasMoved = true;
        //TODO how?
        //this.faction = 
        this.cost = 2500;
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.infantry;
        this.driveType = Drive.bazooka;
        this.gas = 70;
        this.ammunition = 3;
        this.currentHP = HP;
        this.currentGas = gas;
        this.currentAmmo = ammunition;
        //TODO balancing
        //this.strength = 99;
        this.mobility = 2;
        this.vision = 2;
        this.rangeLow = 1;
        this.rangeHigh = 1;
        this.MainGun = new Gun("Bazooka");
        this.SubGun = new Gun("Machine Gun");
    }    
}
