package aw.code.units;

import aw.code.Map;
import aw.code.Unit;
import java.util.EnumSet;

/**
 *
 * @author minf102322
 */
public class UnitCruiser extends Unit {
    
    /**
     * loaded units
     * can load helis
     */
    Unit[] load = new Unit[2];
    
    public UnitCruiser(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.setName("Cruiser");
        this.setHasMoved(true);
        this.cost = 16000;
        this.canAttack = EnumSet.of(UnitType.sub, UnitType.ship, UnitType.air, UnitType.heli);
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.ship;
        this.setDriveType(Drive.transport);
        this.mainGun = "Anti-Ship Missiles";
        this.subGun = "Anti-Air Gun";
        this.gas = 99;
        this.ammunition = 9;
        this.setCurrentHealth(getMAXHEALTH());
        this.setCurrentGas(getGas());
        this.setCurrentAmmo(getAmmunition());
        this.mobility = 6;
        this.vision = 5;
        this.rangeLow = 1;
        this.rangeHigh = 1;
    }
    @Override
    public boolean canAttack(Unit defender) {
        if (!this.canAttack.contains(defender.getUnitType())) {
            return false;
        } else {
            return (this.ammunition != 0 || defender.getUnitType() == UnitType.heli || defender.getUnitType() == UnitType.air);
        }
    }
}
