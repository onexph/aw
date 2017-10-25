package aw.code.units;

import aw.code.Map;
import aw.code.Unit;
import java.util.EnumSet;

/**
 *
 * @author minf102322
 */
public class UnitCarrier extends Unit {
    
    /**
     * loaded units
     * can load air units
     */
    Unit[] load = new Unit[2];

    protected static EnumSet<UnitType> canAttack = 
            EnumSet.of(UnitType.air, UnitType.heli);
    
    public UnitCarrier(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.setName("Carrier");
        this.setHasMoved(true);
        this.cost = 28000;
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.ship;
        this.setDriveType(Drive.ship);
        this.mainGun = "-";
        this.subGun = "Anti-Air Gun";
        this.gas = 99;
        this.setCurrentHealth(getMAXHEALTH());
        this.setCurrentGas(getGas());
        this.setCurrentAmmo(getAmmunition());
        this.mobility = 5;
        this.vision = 4;
        this.rangeLow = 1;
        this.rangeHigh = 1;
    }    

    @Override
    public boolean canAttack(Unit defender) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
