package aw.code.units;

import aw.code.Map;
import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitBazooka extends Unit {

    public UnitBazooka(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.name = "Bazooka";
        this.hasMoved = true;
        this.cost = 2500;
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.infantry;
        this.driveType = Drive.bazooka;
        this.mainGun = "Bazooka";
        this.subGun = "Machine Gun";
        this.gas = 70;
        this.ammunition = 3;
        this.currentHealth = health;
        this.currentGas = gas;
        this.currentAmmo = ammunition;
        this.mobility = 2;
        this.vision = 2;
        this.rangeLow = 1;
        this.rangeHigh = 1;
    }    
}
