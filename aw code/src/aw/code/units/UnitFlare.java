package aw.code.units;

import aw.code.Map;
import aw.code.Unit;
import java.util.EnumSet;

/**
 *
 * @author minf102322
 */
public class UnitFlare extends Unit {

    protected static EnumSet<UnitType> canAttack = 
            EnumSet.of(UnitType.infantry, UnitType.vehicle,UnitType.heli, UnitType.meteor);
    
    public UnitFlare(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.name = "Flare";
        this.hasMoved = true;
        this.cost = 5000;
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.vehicle;
        this.driveType = Drive.tank;
        this.mainGun = "-";
        this.subGun = "Machine Gun";
        this.gas = 60;
        this.ammunition = 3;
        this.currentHealth = MAXHEALTH;
        this.currentGas = gas;
        this.currentAmmo = ammunition;
        this.mobility = 5;
        this.vision = 2;
        this.rangeLow = 1;
        this.rangeHigh = 1;
    }    

    @Override
    public int canAttack(Unit defender) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
