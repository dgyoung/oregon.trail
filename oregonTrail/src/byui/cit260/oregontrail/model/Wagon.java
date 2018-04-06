/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;
import byui.cit260.orgontrail.exceptions.GameControlException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Allie
 */
public class Wagon implements Serializable {
    
    private int pace;
    private String rations;
    private ArrayList<Character> characters = new ArrayList<>();
    
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

    public ArrayList<Character> getCharacters() {
    return characters;
    }

    public void setCharacters(ArrayList<Character> characters) {
      this.characters = characters;
    }
    
//    public void createCharacters ()throws GameControlException{
//      Character character1 = new Character();
//      Character character2 = new Character();
//      Character character3 = new Character();
//      Character character4 = new Character();
//      Character character5 = new Character();
//    }

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
