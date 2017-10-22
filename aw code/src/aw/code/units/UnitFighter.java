package aw.code.units;

import aw.code.Map;
import aw.code.Unit;
import java.util.EnumSet;

/**
 *
 * @author minf102322
 */
public class UnitFighter extends Unit {

    protected static EnumSet<UnitType> canAttack = 
            EnumSet.of(UnitType.infantry, UnitType.vehicle,UnitType.air, UnitType.heli, UnitType.meteor);
    
    public UnitFighter(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.name = "Fighter";
        this.hasMoved = true;
        this.cost = 13000;
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.air;
        this.driveType = Drive.air;
        this.mainGun = "Machine Gun";
        this.subGun = "-";
        this.gas = 99;
        this.currentHealth = MAXHEALTH;
        this.currentGas = gas;
        this.mobility = 8;
        this.vision = 4;
        this.rangeLow = 1;
        this.rangeHigh = 1;
    }   

    @Override
    public int canAttack(Unit defender) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
