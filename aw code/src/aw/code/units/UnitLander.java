package aw.code.units;

import aw.code.Map;
import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitLander extends Unit {
    
    /**
     * loaded units
     * can load ground units
     */
    Unit[] load = new Unit[2];
    

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
        this.currentHealth = MAXHEALTH;
        this.currentGas = gas;
        this.mobility = 6;
        this.vision = 1;
        this.rangeLow = 1;
        this.rangeHigh = 1;
    } 

    @Override
    public int canAttack(Unit defender) {
        return 0;
    }
}
