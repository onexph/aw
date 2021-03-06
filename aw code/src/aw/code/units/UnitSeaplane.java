package aw.code.units;

import aw.code.Map;
import aw.code.Unit;
import java.util.EnumSet;

/**
 *
 * @author minf102322
 */
public class UnitSeaplane extends Unit {
    
    public UnitSeaplane(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected void initialize() {
        this.setName("Seaplane");
        this.setHasMoved(true);
        this.cost = 15000;
        this.canAttack = EnumSet.of(UnitType.infantry, UnitType.vehicle, UnitType.air, UnitType.heli, UnitType.ship, UnitType.sub, UnitType.meteor);
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.air;
        this.setDriveType(Drive.air);
        this.mainGun = "Missiles";
        this.subGun = "-";
        this.gas = 40;
        this.ammunition = 3;
        this.setCurrentHealth(getMAXHEALTH());
        this.setCurrentGas(getGas());
        this.setCurrentAmmo(getAmmunition());
        this.mobility = 7;
        this.vision = 4;
        this.rangeLow = 1;
        this.rangeHigh = 1;
    }
}
