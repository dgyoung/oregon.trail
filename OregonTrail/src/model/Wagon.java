/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author bradrallen
 */
public class Wagon implements Serializable {
    private int currentMileMarker;
    private Treker[] trekers = new Treker[5];
    PaceType currentPace;
    RationsType currentRations;
    private Player player;

    public Wagon() {
        currentPace = PaceType.Steady;
        currentRations = RationsType.Filling;
        currentMileMarker = 0;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    public Treker[] getTrekers() {
        return trekers;
    }

    public void setTrekers(Treker[] trekers) {
        this.trekers = trekers;
    }

    public int getCurrentMileMarker() {
        return currentMileMarker;
    }

    public void setCurrentMileMarker(int currentMileMarker) {
        this.currentMileMarker = currentMileMarker;
    }

    public RationsType getCurrentRations() {
        return currentRations;
    }

    public void setCurrentRations(RationsType currentRations) {
        this.currentRations = currentRations;
    }

    public PaceType getCurrentPace() {
        return currentPace;
    }

    public void setCurrentPace(PaceType currentPace) {
        this.currentPace = currentPace;
    }

    @Override
    public String toString() {
        return "Wagon{" + "currentMileMarker=" + currentMileMarker + ", trekers=" + trekers + ", currentPace=" + currentPace + ", currentRations=" + currentRations + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.currentMileMarker;
        hash = 37 * hash + Arrays.deepHashCode(this.trekers);
        hash = 37 * hash + Objects.hashCode(this.currentPace);
        hash = 37 * hash + Objects.hashCode(this.currentRations);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Wagon other = (Wagon) obj;
        if (this.currentMileMarker != other.currentMileMarker) {
            return false;
        }
        if (!Arrays.deepEquals(this.trekers, other.trekers)) {
            return false;
        }
        if (this.currentPace != other.currentPace) {
            return false;
        }
        if (this.currentRations != other.currentRations) {
            return false;
        }
        return true;
    }
   
}
