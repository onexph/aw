package aw.code.units;

import aw.code.Map;
import aw.code.Unit;
import java.util.EnumSet;

/**
 *
 * @author minf102322
 */
public class UnitAA extends Unit {

    protected static EnumSet<UnitType> canAttack = 
            EnumSet.of(UnitType.infantry, UnitType.vehicle,UnitType.air, UnitType.heli, UnitType.meteor);
        
    
    public UnitAA(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.setName("Anti-Air");
        this.setHasMoved(true); 
        this.cost = 7000;
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.vehicle;
        this.setDriveType(Drive.tank);
        this.mainGun = "Cannon";
        this.subGun = "-";
        this.gas = 60;
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
        throw new UnsupportedOperationException();
    }
}
