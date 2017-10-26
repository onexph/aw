package aw.code.units;

import aw.code.Map;
import aw.code.Unit;
import java.util.EnumSet;

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
        this.setName("Infantry");
        this.setHasMoved(true);
        this.cost = 1500;
        this.canAttack = EnumSet.of(UnitType.infantry, UnitType.vehicle, UnitType.heli, UnitType.meteor);
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.infantry;
        this.setDriveType(Drive.infantry);
        this.mainGun = "-";
        this.subGun = "Machine Gun";
        this.gas = 99;
        this.setCurrentHealth(getMAXHEALTH());
        this.setCurrentGas(getGas());
        this.mobility = 3;
        this.vision = 2;
        this.rangeLow = 1;
        this.rangeHigh = 1;
    }
}
