/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;

import java.util.Objects;
import java.io.Serializable;

/**
 *
 * @author Alexandra
 */
public class Character implements Serializable{
    
    private String name = "";
    private String affliction;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAffliction() {
        return affliction;
    }

    public void setAffliction(String affliction) {
        this.affliction = affliction;
    }

    public Character() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.affliction);
        return hash;
    }

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", affliction=" + affliction + '}';
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
        final Character other = (Character) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.affliction, other.affliction)) {
            return false;
        }
        return true;
    }
   
}
