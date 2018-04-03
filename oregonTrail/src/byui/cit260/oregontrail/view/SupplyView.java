package byui.cit260.oregontrail.view;

import java.io.PrintWriter;
import java.util.ArrayList;
import oregontrail.OregonTrail;
import byui.cit260.oregontrail.model.Supplies;


/*
 * @author Alexandra
 */
public class SupplyView extends View{

    public SupplyView(String message) {
        super(message);
    }

    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /*protected final PrintWriter console = OregonTrail.getOutFile();
    private static Supplies currentSupplies;
    private static String view;
    private static ArrayList<Items> items;

    public SupplyView(Supplies supplies) {
        super(createView(supplies));
    }
    
    private static String createView(Supplies supplies) {
        int i = 1;
        currentSupplies = supplies;
        items = currentSupplies.getItems();
        //sort the items list alphabetically, this is a Bubble sort algorithm that I found online 
        //I had to modify it to work with an arrayList since it was for an array of strings
        int j;
        boolean flag = true;
        Item temp;
        while (flag) {
            flag = false;
            for (j = 0; j < items.size() - 1; j++) {
                if (items.get(j).getName().compareToIgnoreCase(items.get(j + 1).getName()) > 0) {
                    temp = items.get(j);
                    items.set(j, items.get(j + 1));
                    items.set(j + 1, temp);
                    flag = true;
                }
            }
        }
        view = "\n"
                + "\n****************************************"
                + "\n                 Supplies             "
                + "\n  Name and Cost                         ";
        int size = currentSupplies.getItems().size();
        if (size == 0) {
            view += "\n\nThere are no supply items!\n";
        } else {
            for (Item item : items) {

                view += "\n" + i + ". Name:" + item.getName() + "     Cost: " + item.getCost();
                i++;
            }

        }
        view += "\nQ : Quit Supplies"
                + "\n****************************************";
        return view;
    }

    @Override
    public boolean doAction(String choice) {
        try {
            int number = Integer.parseInt(choice);

            Item item = items.get(number - 1);
            SupplyItemView itemView = new SupplyItemView(item, this.currentSupplies);
            itemView.display();
        } catch (Throwable exception) {
            ErrorView.display(this.getClass().getName(), "\nThat wasn't a valid choice!");
        }

        return false;

    }*/

}
