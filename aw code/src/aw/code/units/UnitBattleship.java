package aw.code.units;

import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitBattleship extends Unit {

    @Override
    public void create(int x, int y) {
        this.name = "Battleship";
        this.x = x;
        this.y = y;
        this.hasMoved = true;
        //TODO how?
        //this.faction = 
        this.cost = 25000;
        this.attackMode = AttackMode.ranged;
        this.unitType = UnitType.ship;
        this.driveType = Drive.ship;
        this.gas = 99;
        this.ammunition = 6;
        this.currentHP = HP;
        this.currentGas = gas;
        this.currentAmmo = ammunition;
        //TODO balancing
        //this.strength = 99;
        this.mobility = 5;
        this.vision = 3;
        this.rangeLow = 3;
        this.rangeHigh = 5;
        this.MainGun = new Gun("Cannon");
        this.SubGun = null; 
    }   
}
