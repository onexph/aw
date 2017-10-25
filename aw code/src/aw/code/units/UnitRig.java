package aw.code.units;

import aw.code.Map;
import aw.code.Unit;

/**
 *
 * @author minf102322
 */
public class UnitRig extends Unit {
    
    /**
     * loaded units
     * can load infantry and bazooka
     */
    Unit[] load = new Unit[1];

    public UnitRig(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.setName("Mobile Workshop");
        this.setHasMoved(true);
        this.cost = 5000;
        this.attackMode = AttackMode.none;
        this.unitType = UnitType.vehicle;
        this.setDriveType(Drive.tank);
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
