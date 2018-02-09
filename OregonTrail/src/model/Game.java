/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author MasterCraft Computer
 */
public class Game implements Serializable
{
    private int elapsedDays;
    private String startMonth;
    private int noAlive;
    private String gameFilePath;
    private Player player;
    
    enum Month {March, April, May, June, July;}

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }    
    
    public int getElapsedDays() {
        return elapsedDays;
    }

    public void setElapsedDays(int elapsedDays) {
        this.elapsedDays = elapsedDays;
    }

    public String getStartMonth() {
        return startMonth;
    }

    public void setStartMonth(String startMonth) {
        this.startMonth = startMonth;
    }

    public int getNoAlive() {
        return noAlive;
    }

    public void setNoAlive(int noAlive) {
        this.noAlive = noAlive;
    }

    public String getGameFilePath() {
        return gameFilePath;
    }

    public void setGameFilePath(String gameFilePath) {
        this.gameFilePath = gameFilePath;
    }

    public Game() 
    {
    
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.elapsedDays;
        hash = 17 * hash + Objects.hashCode(this.startMonth);
        hash = 17 * hash + this.noAlive;
        hash = 17 * hash + Objects.hashCode(this.gameFilePath);
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
        if (this.elapsedDays != other.elapsedDays) {
            return false;
        }
        if (this.noAlive != other.noAlive) {
            return false;
        }
        if (!Objects.equals(this.startMonth, other.startMonth)) {
            return false;
        }
        if (!Objects.equals(this.gameFilePath, other.gameFilePath)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "elapsedDays=" + elapsedDays + ", startMonth=" + startMonth + ", noAlive=" + noAlive + ", gameFilePath=" + gameFilePath + '}';
    }
    
}