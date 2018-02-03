/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;

import java.util.ArrayList;

/**
 *
 * @author davey
 */
public enum StoreScene{
    
    store1(20, 20, 20, 2, 10, 100, 5, ""),
    store2(25, 25, 25, 2, 12, 130, 5, ""),
    store3(30, 30, 30, 3, 14, 150, 6, ""),
    store4(35, 35, 35, 3, 15, 170, 6, ""),
    store5(40, 40, 40, 4, 16, 190, 7, "");
    
    private int wheelCost;
    private int axelCost;
    private int tongueCost;
    private int ammoCost;
    private int clothingCost;
    private int oxenCost;
    private int foodCost;
    private String storeName;
    private ArrayList<Supplies> currentSupply = new ArrayList<Supplies>(1);
    private ArrayList<SceneDescription> description = new ArrayList<SceneDescription>(1);
    

    private StoreScene(int wheelCost, int axelCost, int tongueCost, int ammoCost, int clothingCost, int oxenCost, int foodCost, String storeName) {
        this.wheelCost = wheelCost;
        this.axelCost = axelCost;
        this.tongueCost = tongueCost;
        this.ammoCost = ammoCost;
        this.clothingCost = clothingCost;
        this.oxenCost = oxenCost;
        this.foodCost = foodCost;
        this.storeName = storeName;
    }

    public static StoreScene getStore1() {
        return store1;
    }

    public static StoreScene getStore2() {
        return store2;
    }

    public static StoreScene getStore3() {
        return store3;
    }

    public static StoreScene getStore4() {
        return store4;
    }

    public static StoreScene getStore5() {
        return store5;
    }

    public int getWheelCost() {
        return wheelCost;
    }

    public int getAxelCost() {
        return axelCost;
    }

    public int getTongueCost() {
        return tongueCost;
    }

    public int getAmmoCost() {
        return ammoCost;
    }

    public int getClothingCost() {
        return clothingCost;
    }

    public int getOxenCost() {
        return oxenCost;
    }

    public int getFoodCost() {
        return foodCost;
    }

    public String getStoreName() {
        return storeName;
    }

    public ArrayList<Supplies> getCurrentSupply() {
        return currentSupply;
    }

    public ArrayList<SceneDescription> getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "StoreScene{" + "wheelCost=" + wheelCost + ", axelCost=" + axelCost + ", tongueCost=" + tongueCost + ", ammoCost=" + ammoCost + ", clothingCost=" + clothingCost + ", oxenCost=" + oxenCost + ", foodCost=" + foodCost + ", storeName=" + storeName + '}';
    }
    
    
}
