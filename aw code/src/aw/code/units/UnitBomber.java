package aw.code.units;

import aw.code.Map;
import aw.code.Unit;
import java.util.EnumSet;

/**
 *
 * @author minf102322
 */
public class UnitBomber extends Unit {

    protected static EnumSet<UnitType> canAttack = 
            EnumSet.of(UnitType.infantry, UnitType.vehicle,UnitType.ship, UnitType.sub, UnitType.meteor);
    
    public UnitBomber(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.name = "Bomber";
        this.hasMoved = true;
        this.cost = 2000;
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.air;
        this.driveType = Drive.air;
        this.mainGun = "Bomb";
        this.subGun = "-";
        this.gas = 99;
        this.ammunition = 6;
        this.currentHealth = MAXHEALTH;
        this.currentGas = gas;
        this.currentAmmo = ammunition;
        this.mobility = 7;
        this.vision = 3;
        this.rangeLow = 1;
        this.rangeHigh = 1;
    }   

    @Override
    public int canAttack(Unit defender) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
