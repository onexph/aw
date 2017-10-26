package aw.code.units;

import aw.code.Map;
import aw.code.Unit;
import java.util.EnumSet;

/**
 *
 * @author minf102322
 */
public class UnitHeli extends Unit {
    
    public UnitHeli(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.setName("Battle Helicopter");
        this.setHasMoved(true);
        this.cost = 9000;
        this.canAttack = EnumSet.of(UnitType.infantry, UnitType.vehicle, UnitType.heli, UnitType.meteor);
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.heli;
        this.setDriveType(Drive.air);
        this.mainGun = "Air-Surface Missiles";
        this.subGun = "Machine Gun";
        this.gas = 99;
        this.ammunition = 6;
        this.setCurrentHealth(getMAXHEALTH());
        this.setCurrentGas(getGas());
        this.setCurrentAmmo(getAmmunition());
        this.mobility = 6;
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
    
    @Override
    public int getDmgTable(Unit Defender) {
        return this.ammunition != 0 ? 1 : 0;
    }
}
