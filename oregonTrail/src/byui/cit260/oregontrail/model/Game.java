/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;

/**
 *
 * @author team
 */
public class Game {
    private int noPeople;
    private int totalDays;

    public int getNoPeople() {
        return noPeople;
    }

    public void setNoPeople(int noPeople) {
        this.noPeople = noPeople;
    }

    public int getTotalDays() {
        return totalDays;
    }

    public void setTotalDays(int totalDays) {
        this.totalDays = totalDays;
    }

    public Game() {
    }

    @Override
    public String toString() {
        return "Game{" + "noPeople=" + noPeople + ", totalDays=" + totalDays + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.noPeople;
        hash = 89 * hash + this.totalDays;
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
        final Game other = (Game) obj;
        if (this.noPeople != other.noPeople) {
            return false;
        }
        if (this.totalDays != other.totalDays) {
            return false;
        }
        return true;
    }
    
    
}
