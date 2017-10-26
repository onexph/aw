package aw.code.units;

import aw.code.Map;
import aw.code.Unit;
import java.util.EnumSet;

/**
 *
 * @author minf102322
 */
public class UnitBomber extends Unit {

    public UnitBomber(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.setName("Bomber");
        this.setHasMoved(true);
        this.cost = 20000;
        this.canAttack = EnumSet.of(UnitType.infantry, UnitType.vehicle,UnitType.ship, UnitType.sub, UnitType.meteor);
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.air;
        this.setDriveType(Drive.air);
        this.mainGun = "Bomb";
        this.subGun = "-";
        this.gas = 99;
        this.ammunition = 6;
        this.setCurrentHealth(getMAXHEALTH());
        this.setCurrentGas(getGas());
        this.setCurrentAmmo(getAmmunition());
        this.mobility = 7;
        this.vision = 3;
        this.rangeLow = 1;
        this.rangeHigh = 1;
    }
}
