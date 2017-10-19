package aw.code.units;

import aw.code.Map;
import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitBomber extends Unit {

    public UnitBomber(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.name = "Bomber";
        this.hasMoved = true;
        this.cost = 2000;
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.air;
        this.driveType = Drive.air;
        this.mainGun = "Bomb";
        this.subGun = "-";
        this.gas = 99;
        this.ammunition = 6;
        this.currentHealth = health;
        this.currentGas = gas;
        this.currentAmmo = ammunition;
        this.mobility = 7;
        this.vision = 3;
        this.rangeLow = 1;
        this.rangeHigh = 1;
    }   
}
