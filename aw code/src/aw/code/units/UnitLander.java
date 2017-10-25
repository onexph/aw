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
        this.setName("Lander");
        this.setHasMoved(true);
        this.cost = 10000;
        this.attackMode = AttackMode.none;
        this.unitType = UnitType.ship;
        this.setDriveType(Drive.transport);
        this.mainGun = "-";
        this.subGun = "-";
        this.gas = 99;
        this.setCurrentHealth(getMAXHEALTH());
        this.setCurrentGas(getGas());
        this.mobility = 6;
        this.vision = 1;
        this.rangeLow = 1;
        this.rangeHigh = 1;
    } 

    @Override
    public boolean canAttack(Unit defender) {
        return false;
    }
}
