package aw.code.units;

import aw.code.Map;
import aw.code.Unit;
import java.util.EnumSet;

/**
 *
 * @author minf102322
 */
public class UnitRockets extends Unit {

    public UnitRockets(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.setName("Rockets");
        this.setHasMoved(true);
        this.cost = 15000;
        this.canAttack = EnumSet.of(UnitType.infantry, UnitType.vehicle, UnitType.ship, UnitType.sub, UnitType.meteor);
        this.attackMode = AttackMode.ranged;
        this.unitType = UnitType.vehicle;
        this.setDriveType(Drive.tireA);
        this.mainGun = "Rocket";
        this.subGun = "-";
        this.gas = 50;
        this.ammunition = 5;
        this.setCurrentHealth(getMAXHEALTH());
        this.setCurrentGas(getGas());
        this.setCurrentAmmo(getAmmunition());
        this.mobility = 5;
        this.vision = 5;
        this.rangeLow = 3;
        this.rangeHigh = 5;
    }
}
