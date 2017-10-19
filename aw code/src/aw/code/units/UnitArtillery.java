package aw.code.units;

import aw.code.Map;
import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitArtillery extends Unit {

    public UnitArtillery(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.name = "Artillery";
        this.hasMoved = true;
        this.cost = 6000;
        this.attackMode = AttackMode.ranged;
        this.unitType = UnitType.vehicle;
        this.driveType = Drive.tank;
        this.mainGun = "Cannon";
        this.subGun = "-";
        this.gas = 50;
        this.ammunition = 6;
        this.currentHealth = health;
        this.currentGas = gas;
        this.currentAmmo = ammunition;
        this.mobility = 5;
        this.vision = 3;
        this.rangeLow = 2;
        this.rangeHigh = 3;
    }    
}
