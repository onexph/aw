/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aw.code.tileContent.buildings;

import aw.code.Map;
import aw.code.Unit;
import aw.code.tileContent.Building;

/**
 *
 * @author Seb
 */
public class BuildingSilo extends Building{
 
    public final int cover = 2;
    private int remainingCaptureTime;

    public BuildingSilo(int x, int y, Map.Faction faction) {
        super(x, y, faction);
        this.remainingCaptureTime = captureTime;
        this.generatesFunds = false;
    }
    
    
    /**
     * @param unit unit on the tile
     * @return mobility cost of the tile
     */
    @Override
    public int getMobilityCost(Unit unit) {
        switch (unit.getDriveType()) {
            case infantry: return 1;
            case bazooka: return 1;
            case tireA: return 1;
            case tireB: return 1;
            case tank: return 1;
            case air: return 1;
            case ship: return 999;
            case transport: return 999;
            default: return 999;
        }
    }
}
