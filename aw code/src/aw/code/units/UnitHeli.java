package aw.code.units;

import aw.code.Map;
import aw.code.Unit;
import java.util.EnumSet;

/**
 *
 * @author minf102322
 */
public class UnitHeli extends Unit {

    protected static EnumSet<UnitType> canAttack = 
            EnumSet.of(UnitType.infantry, UnitType.vehicle, UnitType.heli, UnitType.meteor);
    
    public UnitHeli(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.name = "Battle Helicopter";
        this.hasMoved = true;
        this.cost = 9000;
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.heli;
        this.driveType = Drive.air;
        this.mainGun = "Air-Surface Missiles";
        this.subGun = "Machine Gun";
        this.gas = 99;
        this.ammunition = 6;
        this.currentHealth = MAXHEALTH;
        this.currentGas = gas;
        this.currentAmmo = ammunition;
        this.mobility = 6;
        this.vision = 2;
        this.rangeLow = 1;
        this.rangeHigh = 1;
    }  

    @Override
    public boolean canAttack(Unit defender) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
