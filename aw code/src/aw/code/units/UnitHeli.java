package aw.code.units;

import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitHeli extends Unit {

    @Override
    public void create(int x, int y) {
        this.name = "Battle Helicopter";
        this.x = x;
        this.y = y;
        this.hasMoved = true;
        //TODO how?
        //this.faction = 
        this.cost = 9000;
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.heli;
        this.driveType = Drive.air;
        this.gas = 99;
        this.ammunition = 6;
        this.currentHealth = health;
        this.currentGas = gas;
        this.currentAmmo = ammunition;
        //TODO balancing
        //this.defStrength = 99;
        this.mobility = 6;
        this.vision = 2;
        this.rangeLow = 1;
        this.rangeHigh = 1;
        this.MainGun = new Gun("Air-Surface Missiles");
        this.SubGun = new Gun("Machine Gun");
    }  
}
