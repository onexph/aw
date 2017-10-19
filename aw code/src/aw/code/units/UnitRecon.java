package aw.code.units;

import aw.code.Map;
import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitRecon extends Unit {

    public UnitRecon(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.name = "Recon";
        this.hasMoved = true;
        this.cost = 4000;
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.vehicle;
        this.driveType = Drive.tireA;
        this.mainGun = "-";
        this.subGun = "Machine Gun";
        this.gas = 80;
        this.currentHealth = health;
        this.currentGas = gas;
        this.mobility = 8;
        this.vision = 5;
        this.rangeLow = 1;
        this.rangeHigh = 1;
    }   
}
