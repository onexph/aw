package aw.code.units;

import aw.code.Map;
import aw.code.Unit;
import java.util.EnumSet;

/**
 *
 * @author minf102322
 */
public class UnitAT extends Unit {

    protected static EnumSet<UnitType> canAttack = 
            EnumSet.of(UnitType.infantry, UnitType.vehicle, UnitType.heli, UnitType.meteor);
    
    public UnitAT(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.name = "Anti-Tank";
        this.hasMoved = true;
        this.cost = 11000;
        this.attackMode = AttackMode.ranged;
        this.unitType = UnitType.vehicle;
        this.driveType = Drive.tireB;
        this.mainGun = "Cannon";
        this.subGun = "-";
        this.gas = 50;
        this.ammunition = 6;
        this.currentHealth = MAXHEALTH;
        this.currentGas = gas;
        this.currentAmmo = ammunition;
        this.mobility = 4;
        this.vision = 2;
        this.rangeLow = 1;
        this.rangeHigh = 3;
    }

    @Override
    public boolean canAttack(Unit defender) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
