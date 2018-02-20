/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Objects;

/**
 *
 * @author bradrallen
 */
public class GameControl {
    public double scoreGame(double[] trekers, double mileMarker, double[] remainingResources, String occupation){
    //validate input
    //add up health of all trekers
    double trekerHealth = 0;
    for(int i=0; i< trekers.length; i++){
        trekerHealth += trekers[i];
    }
    //if 0 gthen no health left so everyone is dead
    if (trekerHealth ==0){
        return -1;
    }
    //if not 2000 then not at end of trail
    if (mileMarker !=2000){
        return -1;
    }
    
    double occupationMultiplier = 0;
    if (Objects.equals(occupation, "banker")){
        occupationMultiplier = 1;
    }else if (Objects.equals(occupation, "carpenter")){
        occupationMultiplier = 2;
    }else if (Objects.equals(occupation, "farmer")){
        occupationMultiplier = 3;
    }else {
        return -1;
    }
    //add up value of remaining resources
    double totalResources = 0;
    for(int i=0; i< remainingResources.length; i++){
        totalResources += remainingResources[i];
    }
    
    double rawScore = trekerHealth + totalResources;

    double score = rawScore * occupationMultiplier;
    return score;
    }
    
}
