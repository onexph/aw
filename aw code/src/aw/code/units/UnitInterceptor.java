package aw.code.units;

import aw.code.Map;
import aw.code.Unit;
import java.util.EnumSet;

/**
 *
 * @author minf102322
 */
public class UnitInterceptor extends Unit {

    public UnitInterceptor(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.setName("Interceptor");
        this.setHasMoved(true);
        this.cost = 20000;
        this.canAttack = EnumSet.of(UnitType.air, UnitType.heli);
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.air;
        this.setDriveType(Drive.air);
        this.mainGun = "Anti-Air Missiles";
        this.subGun = "-";
        this.gas = 99;
        this.ammunition = 6;
        this.setCurrentHealth(getMAXHEALTH());
        this.setCurrentGas(getGas());
        this.setCurrentAmmo(getAmmunition());
        this.mobility = 9;
        this.vision = 5;
        this.rangeLow = 1;
        this.rangeHigh = 1;
    }
}
