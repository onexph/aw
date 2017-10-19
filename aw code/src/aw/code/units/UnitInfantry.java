package aw.code.units;

import aw.code.Map;
import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitInfantry extends Unit {

    public UnitInfantry(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.name = "Infantry";
        this.hasMoved = true;
        this.cost = 1500;
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.infantry;
        this.driveType = Drive.infantry;
        this.mainGun = "-";
        this.subGun = "Machine Gun";
        this.gas = 99;
        this.currentHealth = health;
        this.currentGas = gas;
        this.mobility = 3;
        this.vision = 2;
        this.rangeLow = 1;
        this.rangeHigh = 1;

    }    
}
