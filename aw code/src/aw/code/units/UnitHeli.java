package aw.code.units;

import aw.code.Map;
import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitHeli extends Unit {

    public UnitHeli(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.name = "Battle Helicopter";
        this.hasMoved = true;
        this.cost = 9000;
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.heli;
        this.driveType = Drive.air;
        this.mainGun = "Air-Surface Missiles";
        this.subGun = "Machine Gun";
        this.gas = 99;
        this.ammunition = 6;
        this.currentHealth = health;
        this.currentGas = gas;
        this.currentAmmo = ammunition;
        this.mobility = 6;
        this.vision = 2;
        this.rangeLow = 1;
        this.rangeHigh = 1;
    }  
}
