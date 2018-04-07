/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;

import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.Order;
import static byui.cit260.oregontrail.model.StoreScene.store1;
import byui.cit260.oregontrail.model.Supplies;
import byui.cit260.oregontrail.view.ErrorView;
import byui.cit260.orgontrail.exceptions.GameControlException;

/**
 *
 * @author David
 */
public class SupplyControl {

    public static void initilizeSupplies() {

    }

    public static void getSupplyList() throws GameControlException {
    }

    public static void addToSupplies(String supplyItem, int quantity) throws GameControlException {
        switch (supplyItem) {
            case "money":
                {
                    
                    Supplies.setMoney(Supplies.getMoney() + quantity);
                    break;
                }
            case "wagonWheel":
                {
                    Supplies.setWagonWheel(Supplies.getWagonWheel() + quantity);
                    break;
                }
            case "wagonAxel":
                {
                    Supplies.setWagonAxel(Supplies.getWagonAxel() + quantity);
                    break;
                }
            case "wagonTonuge":
                {
                    Supplies.setWagonTonuge(Supplies.getWagonTonuge() + quantity);
                    break;
                }
            case "ammunition":
                {
                    Supplies.setAmmunition(Supplies.getAmmunition() + quantity);
                    break;
                }
            case "clothing":
                {
                    Supplies.setClothing(Supplies.getClothing() + quantity);
                    break;
                }
            case "oxen":
                {
                    Supplies.setOxen(Supplies.getOxen() + quantity);
                    break;
                }
            case "food":
                {
                    Supplies.setFood(Supplies.getFood() + quantity);
                    break;
                }
            default:
                throw new GameControlException("ERROR: addToSupplies");
        }
    }

    public static void removeFromSupplies(String supplyItem, int quantity) throws GameControlException {
        switch (supplyItem) {
            case "money":
                {
                    if(Supplies.money < quantity){
                        throw new GameControlException("Not Enough Money");
                    }
                    Supplies.setMoney(Supplies.getMoney() - quantity);
                    store1.setSpent(store1.getSpent() + quantity);
                    break;
                }
            case "wagonWheel":
                {
                    Supplies.setWagonWheel(Supplies.getWagonWheel() - quantity);
                    break;
                }
            case "wagonAxel":
                {
                    Supplies.setWagonAxel(Supplies.getWagonAxel() - quantity);
                    break;
                }
            case "wagonTonuge":
                {
                    Supplies.setWagonTonuge(Supplies.getWagonTonuge() - quantity);
                    break;
                }
            case "ammunition":
                {
                    Supplies.setAmmunition(Supplies.getAmmunition() - quantity);
                    break;
                }
            case "clothing":
                {
                    Supplies.setClothing(Supplies.getClothing() - quantity);
                    break;
                }
            case "oxen":
                {
                    Supplies.setOxen(Supplies.getOxen() - quantity);
                    break;
                }
            case "food":
                {
                    Supplies.setFood(Supplies.getFood() - quantity);
                    break;
                }
            default:
                throw new GameControlException("ERROR: removeFromSupplies");
        }
    }

    public static void calcSupplyCost(char location, char supplyItem, int quantity) {

    }

  public static class initilizeSupplies {

    public initilizeSupplies() {
    }
  }
}
