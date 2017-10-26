package aw.code.units;

import aw.code.Map;
import aw.code.Unit;
import java.util.EnumSet;

/**
 *
 * @author minf102322
 */
public class UnitBazooka extends Unit {            

    public UnitBazooka(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.setName("Bazooka");
        this.setHasMoved(true);
        this.cost = 2500;
        this.canAttack = EnumSet.of(UnitType.infantry, UnitType.vehicle, UnitType.heli, UnitType.meteor);
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.infantry;
        this.setDriveType(Drive.bazooka);
        this.mainGun = "Bazooka";
        this.subGun = "Machine Gun";
        this.gas = 70;
        this.ammunition = 3;
        this.setCurrentHealth(getMAXHEALTH());
        this.setCurrentGas(getGas());
        this.setCurrentAmmo(getAmmunition());
        this.mobility = 2;
        this.vision = 2;
        this.rangeLow = 1;
        this.rangeHigh = 1;
    }
    
    @Override
    public int getDmgTable(Unit Defender) {
        return this.ammunition != 0 ? 1 : 0;
    }
}
