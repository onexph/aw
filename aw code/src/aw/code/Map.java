package aw.code;

import aw.code.units.*;

/**
 * contains the map and lets you interact with it (by moving units)
 * @author minf102322
 */
public class Map {

    /**
     * size of the map
     */
    public int xSize;
    public int ySize;
    
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
            /**
             * AT gun has special damage calc due to counter attack ability 
             * and dual attack type (direct AND ranged)
             */
            //------Special AT Part Start---------------
            defender.setCurrentHealth(defender.getCurrentHealth() - attDmg);
            if (isNextTo(attacker, defender)) {
                int defDmg = defender.attack(attacker, defender.getDmgTable(attacker));
                if (attacker.getCurrentHealth() <= defDmg) {
                    destroy(attacker);
                } else {
                    attacker.setCurrentHealth(attacker.getCurrentHealth() - defDmg);
                }
            }
        } else if (defender instanceof UnitAT && attacker.getAttackMode() == Unit.AttackMode.direct) { 
            int defDmg = defender.attack(attacker, defender.getDmgTable(attacker));
            if (attacker.getCurrentHealth() <= defDmg) {
                destroy(attacker);
            } else {
                attacker.setCurrentHealth(attacker.getCurrentHealth() - defDmg);
            }
            defender.setCurrentHealth(defender.getCurrentHealth() - attDmg);
            //------Special AT Part Finish---------------
        } else {
            defender.setCurrentHealth(defender.getCurrentHealth() - attDmg);
            if (attacker.getAttackMode() != Unit.AttackMode.ranged && defender.getAttackMode() == Unit.AttackMode.direct) {
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
        return (unitA.getX() - 1 == unitB.getX() ||  //Left
                unitA.getX() + 1 == unitB.getX() ||  //Right
                unitA.getY() + 1 == unitB.getY() ||  //Above
                unitA.getY() - 1 == unitB.getY());   //Below
    }
}
