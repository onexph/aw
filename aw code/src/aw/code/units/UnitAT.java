package aw.code.units;

import aw.code.Map;
import aw.code.Unit;
import java.util.EnumSet;

/**
 *
 * @author minf102322
 */
public class UnitAT extends Unit {
    
    public UnitAT(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.setName("Anti-Tank");
        this.setHasMoved(true);
        this.cost = 11000;
        this.canAttack = EnumSet.of(UnitType.infantry, UnitType.vehicle, UnitType.heli, UnitType.meteor);
        this.attackMode = AttackMode.ranged;
        this.unitType = UnitType.vehicle;
        this.setDriveType(Drive.tireB);
        this.mainGun = "Cannon";
        this.subGun = "-";
        this.gas = 50;
        this.ammunition = 6;
        this.setCurrentHealth(getMAXHEALTH());
        this.setCurrentGas(getGas());
        this.setCurrentAmmo(getAmmunition());
        this.mobility = 4;
        this.vision = 2;
        this.rangeLow = 1;
        this.rangeHigh = 3;
    }
}
