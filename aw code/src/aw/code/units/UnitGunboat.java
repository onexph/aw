package aw.code.units;

import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitGunboat extends Unit {

    @Override
    public void create(int x, int y) {
        this.name = "Gunboat";
        this.x = x;
        this.y = y;
        this.hasMoved = true;
        //TODO how?
        //this.faction = 
        this.cost = 6000;
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.ship;
        this.driveType = Drive.ship;
        this.gas = 99;
        this.ammunition = 1;
        this.currentHP = HP;
        this.currentGas = gas;
        this.currentAmmo = ammunition;
        //TODO balancing
        //this.strength = 99;
        this.mobility = 7;
        this.vision = 2;
        this.rangeLow = 1;
        this.rangeHigh = 1;
        this.MainGun = new Gun("Anti-Ship Missiles");
        this.SubGun = null;
    }  
}
