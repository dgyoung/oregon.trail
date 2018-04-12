package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.control.HuntControl;
import byui.cit260.oregontrail.model.Player;
import java.util.Scanner;

public class HuntingView extends View {

       public HuntingView() {
        super("\n***** Out Hunting *****\n"
                + "After POW, BANG or FIRE show on the seceen, type the \n"
                + "word as fast as you can or your prey may get away.\n"
                + "To start press \"R\" for Ready or \n \"Q\" to Quit. \n");
    }

    @Override
    public boolean doAction(String inputs) {
        String choice;
        choice = inputs.toUpperCase();
        
        Player player = GameControl.saveGame(choice);
       
        if (choice == null) {
            ErrorView.display(this.getClass().getName(),
                              "Plese enter a character");
            return false;
        }
        switch (choice) {
            case "R": {
                try {
                    hunt();
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
            break;
            default:
                ErrorView.display(this.getClass().getName(),
                                  "Enter a valid option");
        }
        return false;
    }
    public int hunt() throws InterruptedException {
        int count = 0;
        int meat = 0;
        do {
            int delay = (int) (Math.random() * 5000);
            int selecter = (int) Math.ceil(Math.random() * 3);
            String word = null;
            long time = 0;
            switch (selecter) {
                case 1:
                    word = "POW";
                    this.console.println(word);
                    time = System.currentTimeMillis();
                    meat += getInput(word, time, delay);
                    break;
                case 2:
                    word = "BANG";
                    this.console.println(word);
                    time = System.currentTimeMillis();
                    meat += getInput(word, time, delay);
                    break;
                case 3:
                    word = "FIRE";
                    this.console.println(word);
                    time = System.currentTimeMillis();
                    meat += getInput(word, time, delay);
                    break;
                default:
            }

            count++;
        } while (count < 10);
        return meat;
    }

    public int getInput(String word, long time, long delay) {
        Scanner keyboard = new Scanner(System.in);
        String input = null;
        input = keyboard.nextLine().trim().toUpperCase();
        if (input.equals(word) && (time + delay) > System.currentTimeMillis()) {
            this.console.print("Hit\n");
            return 25;
        } else {
            this.console.print("Miss\n");
            return 0;
        }

    }
    
}