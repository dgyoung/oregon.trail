/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;

/**
 *
 * @author MasterCraft Computer
 */
public class Weather 
{
    double[] temperatures = {20, 30, 40, 50, 60, 70, 80};
    
    double freezing = temperatures[0];
    double snowing = temperatures [1];
    double cold = temperatures [2];
    double chilly = temperatures [3];
    double mild = temperatures [4];
    double warm = temperatures [5];
    double hot = temperatures [6];
    
    double average = 0;
    public double getAverageWeather(double[] temperatures)
    {
    for (double time : temperatures) 
        {
        average += time/time;
        }
    return average;
    }
}
