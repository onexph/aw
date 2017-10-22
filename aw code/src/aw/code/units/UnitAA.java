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
        this.name = "Anti-Air";
        this.hasMoved = true; 
        this.cost = 7000;
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.vehicle;
        this.driveType = Drive.tank;
        this.mainGun = "Cannon";
        this.subGun = "-";
        this.gas = 60;
        this.ammunition = 6;
        this.currentHealth = MAXHEALTH;
        this.currentGas = gas;
        this.currentAmmo = ammunition;
        this.mobility = 6;
        this.vision = 3;
        this.rangeLow = 1;
        this.rangeHigh = 1;
    }   

    @Override
    public int canAttack(Unit defender) {
        return 0;
    }
}
