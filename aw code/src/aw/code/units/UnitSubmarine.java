package aw.code.units;

import aw.code.Map;
import aw.code.Unit;
import java.util.EnumSet;

/**
 *
 * @author minf102322
 */
public class UnitSubmarine extends Unit {
    
    private boolean submerged;
    protected static EnumSet<UnitType> canAttack = 
        EnumSet.of(UnitType.ship, UnitType.sub);
    
    public UnitSubmarine(int x, int y, Map.Faction faction) {
        super(x, y, faction);
    }

    @Override
    protected final void initialize() {
        this.setName("Submarine");
        this.setHasMoved(true);
        this.cost = 20000;
        this.attackMode = AttackMode.direct;
        this.unitType = UnitType.sub;
        this.setDriveType(Drive.ship);
        this.mainGun = "Torpedo";
        this.subGun = "-";
        this.gas = 70;
        this.ammunition = 6;
        this.setCurrentHealth(getMAXHEALTH());
        this.setCurrentGas(getGas());
        this.setCurrentAmmo(getAmmunition());
        this.mobility = 6;
        this.vision = 5;
        this.rangeLow = 1;
        this.rangeHigh = 1;
        /** special stats */
        //submarines spawn submerged
        this.submerged = true;
    }    
    
    /**
     * fuel usage for submarines depends on submerged state
     */
    @Override
    public void fuelUsage() {
        int f = this.submerged ? 5 : 1;
        this.gas =- f;
    }

    @Override
    public boolean canAttack(Unit defender) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
