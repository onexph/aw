package aw.code.units;

import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitArtillery extends Unit {

    @Override
    public void create(int x, int y) {
        this.name = "Artillery";
        this.x = x;
        this.y = y;
        this.hasMoved = true;
        //TODO how?
        //this.faction = 
        this.cost = 6000;
        this.attackMode = AttackMode.ranged;
        this.unitType = UnitType.vehicle;
        this.driveType = Drive.tank;
        this.gas = 50;
        this.ammunition = 6;
        this.currentHP = HP;
        this.currentGas = gas;
        this.currentAmmo = ammunition;
        //TODO balancing
        //this.strength = 99;
        this.mobility = 5;
        this.vision = 3;
        this.rangeLow = 2;
        this.rangeHigh = 3;
        this.MainGun = new Gun("Cannon");
        this.SubGun = null;
    }    
}
