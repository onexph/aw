package aw.code.units;

import aw.code.Map;
import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitInterceptor extends Unit {

    public UnitInterceptor(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.name = "Interceptor";
        this.hasMoved = true;
        this.cost = 20000;
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.air;
        this.driveType = Drive.air;
        this.mainGun = "Anti-Air Missiles";
        this.subGun = "-";
        this.gas = 99;
        this.ammunition = 6;
        this.currentHealth = health;
        this.currentGas = gas;
        this.currentAmmo = ammunition;
        this.mobility = 9;
        this.vision = 5;
        this.rangeLow = 1;
        this.rangeHigh = 1;
    }   
}
