package aw.code.units;

import aw.code.Map;
import aw.code.Unit;
import java.util.EnumSet;

/**
 *
 * @author minf102322
 */
public class UnitTankSmall extends Unit {

    public UnitTankSmall(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.setName("Tank");
        this.setHasMoved(true);
        this.cost = 7000;
        this.canAttack = EnumSet.of(UnitType.infantry, UnitType.vehicle, UnitType.ship, UnitType.sub ,UnitType.heli, UnitType.meteor);
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.vehicle;
        this.setDriveType(Drive.tank);
        this.mainGun = "Tank Gun";
        this.subGun = "Machine Gun";
        this.gas = 70;
        this.ammunition = 6;
        this.setCurrentHealth(getMAXHEALTH());
        this.setCurrentGas(getGas());
        this.setCurrentAmmo(getAmmunition());
        this.mobility = 6;
        this.vision = 3;
        this.rangeLow = 1;
        this.rangeHigh = 1;
    }

    @Override
    public boolean canAttack(Unit defender) {
        if (!this.canAttack.contains(defender.getUnitType())) {
            return false;
        } else {
            return (this.ammunition != 0 || (defender.getUnitType() != UnitType.ship && defender.getUnitType() != UnitType.sub));
        }
    }
}
