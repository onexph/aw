package aw.code.units;

import aw.code.Map;
import aw.code.Unit;
import java.util.EnumSet;

/**
 *
 * @author minf102322
 */
public class UnitGunboat extends Unit {
    /**
     * loaded units
     * can load infantry and bazooka
     */
    Unit[] load = new Unit[1];
    
    protected static EnumSet<UnitType> canAttack = 
            EnumSet.of(UnitType.ship, UnitType.sub);

    public UnitGunboat(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.setName("Missile Boat");
        this.setHasMoved(true);
        this.cost = 6000;
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.ship;
        this.setDriveType(Drive.ship);
        this.mainGun = "Anti-Ship Missiles";
        this.subGun = "-";
        this.gas = 99;
        this.ammunition = 1;
        this.setCurrentHealth(getMAXHEALTH());
        this.setCurrentGas(getGas());
        this.setCurrentAmmo(getAmmunition());
        this.mobility = 7;
        this.vision = 2;
        this.rangeLow = 1;
        this.rangeHigh = 1;
    }  

    @Override
    public boolean canAttack(Unit defender) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
