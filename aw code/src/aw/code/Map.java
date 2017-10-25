package aw.code;

import aw.code.units.*;

/**
 * contains the map and lets you interact with it (by moving units)
 * @author minf102322
 */
public class Map {

    
    
    
    /**
     * the factions
     */
    public static enum Faction {
        green, blue, red, black,neutral;
    }
    
    /**
     * the possible weather conditions
     */
    public static enum Weather {
        clear, rain, sandstorm, snow;
    }
    
    /**
     * the map, yo
     */
    public Tile[][] map;
    
    /**
     * another map rendered on top of the other
     * to show FireRadius and MovementRadius
     */
    public char[][] highlightMap;
    //TODO find something other than char than can display transparent images
    
    //XXX maybe topography later
    
    public Weather currentWeather;
    
    
    //unit attack
    //unit build
    
    /**
     * 
     * @param attacker
     * @param defender 
     */
    public static void attack(Unit attacker, Unit defender) {
        int attDmg = attacker.attack(defender, attacker.getDmgTable(defender));
        if (defender.getCurrentHealth() <= attDmg) {
            destroy(defender);
        } else if (attacker instanceof UnitAT) {
            
        } else {
            defender.setCurrentHealth(defender.getCurrentHealth() - attDmg);
            if (attacker.getAttackMode() != Unit.AttackMode.ranged && defender.getAttackMode() != Unit.AttackMode.ranged) {
                int defDmg = defender.attack(attacker, defender.getDmgTable(attacker));
                if (attacker.getCurrentHealth() <= defDmg) {
                    destroy(attacker);
                } else {
                    attacker.setCurrentHealth(attacker.getCurrentHealth() - defDmg);
                }
            }
        }
    }
    
    /**
     * destroys unit if killed
     * @param defender 
     */
    private static void destroy(Unit defender) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static boolean isNextTo(Unit unitA, Unit unitB) {
        
    }
}
