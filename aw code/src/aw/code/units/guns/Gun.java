package aw.code.units.guns;

import aw.code.Unit.UnitType;
import java.util.EnumSet;

/**
 *
 * @author minf102322
 */
public abstract class Gun {
    
    private EnumSet goodAgainst;
    private EnumSet badAgainst;

    public EnumSet getGoodAgainst() {
        return goodAgainst;
    }

    public EnumSet getBadAgainst() {
        return badAgainst;
    }
    
    //TODO create all types of guns, there are different types of guns with the same name
    
    /**
     * calculates damage with enemies unitType and strength
     * @param unitType enemies armor type
     * @param strength this units strength
     * @param eStrength enemies strength
     * @return damage against enemy with this gun
     */
    public abstract int calculateDamage(UnitType unitType, int strength, int eStrength);
}
