package aw.code.units;

import aw.code.Map;
import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitBattleship extends Unit {

    public UnitBattleship(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.name = "Battleship";
        this.hasMoved = true;
        this.cost = 25000;
        this.attackMode = AttackMode.ranged;
        this.unitType = UnitType.ship;
        this.driveType = Drive.ship;
        this.mainGun = "Cannon";
        this.subGun = "-";
        this.gas = 99;
        this.ammunition = 6;
        this.currentHealth = health;
        this.currentGas = gas;
        this.currentAmmo = ammunition;
        this.mobility = 5;
        this.vision = 3;
        this.rangeLow = 3;
        this.rangeHigh = 5;
    }   
}
