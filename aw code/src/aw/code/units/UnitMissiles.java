package aw.code.units;

import aw.code.Map;
import aw.code.Unit;
import java.util.EnumSet;

/**
 *
 * @author minf102322
 */
public class UnitMissiles extends Unit {

    protected static EnumSet<UnitType> canAttack = 
            EnumSet.of(UnitType.air, UnitType.heli);
    
    public UnitMissiles(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.setName("Missiles");
        this.setHasMoved(true);
        this.cost = 12000;
        this.attackMode = AttackMode.ranged;
        this.unitType = UnitType.vehicle;
        this.setDriveType(Drive.tireA);
        this.mainGun = "Anti-Air Missiles";
        this.subGun = "-";
        this.gas = 50;
        this.ammunition = 5;
        this.setCurrentHealth(getMAXHEALTH());
        this.setCurrentGas(getGas());
        this.setCurrentAmmo(getAmmunition());
        this.mobility = 5;
        this.vision = 5;
        this.rangeLow = 3;
        this.rangeHigh = 6;
    }   

    @Override
    public boolean canAttack(Unit defender) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
