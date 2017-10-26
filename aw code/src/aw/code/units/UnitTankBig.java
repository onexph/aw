package aw.code.units;

import aw.code.Map;
import aw.code.Unit;
import java.util.EnumSet;

/**
 *
 * @author minf102322
 */
public class UnitTankBig extends Unit {
    
    public UnitTankBig(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.setName("Mega Tank");
        this.setHasMoved(true);
        this.cost = 16000;
        this.canAttack = EnumSet.of(UnitType.infantry, UnitType.vehicle, UnitType.ship, UnitType.sub, UnitType.heli, UnitType.meteor);
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.vehicle;
        this.setDriveType(Drive.tank);
        this.mainGun = "War Tank Gun";
        this.subGun = "Machine Gun";
        this.gas = 50;
        this.ammunition = 5;
        this.setCurrentHealth(getMAXHEALTH());
        this.setCurrentGas(getGas());
        this.setCurrentAmmo(getAmmunition());
        this.mobility = 4;
        this.vision = 2;
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
