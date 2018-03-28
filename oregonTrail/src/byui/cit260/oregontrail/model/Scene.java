
package byui.cit260.oregontrail.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.logging.Logger;


/*
 * created by Brad R. Allen
 */

public class Scene implements Serializable {

    public Scene() {
    }
    
    private String description;
    private String name;
    private String mapSymbol;
 

    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.description);
        hash = 71 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", name=" + name + '}';
    }
    private static final Logger LOG = Logger.getLogger(Scene.class.getName());

    

}
