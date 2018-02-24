/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail;

import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.HuntingScene;
import byui.cit260.oregontrail.model.RiverScene;
import byui.cit260.oregontrail.model.SceneDescription;
import byui.cit260.oregontrail.model.StoreScene;
import byui.cit260.oregontrail.model.Character;
import byui.cit260.oregontrail.model.Wagon;
import byui.cit260.oregontrail.model.Map;
import byui.cit260.oregontrail.model.Location;
import byui.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.view.StartProgramView;


public class OregonTrail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         StartProgramView startProgramView = new StartProgramView();
         startProgramView.displayStartProgramView();
       
    }
    
}