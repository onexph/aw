package aw.code.units;

import aw.code.Map;
import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitSeaplane extends Unit {

    public UnitSeaplane(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected void initialize() {
        this.name = "Seaplane";
        this.hasMoved = true;
        this.cost = 15000;
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.air;
        this.driveType = Drive.air;
        this.mainGun = "Missiles";
        this.subGun = "-";
        this.gas = 40;
        this.ammunition = 3;
        this.currentHealth = health;
        this.currentGas = gas;
        this.currentAmmo = ammunition;
        this.mobility = 7;
        this.vision = 4;
        this.rangeLow = 1;
        this.rangeHigh = 1;
    }
    
}
