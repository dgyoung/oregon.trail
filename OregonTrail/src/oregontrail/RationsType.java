/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail;

/**
 *
 * @author bradrallen
 */
public enum RationsType{
    Filling("Filling","meals are large and generous."),
    Meager("Meager","meals are small, but adequate."),
    BareBones("Bare Bones","meals are very small; everyone stays hungry.");
    
    private String name;
    private String description;
    
    RationsType (String name, String description) {
    this.name = name;
    this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "RationsType{" + "name=" + name + ", description=" + description + '}';
    } 

}
