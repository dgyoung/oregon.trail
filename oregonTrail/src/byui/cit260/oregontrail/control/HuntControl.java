package byui.cit260.oregontrail.control;

import byui.cit260.oregontrail.model.HuntingScene;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class HuntControl {
    public static int hunt() throws InterruptedException {
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
        return meat;
    }

    public static int getInput(String word, long time, long delay) {
        Scanner keyboard = new Scanner(System.in);
        String input = null;
        input = keyboard.nextLine().trim();
        //input = this.keyboard.readLine();
        if (input.toUpperCase() == word && (time + delay) > System.currentTimeMillis()) {
            System.out.print("Hit\n");
            return 25;
        } else {
            System.out.print("Miss\n");
            return 0;
        }

    }
}
