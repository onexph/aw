package aw.code.units;

import aw.code.Map;
import aw.code.Unit;
import java.util.EnumSet;

/**
 *
 * @author minf102322
 */
public class UnitInterceptor extends Unit {

    protected static EnumSet<UnitType> canAttack = 
            EnumSet.of(UnitType.air, UnitType.heli);
    
    public UnitInterceptor(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.name = "Interceptor";
        this.hasMoved = true;
        this.cost = 20000;
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.air;
        this.driveType = Drive.air;
        this.mainGun = "Anti-Air Missiles";
        this.subGun = "-";
        this.gas = 99;
        this.ammunition = 6;
        this.currentHealth = MAXHEALTH;
        this.currentGas = gas;
        this.currentAmmo = ammunition;
        this.mobility = 9;
        this.vision = 5;
        this.rangeLow = 1;
        this.rangeHigh = 1;
    }   

    @Override
    public boolean canAttack(Unit defender) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
