package aw.code.units;

import aw.code.Map;
import aw.code.Unit;
import java.util.EnumSet;

/**
 *
 * @author minf102322
 */
public class UnitRecon extends Unit {

    protected static EnumSet<UnitType> canAttack = 
            EnumSet.of(UnitType.infantry, UnitType.vehicle, UnitType.heli, UnitType.meteor);
    
    public UnitRecon(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.setName("Recon");
        this.setHasMoved(true);
        this.cost = 4000;
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.vehicle;
        this.setDriveType(Drive.tireA);
        this.mainGun = "-";
        this.subGun = "Machine Gun";
        this.gas = 80;
        this.setCurrentHealth(getMAXHEALTH());
        this.setCurrentGas(getGas());
        this.mobility = 8;
        this.vision = 5;
        this.rangeLow = 1;
        this.rangeHigh = 1;
    }   

    @Override
    public boolean canAttack(Unit defender) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
