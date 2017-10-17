package aw.code;

/**
 * calculates damage when attacking and defending
 * @author minf102322
 */
public class DamageCalc {
    
     /**
     * damage formula:
     * [BASE DAMAGE] x [ATTACKER HP / 10] x [ATTACK STAT / TARGET DEFENSE STAT]
     * final damage is rounded DOWN
     */
    
    private final int[][] mainGunDamageTable =
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
    
    private final int[][] subGunDamageTable =
    //<editor-fold defaultstate="collapsed" desc="Sub Gun Damage Table">
        /*Bazooka*/     {{18, 15, 5, 8, 5, 1, 35, 15, 35, 35, 20, 1},
        /*Tank*/        {40, 35, 8, 8, 5, 1, 1, 45, 55, 55, 45, 1},
        /*Heavy Tank*/  {40, 35, 8, 8, 5, 1, 1, 45, 60, 60, 45, 1},
        /*Mega Tank*/   {40, 40, 10, 10, 10, 1, 1, 45, 65, 65, 45, 1},
        /*Battle Heli*/ {30, 30, 1, 8, 8, 1, 1, 25, 35, 25, 20, 1}};
    //</editor-fold>
    
    //methods
    
    /**
     * returns indexes of attacker and defender in the tables
     * @param attacker
     * @param defender
     * @return 
     */
    public int[] getIndex(Unit attacker, Unit defender) {
        int[] indexes = new int[2];
        //<editor-fold defaultstate="collapsed" desc="attacker index">
        //the attacker index
        switch (attacker.getName()) {
            case "Bazooka": indexes[0] = 0;
            case "Tank": indexes[0] = 1;
            case "Heavy Tank": indexes[0] = 2;
            case "Mega Tank": indexes[0] = 3;
            case "Battle Helicopter": indexes[0] = 4;
            case "Infantry": indexes[0] = 5;
            case "Motorbike": indexes[0] = 6;
            case "Recon": indexes[0] = 7;
            case "Flare": indexes[0] = 8;
            case "Anti-Air": indexes[0] = 9;
            case "Artillery": indexes[0] = 10;
            case "Anti-Tank": indexes[0] = 11;
            case "Rockets": indexes[0] = 12;
            case "Missiles": indexes[0] = 13;
            case "Battleship": indexes[0] = 14;
            case "Carrier": indexes[0] = 15;
            case "Submarine": indexes[0] = 16;
            case "Cruiser": indexes[0] = 17;
            case "Missile Boat": indexes[0] = 18;
            case "Interceptor": indexes[0] = 19;
            case "Bomber": indexes[0] = 20;
            case "Fighter": indexes[0] = 21;
            case "Seaplane": indexes[0] = 22;
        }
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="defender index">
        //the defender index
        switch (defender.getName()) {
            case "Recon": indexes[1] = 0;
            case "Flare": indexes[1] = 1;
            case "Anti-Air": indexes[1] = 2;
            case "Tank": indexes[1] = 3;
            case "Heavy Tank": indexes[1] = 4;
            case "Mega Tank": indexes[1] = 5;
            case "Anti-Tank": indexes[1] = 6;
            case "Artillery": indexes[1] = 7;
            case "Rockets": indexes[1] = 8;
            case "Missiles": indexes[1] = 9;
            case "Mobile Workshop": indexes[1] = 10;
            case "Meteor": indexes[1] = 11;
            case "Infantry": indexes[1] = 12;
            case "Bazooka": indexes[1] = 13;
            case "Motorbike": indexes[1] = 14;
            case "Battleship": indexes[1]= 15;
            case "Carrier": indexes[1] = 16;
            case "Submarine": indexes[1] = 17;
            case "Cruiser": indexes[1] = 18;
            case "Missile Boat": indexes[1] = 19;
            case "Lander": indexes[1] = 20;
            case "Interceptor": indexes[1] = 21;
            case "Bomber": indexes[1] = 22;
            case "Fighter": indexes[1] = 23;
            case "Battle Helicopter": indexes[1] = 24;
            case "Transport Heli": indexes[1] = 25;
            case "Seaplane": indexes[1] = 26;
        }
        //</editor-fold>
        return indexes;
    }
    
    /**
     * calculates damage of a fight
     * also deducts used ammo
     * @param attacker the attacking unit
     * @param defender the defending unit
     */
    public void attack(Unit attacker, Unit defender) {
        
    }
}