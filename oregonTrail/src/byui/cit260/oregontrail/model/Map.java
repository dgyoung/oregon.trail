/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
/**
 *
 * @author Lane
 */
public class Map implements Serializable{
    private String pathChoice;
    private String checkpoint;
    private ArrayList<Game> games = new ArrayList<Game>();

    public String getPathChoice() {
        return pathChoice;
    }

    public void setPathChoice(String pathChoice) {
        this.pathChoice = pathChoice;
    }

    public String getCheckpoint() {
        return checkpoint;
    }

    public void setCheckpoint(String checkpoint) {
        this.checkpoint = checkpoint;
    }

    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }

    public Map() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.pathChoice);
        hash = 79 * hash + Objects.hashCode(this.checkpoint);
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "pathChoice=" + pathChoice + ", checkpoint=" + checkpoint + '}';
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
        final Map other = (Map) obj;
        if (!Objects.equals(this.pathChoice, other.pathChoice)) {
            return false;
        }
        if (!Objects.equals(this.checkpoint, other.checkpoint)) {
            return false;
        }
        return true;
    }
    
    
}
