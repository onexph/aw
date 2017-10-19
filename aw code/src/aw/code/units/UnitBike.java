package aw.code.units;

import aw.code.Map;
import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitBike extends Unit {

    public UnitBike(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.name = "Motorbike";
        this.hasMoved = true;
        this.cost = 2500;
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.infantry;
        this.driveType = Drive.tireB;
        this.mainGun = "-";
        this.subGun = "Machine Gun";
        this.gas = 70;
        this.currentHealth = health;
        this.currentGas = gas;
        this.mobility = 5;
        this.vision = 2;
        this.rangeLow = 1;
        this.rangeHigh = 1;
    }    
}
