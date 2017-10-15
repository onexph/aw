package aw.code;

import aw.code.units.Drive;
import aw.code.units.Gun;

/**
 * A unit 
 * @author minf102322
 */
public abstract class Unit {
    
    public String name;
    
    //faction of the unit
    private enum Faction {
        green, blue, red, yellow;
    }
    
    /**
     * the attack mode of the unit
     */
    private enum AttackMode {
        none, direct, ranged;
    }
    
    /**
     * the type of the unit
     */
    private enum UnitType {
        infantry, vehicle, air, heli, ship, sub;
    }
    
    private Faction faction;
    private AttackMode attackMode;
    private UnitType unitType;
    
    /**
     * stats of the unit
     */
    private int HP = 100;
    //the defense
    private int strength;
    private int gas;
    private int ammunition;
    //how far a unit can move in 1 turn
    private int mobility;
    //how far a unit can see
    private int visibility;
    //the attack range
    private int range;
    //XXX lvl later?
    
    /**
     * equipment of the unit
     */
    //the attack
    private Gun MainGun;
    private Gun SubGun;
    //how the unit moves
    private Drive driveType;
}
