package byui.cit260.oregontrail.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;



public class Supplies implements Serializable{
    
    /*public Supplies() {
        this.items = new ArrayList<>();
    }
    
    private String supplyName;
    
    private ArrayList<Item> items;
    
    private int resource;
    */
    
    private int wagonWheel;
    private int wagonAxel;
    private int wagonTonuge;
    private int ammunition;
    private int clothing;
    private int oxen;
    private int food;
    private int money;

    public int getWagonWheel() {
        return wagonWheel;
    }

    public void setWagonWheel(int wagonWheel) {
        this.wagonWheel = wagonWheel;
    }

    public int getWagonAxel() {
        return wagonAxel;
    }

    public void setWagonAxel(int wagonAxel) {
        this.wagonAxel = wagonAxel;
    }

    public int getWagonTonuge() {
        return wagonTonuge;
    }

    public void setWagonTonuge(int wagonTonuge) {
        this.wagonTonuge = wagonTonuge;
    }

    public int getAmmunition() {
        return ammunition;
    }

    public void setAmmunition(int ammunition) {
        this.ammunition = ammunition;
    }

    public int getClothing() {
        return clothing;
    }

    public void setClothing(int clothing) {
        this.clothing = clothing;
    }

    public int getOxen() {
        return oxen;
    }

    public void setOxen(int oxen) {
        this.oxen = oxen;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Supplies() {
    }

    @Override
    public String toString() {
        return "Supplies{" + "wagonWheel=" + wagonWheel + ", wagonAxel=" + wagonAxel + ", wagonTonuge=" + wagonTonuge + ", ammunition=" + ammunition + ", clothing=" + clothing + ", oxen=" + oxen + ", food=" + food + ", money=" + money + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.wagonWheel;
        hash = 41 * hash + this.wagonAxel;
        hash = 41 * hash + this.wagonTonuge;
        hash = 41 * hash + this.ammunition;
        hash = 41 * hash + this.clothing;
        hash = 41 * hash + this.oxen;
        hash = 41 * hash + this.food;
        hash = 41 * hash + this.money;
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
        final Supplies other = (Supplies) obj;
        if (this.wagonWheel != other.wagonWheel) {
            return false;
        }
        if (this.wagonAxel != other.wagonAxel) {
            return false;
        }
        if (this.wagonTonuge != other.wagonTonuge) {
            return false;
        }
        if (this.ammunition != other.ammunition) {
            return false;
        }
        if (this.clothing != other.clothing) {
            return false;
        }
        if (this.oxen != other.oxen) {
            return false;
        }
        if (this.food != other.food) {
            return false;
        }
        if (this.money != other.money) {
            return false;
        }
        return true;
    }
    
    
}
