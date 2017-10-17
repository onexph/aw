package aw.code.units;

import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitInterceptor extends Unit {

    @Override
    public void create(int x, int y) {
        this.name = "Interceptor";
        this.x = x;
        this.y = y;
        this.hasMoved = true;
        //TODO how?
        //this.faction = 
        this.cost = 20000;
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.air;
        this.driveType = Drive.air;
        this.gas = 99;
        this.ammunition = 6;
        this.currentHealth = health;
        this.currentGas = gas;
        this.currentAmmo = ammunition;
        //TODO balancing
        //this.defStrength = 99;
        this.mobility = 9;
        this.vision = 5;
        this.rangeLow = 1;
        this.rangeHigh = 1;
        this.MainGun = new Gun("Anti-Air Missiles");
        this.SubGun = null;
    }   
}
