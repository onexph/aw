package aw.code.units;

import aw.code.Map;
import aw.code.Unit;
import java.util.EnumSet;

/**
 *
 * @author minf102322
 */
public class UnitTankSmall extends Unit {

    protected static EnumSet<UnitType> canAttack = 
            EnumSet.of(UnitType.infantry, UnitType.vehicle, UnitType.ship, UnitType.sub ,UnitType.heli, UnitType.meteor);
    
    public UnitTankSmall(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.name = "Tank";
        this.hasMoved = true;
        this.cost = 7000;
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.vehicle;
        this.driveType = Drive.tank;
        this.mainGun = "Tank Gun";
        this.subGun = "Machine Gun";
        this.gas = 70;
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
    public boolean canAttack(Unit defender) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
