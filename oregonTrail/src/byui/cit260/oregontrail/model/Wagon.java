/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;

import java.util.Objects;

/**
 *
 * @author Allie
 */
public class Wagon{
    
    private int pace;
    private String rations;
    private Wagon wagon;

    public Wagon() {
    }
    
    public int getPace() {
        return pace;
    }

    public void setPace(int pace) {
        this.pace = pace;
    }

    public String getRations() {
        return rations;
    }

    public void setRations(String rations) {
        this.rations = rations;
    }

    public Wagon getWagon() {
        return wagon;
    }

    public void setWagon(Wagon wagon) {
        this.wagon = wagon;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + this.pace;
        hash = 31 * hash + Objects.hashCode(this.rations);
        return hash;
    }

    @Override
    public String toString() {
        return "Wagon{" + "pace=" + pace + ", rations=" + rations + '}';
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
        if (this.pace != other.pace) {
            return false;
        }
        if (!Objects.equals(this.rations, other.rations)) {
            return false;
        }
        return true;
    }
}
