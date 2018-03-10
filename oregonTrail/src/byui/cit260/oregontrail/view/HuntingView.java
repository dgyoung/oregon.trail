package byui.cit260.oregontrail.view;

import byui.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.model.Player;
import java.util.Scanner;
import oregontrail.OregonTrail;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alexandra
 */
public class HuntingView extends View {

    public HuntingView() {
        super("\n***** Out Hunting *****\n"
                + "After the either POW, BANG or FIRE show on the seceen type the \n"
                + "word as fast as you can or the animal may get away.\n"
                + "To start press \"R\" for ready or \n \"Q\" to quit");
    }

    @Override
    public boolean doAction(String inputs) {
        String choice;
        choice = inputs;
        //player = savePlayer(playersName)
        Player player = GameControl.saveGame(choice);
        //IF player == null
        if (choice == null) {
            System.out.println("Plese enter a character");

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
                System.out.println("Enter a valid option");

        }
        return false;
    }

    private void hunt() throws InterruptedException {
        int count = 0;
        int meat = 0;
        do {
            long delay = (long) Math.random() * 50000111;
            int selecter = (int) Math.ceil(Math.random() * 3);
            String word = null;
            long time = 0;
            switch (selecter) {
                case 1:
                    word = "POW";
                    System.out.println(word);
                    time = System.currentTimeMillis();
                    meat += getInput(word, time, delay);
                    break;
                case 2:
                    word = "BANG";
                    System.out.println(word);
                    time = System.currentTimeMillis();
                    meat += getInput(word, time, delay);
                    break;
                case 3:
                    word = "FIRE";
                    System.out.println(word);
                    time = System.currentTimeMillis();
                    meat += getInput(word, time, delay);
                    break;
                default:
            }

            count++;
        } while (count < 10);
    }

    public int getInput(String word, long time, long delay) {
        Scanner keyboard = new Scanner(System.in);
        String input = null;
        input = keyboard.nextLine().trim().toUpperCase();
        if (input == word && (time + delay) > System.currentTimeMillis()) {
            System.out.print("Hit\n");
            return 25;
        } else {
            System.out.print("Miss\n");
            return 0;
        }

    }

    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
