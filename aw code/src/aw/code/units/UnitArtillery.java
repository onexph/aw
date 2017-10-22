package aw.code.units;

import aw.code.Map;
import aw.code.Unit;
import java.util.EnumSet;

/**
 *
 * @author minf102322
 */
public class UnitArtillery extends Unit {
    
    protected static EnumSet<UnitType> canAttack = 
            EnumSet.of(UnitType.infantry, UnitType.vehicle,UnitType.ship, UnitType.sub, UnitType.meteor);

    public UnitArtillery(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.name = "Artillery";
        this.hasMoved = true;
        this.cost = 6000;
        this.attackMode = AttackMode.ranged;
        this.unitType = UnitType.vehicle;
        this.driveType = Drive.tank;
        this.mainGun = "Cannon";
        this.subGun = "-";
        this.gas = 50;
        this.ammunition = 6;
        this.currentHealth = MAXHEALTH;
        this.currentGas = gas;
        this.currentAmmo = ammunition;
        this.mobility = 5;
        this.vision = 3;
        this.rangeLow = 2;
        this.rangeHigh = 3;
    }    

    @Override
    public int canAttack(Unit defender) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
