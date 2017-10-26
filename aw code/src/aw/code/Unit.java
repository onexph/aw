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
    protected String name;
    
    /**
     * coordinates of unit
     */
    protected int x;
    protected int y;
    
    //TODO image
    
    //arrays of raw damage numbers
    protected static final int[][] MAINGUNDMG =
    //<editor-fold defaultstate="collapsed" desc="Main Gun Damage Table">
        /*Bazooka*/     {{85, 80, 55, 55, 25, 15, 55, 70, 85, 85, 75, 15, 65, 55, 55, 0, 0, 0, 0, 0, 0, 0, 0, 0, 12, 35, 0},
        /*Tank*/        {85, 80, 75, 55, 35, 20, 30, 70, 85, 85, 75, 20, 75, 70, 70, 8, 8, 9, 9, 55, 18, 0, 0, 0, 18, 35, 0},
        /*Heavy Tank*/  {95, 90, 90, 70, 55, 35, 35, 85, 90, 90, 90, 35, 90, 80, 80, 10, 10, 12, 12, 55, 22, 0, 0, 0, 24, 40, 0},
        /*Mega Tank*/   {105, 105, 105, 85, 75, 55, 40, 105, 105, 105, 105, 55, 105, 95, 95, 12, 12, 14, 14, 65, 28, 0, 0, 0, 35, 45, 0},
        /*Battle Heli*/ {75, 75, 10, 70, 45, 35, 20, 65, 75, 55, 70, 20, 75, 65, 65, 25, 15, 15, 5, 85, 15, 0, 0, 0, 65, 85, 0},
        /*Infantry*/    {12, 10, 3, 5, 5, 1, 30, 10, 20, 20, 14, 1, 55, 45, 45, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 30, 0},
        /*Motorbike*/   {18, 15, 5, 8, 5, 1, 35, 15, 35, 35, 20, 1, 65 ,55, 55, 0, 0, 0, 0, 0, 0, 0, 0, 0, 12, 35, 0},
        /*Recon*/       {35, 30, 8, 8, 5, 1, 15, 45, 55, 55, 45, 1, 75, 65, 65, 0, 0, 0, 0, 0, 0, 0, 0, 0, 18, 35, 0},
        /*Flare*/       {60, 50, 45, 10, 5, 1, 15, 45, 55, 55, 45, 5, 80, 70, 70, 0, 0, 0, 0, 0, 0, 0, 0, 0, 18, 35, 0},
        /*Anti-Air*/    {60, 50, 45, 15, 10, 1, 15, 50, 55, 55, 50, 10, 105, 105, 105, 0, 0, 0, 0, 0, 0, 70, 70, 75, 105, 120, 75},
        /*Artillery*/   {80, 75, 65, 60, 45, 35, 55, 75, 80, 80, 70, 45, 90, 85, 85, 45, 45, 55, 55, 105, 65, 0, 0, 0, 0, 0, 0},
        /*Anti-Tank*/   {75, 75, 75, 75, 65, 55, 55, 65, 70, 70, 65, 55, 75, 65, 65, 0, 0, 0, 0, 0, 0, 0, 0, 0, 45, 55, 0},
        /*Rockets*/     {90, 85, 75, 70, 55, 45, 65, 80, 85, 85, 80, 55, 95, 90, 90, 55, 55, 65, 65, 105, 75, 0, 0, 0, 0, 0, 0},
        /*Missiles*/    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 100, 100, 120, 120, 100},
        /*Battleship*/  {70, 70, 65, 65, 50, 40, 55, 70, 75, 75, 65, 55, 75, 70, 70, 45, 50, 65, 65, 95, 0, 0, 0, 0, 0, 0},
        /*Carrier*/     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 35, 35, 40, 45, 55, 40},
        /*Submarine*/   {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 80, 110, 55, 20, 120, 85, 0, 0, 0, 0, 0, 0},
        /*Cruiser*/     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 38, 38, 95, 28, 85, 40, 105, 105, 105, 120, 120, 105},
        /*Missile Boat*/{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 40, 40, 40, 40, 75, 55, 0, 0, 0, 0, 0, 0},
        /*Interceptor*/ {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 55, 65, 80, 120, 120, 65},
        /*Bomber*/      {105, 105, 85, 105, 95, 75, 80, 105, 105, 95, 105, 90, 115, 110, 110, 85, 85, 95, 50, 120, 95, 0, 0, 0, 0, 0, 0},
        /*Fighter*/     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 40, 45, 55, 75, 90, 45},
        /*Sea Plan*/    {80, 75, 45, 75, 65, 55, 50, 70, 80, 70, 75, 55, 65, 65, 55, 40, 105, 85, 45, 55, 65, 85, 95, 55}};
    //</editor-fold>
    protected static final int[][] SUBGUNDMG =
    //<editor-fold defaultstate="collapsed" desc="Sub Gun Damage Table">
        /*Bazooka*/     {{18, 15, 5, 8, 5, 1, 35, 15, 35, 35, 20, 1},
        /*Tank*/        {40, 35, 8, 8, 5, 1, 1, 45, 55, 55, 45, 1},
        /*Heavy Tank*/  {40, 35, 8, 8, 5, 1, 1, 45, 60, 60, 45, 1},
        /*Mega Tank*/   {40, 40, 10, 10, 10, 1, 1, 45, 65, 65, 45, 1},
        /*Battle Heli*/ {30, 30, 1, 8, 8, 1, 1, 25, 35, 25, 20, 1}};
    //</editor-fold>
    
    //tells if unit has acted already this turn
    protected boolean hasMoved;
    
    //faction of the unit
    protected Faction faction;
    
    //cost of the unit
    protected int cost;

    /**
     * the attack mode of the unit
     */
    public static enum AttackMode {
        none, direct, ranged;
    }
    
    /**
     * the type of the unit
     */
    public static enum UnitType {
        infantry, vehicle, air, heli, ship, sub, meteor;
    }
    
    /**
     * how the unit moves
     */
    public static enum Drive {
        infantry, bazooka, tireA, tireB, tank, air, ship, transport; 
    }
    
    protected AttackMode attackMode;
    protected EnumSet<UnitType> canAttack;
    protected UnitType unitType;
    protected Drive driveType;
    
    /**
     * names of the weapons
     */
    protected String mainGun;
    protected String subGun;
    
    /**
     * stats of the unit
     */
    protected static final int MAXHEALTH = 100;
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
    //the attack modifiers
    protected int attStrength;
    //the defense modifiers
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
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the MAINGUNDMG
     */
    public static int[][] getMAINGUNDMG() {
        return MAINGUNDMG;
    }

    /**
     * @return the SUBGUNDMG
     */
    public static int[][] getSUBGUNDMG() {
        return SUBGUNDMG;
    }

    /**
     * @return the hasMoved
     */
    public boolean isHasMoved() {
        return hasMoved;
    }

    /**
     * @param hasMoved the hasMoved to set
     */
    public void setHasMoved(boolean hasMoved) {
        this.hasMoved = hasMoved;
    }

    /**
     * @return the faction
     */
    public Faction getFaction() {
        return faction;
    }

    /**
     * @param faction the faction to set
     */
    public void setFaction(Faction faction) {
        this.faction = faction;
    }

    /**
     * @return the cost
     */
    public int getCost() {
        return cost;
    }

    /**
     * @return the attackMode
     */
    public AttackMode getAttackMode() {
        return attackMode;
    }

    /**
     * @return the canAttack
     */
    public EnumSet<UnitType> getCanAttack() {
        return canAttack;
    }

    /**
     * @return the unitType
     */
    public UnitType getUnitType() {
        return unitType;
    }

    /**
     * @return the driveType
     */
    public Drive getDriveType() {
        return driveType;
    }

    /**
     * @param driveType the driveType to set
     */
    public void setDriveType(Drive driveType) {
        this.driveType = driveType;
    }

    /**
     * @return the mainGun
     */
    public String getMainGun() {
        return mainGun;
    }

    /**
     * @return the subGun
     */
    public String getSubGun() {
        return subGun;
    }

    /**
     * @return the MAXHEALTH
     */
    public static int getMAXHEALTH() {
        return MAXHEALTH;
    }

    /**
     * @return the gas
     */
    public int getGas() {
        return gas;
    }

    /**
     * @return the ammunition
     */
    public int getAmmunition() {
        return ammunition;
    }

    /**
     * @return the currentHealth
     */
    public int getCurrentHealth() {
        return currentHealth;
    }

    /**
     * @param currentHealth the currentHealth to set
     */
    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    /**
     * @return the currentGas
     */
    public int getCurrentGas() {
        return currentGas;
    }

    /**
     * @param currentGas the currentGas to set
     */
    public void setCurrentGas(int currentGas) {
        this.currentGas = currentGas;
    }

    /**
     * @return the currentAmmo
     */
    public int getCurrentAmmo() {
        return currentAmmo;
    }

    /**
     * @param currentAmmo the currentAmmo to set
     */
    public void setCurrentAmmo(int currentAmmo) {
        this.currentAmmo = currentAmmo;
    }

    /**
     * @return the attStrength
     */
    public int getAttStrength() {
        return attStrength;
    }

    /**
     * @param attStrength the attStrength to set
     */
    public void setAttStrength(int attStrength) {
        this.attStrength = attStrength;
    }

    /**
     * @return the defStrength
     */
    public int getDefStrength() {
        return defStrength;
    }

    /**
     * @param defStrength the defStrength to set
     */
    public void setDefStrength(int defStrength) {
        this.defStrength = defStrength;
    }

    /**
     * @return the mobility
     */
    public int getMobility() {
        return mobility;
    }

    /**
     * @return the vision
     */
    public int getVision() {
        return vision;
    }

    /**
     * @return the rangeLow
     */
    public int getRangeLow() {
        return rangeLow;
    }

    /**
     * @return the rangeHigh
     */
    public int getRangeHigh() {
        return rangeHigh;
    }
    //</editor-fold>

    public Unit(int x, int y, Faction faction) {
        this.x = x;
        this.y = y;
        this.faction = faction;
        this.initialize();
    }
    
    /**
     * returns indexes of attacker and defender in the tables
     * @param attacker
     * @param defender
     * @return 
     */
    public static int[] getIndex(Unit attacker, Unit defender) {
        int[] indexes = new int[2];
        //<editor-fold defaultstate="collapsed" desc="attacker index">
        //the attacker index
        switch (attacker.getName()) {
            case "Bazooka": indexes[0] = 0;break;
            case "Tank": indexes[0] = 1;break;
            case "Heavy Tank": indexes[0] = 2;break;
            case "Mega Tank": indexes[0] = 3;break;
            case "Battle Helicopter": indexes[0] = 4;break;
            case "Infantry": indexes[0] = 5;break;
            case "Motorbike": indexes[0] = 6;break;
            case "Recon": indexes[0] = 7;break;
            case "Flare": indexes[0] = 8;break;
            case "Anti-Air": indexes[0] = 9;break;
            case "Artillery": indexes[0] = 10;break;
            case "Anti-Tank": indexes[0] = 11;break;
            case "Rockets": indexes[0] = 12;break;
            case "Missiles": indexes[0] = 13;break;
            case "Battleship": indexes[0] = 14;break;
            case "Carrier": indexes[0] = 15;break;
            case "Submarine": indexes[0] = 16;break;
            case "Cruiser": indexes[0] = 17;break;
            case "Missile Boat": indexes[0] = 18;break;
            case "Interceptor": indexes[0] = 19;break;
            case "Bomber": indexes[0] = 20;break;
            case "Fighter": indexes[0] = 21;break;
            case "Seaplane": indexes[0] = 22;
        }
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="defender index">
        //the defender index
        switch (defender.getName()) {
            case "Recon": indexes[1] = 0;break;
            case "Flare": indexes[1] = 1;break;
            case "Anti-Air": indexes[1] = 2;break;
            case "Tank": indexes[1] = 3;break;
            case "Heavy Tank": indexes[1] = 4;break;
            case "Mega Tank": indexes[1] = 5;break;
            case "Anti-Tank": indexes[1] = 6;break;
            case "Artillery": indexes[1] = 7;break;
            case "Rockets": indexes[1] = 8;break;
            case "Missiles": indexes[1] = 9;break;
            case "Mobile Workshop": indexes[1] = 10;break;
            case "Meteor": indexes[1] = 11;break;
            case "Infantry": indexes[1] = 12;break;
            case "Bazooka": indexes[1] = 13;break;
            case "Motorbike": indexes[1] = 14;break;
            case "Battleship": indexes[1]= 15;break;
            case "Carrier": indexes[1] = 16;break;
            case "Submarine": indexes[1] = 17;break;
            case "Cruiser": indexes[1] = 18;break;
            case "Missile Boat": indexes[1] = 19;break;
            case "Lander": indexes[1] = 20;break;
            case "Interceptor": indexes[1] = 21;break;
            case "Bomber": indexes[1] = 22;break;
            case "Fighter": indexes[1] = 23;break;
            case "Battle Helicopter": indexes[1] = 24;break;
            case "Transport Heli": indexes[1] = 25;break;
            case "Seaplane": indexes[1] = 26;
        }
        //</editor-fold>
        return indexes;
    }
    
    //methods
    
    /**
     * creates unit at given coordinates
     */
    protected abstract void initialize(); 
    
    /**
     * highlights tiles this unit can attack IF attackMode = ranged
     * when holding down cancel key over unit
     */
    public void showFireRadius() {
        if (this.getAttackMode() == AttackMode.ranged) {
            //TODO fire radius
        }
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
       this.fuelUsage();
    }
    
    /**
     * calculates fuel usage for this unit 
     */
    public void fuelUsage() {
        switch (this.getUnitType()) {
            case air: this.gas =- 5;
            case heli: this.gas =- 2;
        }
    }
    
    /**
     * determines if this unit can attack the target
     * @param defender
     * @return 
     */
    public boolean canAttack(Unit defender) {
        return this.canAttack.contains(defender.getUnitType());
    }
    
    
    /**
     * checks which DmgTable is to be used against defending unit
     * @param defender
     * @return 
     */
    public int getDmgTable(Unit defender) {
        throw new UnsupportedOperationException();
    }
    
    /**
     * attacks target unit
     * @param defender target unit 
     * @param dmgTable 
     * @return  
     */
    public int attack(Unit defender, int dmgTable) {
        throw new UnsupportedOperationException();
    }

    
    
    /**
     * determines if unit can be loaded into loader unit
     * @param loader loader unit
     * @return true if loadable
     */
//    public abstract boolean canBeLoaded(Unit loader);
    
    //XXX maybe implement commander units later
}
