package aw.code.units;

import aw.code.Map;
import aw.code.Unit;
import java.util.EnumSet;

/**
 *
 * @author minf102322
 */
public class UnitBattleship extends Unit {

    public UnitBattleship(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.setName("Battleship");
        this.setHasMoved(true);
        this.cost = 25000;
        this.canAttack = EnumSet.of(UnitType.infantry, UnitType.vehicle,UnitType.ship, UnitType.sub, UnitType.meteor);
        this.attackMode = AttackMode.ranged;
        this.unitType = UnitType.ship;
        this.setDriveType(Drive.ship);
        this.mainGun = "Cannon";
        this.subGun = "-";
        this.gas = 99;
        this.ammunition = 6;
        this.setCurrentHealth(getMAXHEALTH());
        this.setCurrentGas(getGas());
        this.setCurrentAmmo(getAmmunition());
        this.mobility = 5;
        this.vision = 3;
        this.rangeLow = 3;
        this.rangeHigh = 5;
    }   
    
    /**
     * battleship can attack after moving, so different fire radius calc
     */
    @Override
    public void showFireRadius() {
        
    }
}
