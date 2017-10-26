package aw.code.units;

import aw.code.Map;
import aw.code.Unit;
import java.util.EnumSet;

/**
 *
 * @author minf102322
 */
public class UnitFighter extends Unit {

    public UnitFighter(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.setName("Fighter");
        this.setHasMoved(true);
        this.cost = 13000;
        this.canAttack = EnumSet.of(UnitType.infantry, UnitType.vehicle,UnitType.air, UnitType.heli, UnitType.meteor);
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.air;
        this.setDriveType(Drive.air);
        this.mainGun = "Machine Gun";
        this.subGun = "-";
        this.gas = 99;
        this.setCurrentHealth(getMAXHEALTH());
        this.setCurrentGas(getGas());
        this.mobility = 8;
        this.vision = 4;
        this.rangeLow = 1;
        this.rangeHigh = 1;
    }
}
