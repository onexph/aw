package aw.code;

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
    
    //unit attack
    //unit build
}
