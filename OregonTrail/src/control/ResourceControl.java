/*
 * created by Brad R. Allen
 */
package control;

/**
 *
 * @author bradrallen
 */
public class ResourceControl {
  public void updateCurrentRations(String rations){
        System.out.println("*** updateCurrentRations() ***");
    }
  public void stopAndRest(int days){
        int numDays = days;
        while (numDays > 0) {
          //check for random event like an accident that can happen each day - not built yet
          System.out.println("*** stopAndRest() nothing bad happened today ***");

          //advance the date by the number of days
          System.out.println("*** stopAndRest() advanced the date by 1 day ***");
          
          //depleate food resoucres by the consumption rate per day based on the current rations.
          //wagon object not created yet so hard code rations and numbef of people for now.
          String rations = "Filling";//Fillig = 2 lbs per person per day
          int poundsPerDay = 2;
          int trekers = 5;
          int foodConsumed = trekers * poundsPerDay;
          System.out.println("*** stopAndRest() The people in your wagon ate " + foodConsumed + " pounds of food today ***");
          numDays--;
        }
        
    }
}
