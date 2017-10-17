package aw.code.units;

import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitSubmarine extends Unit {

    @Override
    public void create(int x, int y) {
        this.name = "Submarine";
        this.x = x;
        this.y = y;
        this.hasMoved = true;
        //TODO how?
        //this.faction = 
        this.cost = 20000;
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.sub;
        this.driveType = Drive.ship;
        this.gas = 70;
        this.ammunition = 6;
        this.currentHP = HP;
        this.currentGas = gas;
        this.currentAmmo = ammunition;
        //TODO balancing
        //this.strength = 99;
        this.mobility = 6;
        this.vision = 5;
        this.rangeLow = 1;
        this.rangeHigh = 1;
        this.MainGun = new Gun("Torpedo");
        this.SubGun = null;
    }    
}
