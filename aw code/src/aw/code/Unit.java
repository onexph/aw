package aw.code;

import aw.code.Map.Faction;
import java.util.EnumSet;

/**
 * A unit 
 * @author minf102322
 */
public abstract class Unit {
    //TODO special abilities (battleship, flare, rig, at gun counter, transport units
    //TODO flavour text, description etc.
    
    //<editor-fold defaultstate="collapsed" desc="attributes and shit">
    public String name;
    
    /**
     * coordinates of unit
     */
    public int x;
    public int y;
    
    //TODO image
    
    
    //tells if unit has acted already this turn
    protected boolean hasMoved;
    
    //faction of the unit
    protected Faction faction;
    
    //cost of the unit
    protected int cost;
    
    /**
     * the attack mode of the unit
     */
    public enum AttackMode {
        none, direct, ranged;
    }
    
    /**
     * the type of the unit
     */
    public enum UnitType {
        infantry, vehicle, air, heli, ship, sub;
    }
    
    /**
     * how the unit moves
     */
    public enum Drive {
        infantry, bazooka, tireA, tireB, tank, air, ship, transport; 
    }
    
    protected AttackMode attackMode;
    protected EnumSet<UnitType> canAttack;
    protected UnitType unitType;
    protected Drive driveType;
    
    /**
     * stats of the unit
     */
    protected final int health = 100;
    protected int gas;
    /**
     * ammo of main gun,
     * in case of sub gun set to -1
     */
    protected int ammunition;
    //current usables
    protected int currentHealth;
    protected int currentGas;
    protected int currentAmmo;
    //the attack
    protected int attStrength;
    //the defense
    protected int defStrength;
    //how far a unit can move in 1 turn
    protected int mobility;
    //how far a unit can see
    protected int vision;
    //the attack range
    protected int rangeLow;
    protected int rangeHigh;
    //XXX lvl later?
    
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="get set">
    public boolean isHasMoved() {
        return hasMoved;
    }
    
    public void setHasMoved(boolean hasMoved) {
        this.hasMoved = hasMoved;
    }

    public int getGas() {
        return gas;
    }
    
    public void setGas(int gas) {
        this.gas = gas;
    }
    
    public int getAmmunition() {
        return ammunition;
    }
    
    public void setAmmunition(int ammunition) {
        this.ammunition = ammunition;
    }
    
    public String getName() {
        return name;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public Faction getFaction() {
        return faction;
    }
    
    public AttackMode getAttackMode() {
        return attackMode;
    }
    
    public UnitType getUnitType() {
        return unitType;
    }
    
    public int getDefStrength() {
        return defStrength;
    }
    
    public int getMobility() {
        return mobility;
    }
    
    public int getVision() {
        return vision;
    }
    
    public Drive getDriveType() {
        return driveType;
    }
//</editor-fold>

    public Unit(int x, int y, Faction faction) {
        this.x = x;
        this.y = y;
        this.faction = faction;
    }
    
    
    
    //methods
    
    /**
     * creates unit at given coordinates
     * @param x x-coordinate
     * @param y y-coordinate
     */
    public abstract void create(int x, int y); 
    
    /**
     * highlights tiles this unit can attack IF attackMode = ranged
     * when holding down cancel key over unit
     */
    public void showFireRadius() {
        
    }
    
    /**
     * highlights movement radius when pressing action key while on unit
     */
    public void showMovementRadius() {
        
    }
    
    /**
     * tell unit to move to x,y coordinates
     * @param x x-coordinate
     * @param y y-coordinate
     */
    public void move(int x, int y) {
        //TODO check movement radius
        //TODO make it plan a route so ambushes can happen
    }
    
    /**
     * tell unit to wait (do nothing)
     */
    public void unitWait() {
        
    }
    
    //XXX maybe implement commander units later
}
