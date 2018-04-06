/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.control;

import byui.cit260.oregontrail.model.Game;
import byui.cit260.oregontrail.model.Order;
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
        if (supplyItem == "money") {
            Supplies supplies = new Supplies();
            supplies.setMoney(supplies.getMoney() + quantity);
        } else if (supplyItem == "wagonWheel") {
            Supplies supplies = new Supplies();
            supplies.setWagonWheel(supplies.getWagonWheel() + quantity);
        } else if (supplyItem == "wagonAxel") {
            Supplies supplies = new Supplies();
            supplies.setWagonAxel(supplies.getWagonAxel() + quantity);
        } else if (supplyItem == "wagonTonuge") {
            Supplies supplies = new Supplies();
            supplies.setWagonTonuge(supplies.getWagonTonuge() + quantity);
        } else if (supplyItem == "ammunition") {
            Supplies supplies = new Supplies();
            supplies.setAmmunition(supplies.getAmmunition() + quantity);
        } else if (supplyItem == "clothing") {
            Supplies supplies = new Supplies();
            supplies.setClothing(supplies.getClothing() + quantity);
        } else if (supplyItem == "oxen") {
            Supplies supplies = new Supplies();
            supplies.setOxen(supplies.getOxen() + quantity);
        } else if (supplyItem == "food") {
            Supplies supplies = new Supplies();
            supplies.setFood(supplies.getFood() + quantity);
        } else {
            throw new GameControlException("ERROR: addToSupplies");
        }
    }

    public static void removeFromSupplies(String supplyItem, int quantity) throws GameControlException {
        if (supplyItem == "money") {
            Supplies supplies = new Supplies();
            supplies.setMoney(supplies.getMoney() - quantity);
        } else if (supplyItem == "wagonWheel") {
            Supplies supplies = new Supplies();
            supplies.setWagonWheel(supplies.getWagonWheel() - quantity);
        } else if (supplyItem == "wagonAxel") {
            Supplies supplies = new Supplies();
            supplies.setWagonAxel(supplies.getWagonAxel() - quantity);
        } else if (supplyItem == "wagonTonuge") {
            Supplies supplies = new Supplies();
            supplies.setWagonTonuge(supplies.getWagonTonuge() - quantity);
        } else if (supplyItem == "ammunition") {
            Supplies supplies = new Supplies();
            supplies.setAmmunition(supplies.getAmmunition() - quantity);
        } else if (supplyItem == "clothing") {
            Supplies supplies = new Supplies();
            supplies.setClothing(supplies.getClothing() - quantity);
        } else if (supplyItem == "oxen") {
            Supplies supplies = new Supplies();
            supplies.setOxen(supplies.getOxen() - quantity);
        } else if (supplyItem == "food") {
            Supplies supplies = new Supplies();
            supplies.setFood(supplies.getFood() - quantity);
        } else {
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
