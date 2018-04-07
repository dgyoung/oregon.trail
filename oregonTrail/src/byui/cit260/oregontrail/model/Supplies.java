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
    
    public static int wagonWheel = 0;
    public static int wagonAxel = 0;
    public static int wagonTonuge = 0;
    public static int ammunition = 0;
    public static int clothing = 0;
    public static int oxen = 0;
    public static int food = 0;
    public static int money = 0;

    public static int getWagonWheel() {
        return wagonWheel;
    }

    public static void setWagonWheel(int wagonWheel) {
        Supplies.wagonWheel = wagonWheel;
    }

    public static int getWagonAxel() {
        return wagonAxel;
    }

    public static void setWagonAxel(int wagonAxel) {
        Supplies.wagonAxel = wagonAxel;
    }

    public static int getWagonTonuge() {
        return wagonTonuge;
    }

    public static void setWagonTonuge(int wagonTonuge) {
        Supplies.wagonTonuge = wagonTonuge;
    }

    public static int getAmmunition() {
        return ammunition;
    }

    public static void setAmmunition(int ammunition) {
        Supplies.ammunition = ammunition;
    }

    public static int getClothing() {
        return clothing;
    }

    public static void setClothing(int clothing) {
        Supplies.clothing = clothing;
    }

    public static int getOxen() {
        return oxen;
    }

    public static void setOxen(int oxen) {
        Supplies.oxen = oxen;
    }

    public static int getFood() {
        return food;
    }

    public static void setFood(int food) {
        Supplies.food = food;
    }

    public static int getMoney() {
        return money;
    }

    public static void setMoney(int money) {
        Supplies.money = money;
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
