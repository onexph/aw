package aw.code.units;

import aw.code.Map;
import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitLander extends Unit {

    public UnitLander(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.name = "Lander";
        this.hasMoved = true;
        this.cost = 10000;
        this.attackMode = AttackMode.none;
        this.unitType = UnitType.ship;
        this.driveType = Drive.transport;
        this.mainGun = "-";
        this.subGun = "-";
        this.gas = 99;
        this.currentHealth = health;
        this.currentGas = gas;
        this.mobility = 6;
        this.vision = 1;
        this.rangeLow = 1;
        this.rangeHigh = 1;
    } 
}
