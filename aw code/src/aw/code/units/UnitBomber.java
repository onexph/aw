package aw.code.units;

import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitBomber extends Unit {

    @Override
    public void create(int x, int y) {
        this.name = "Bomber";
        this.x = x;
        this.y = y;
        this.hasMoved = true;
        //TODO how?
        //this.faction = 
        this.cost = 2000;
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.air;
        this.driveType = Drive.air;
        this.gas = 99;
        this.ammunition = 6;
        this.currentHP = HP;
        this.currentGas = gas;
        this.currentAmmo = ammunition;
        //TODO balancing
        //this.strength = 99;
        this.mobility = 7;
        this.vision = 3;
        this.rangeLow = 1;
        this.rangeHigh = 1;
        this.MainGun = new Gun("Bomb");
        this.SubGun = null;
    }   
}
