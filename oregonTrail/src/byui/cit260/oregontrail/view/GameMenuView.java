/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;
import byui.cit260.oregontrail.model.Location;
import byui.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.view.NewGameMenuViewStartingMonth;
import java.util.Calendar;
/**
 *
 * @author Allie
 */
class GameMenuView {
    
    void displayGameMenuView(){
        Calendar calendar = null;       
        System.out.println("\n********** The Oregon Trail *******************"
                + "* Location: Independence *\n"
                + "* Date: GetCalendar *\n"
                + "* Health: good *\n"
                + "* Pace: steady *\n"
                + "* Rations: filling *\n"
                + "\n"
                + "* 1. Continue on trail *\n"
                + "* 2. Check supplies *\n"
                + "* 3. Display the map *\n"
                + "* 4. Change pace *\n"
                + "* 5. Change food rations *\n"
                + "* 6. Stop to rest *\n"
                + "* 7. Hunt *\n"
                +"*-----What is your choice? *\n");

        boolean endOfView = false;
    }
}
