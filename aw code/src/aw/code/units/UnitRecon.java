package aw.code.units;

import aw.code.Map;
import aw.code.Unit;
import java.util.EnumSet;

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
        this.setName("Recon");
        this.setHasMoved(true);
        this.cost = 4000;
        this.canAttack = EnumSet.of(UnitType.infantry, UnitType.vehicle, UnitType.heli, UnitType.meteor);
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.vehicle;
        this.setDriveType(Drive.tireA);
        this.mainGun = "-";
        this.subGun = "Machine Gun";
        this.gas = 80;
        this.setCurrentHealth(getMAXHEALTH());
        this.setCurrentGas(getGas());
        this.mobility = 8;
        this.vision = 5;
        this.rangeLow = 1;
        this.rangeHigh = 1;
    }
}
