/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;
import java.io.Serializable;

/**
 *
 * @author team
 */
public class Game implements Serializable{
    private int noPeople;
    private int totalDays;
    private Player player;
    private Map map;
    private String characterChoice;
    
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

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public String getCharacterChoice() {
        return characterChoice;
    }

    public void setCharacterChoice(String characterChoice) {
        this.characterChoice = characterChoice;
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
