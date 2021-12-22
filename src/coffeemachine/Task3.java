package coffeemachine;

import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        final int waterForOneCup = 200;
        final int milkForOneCup = 50;
        final int coffeebeansForOneCup = 15;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffeebeans = scanner.nextInt();

        System.out.println("Write how many cups of coffee you will need:");
        int cupsofcoffee = scanner.nextInt();

        int canCupsFromWater = water / waterForOneCup;
        int canCupsFromMilk = milk / milkForOneCup;
        int canCupsFromBeans = coffeebeans / coffeebeansForOneCup;

        int canCups = getMin(canCupsFromWater, canCupsFromMilk, canCupsFromBeans);
        int remainingcups = canCups - cupsofcoffee;

        if (cupsofcoffee == canCups) {
            System.out.println("Yes, I can make that amount of coffee");
        }
        else if (cupsofcoffee < canCups) {
            System.out.println("Yes, I can make that amount of coffee (and even " + remainingcups + " more than that)");
        }
        else if (cupsofcoffee > canCups) {
            System.out.println("No, I can make only " + canCups + " cup(s) of coffee");
        }
    }

    static int getMin(int ...values) {
        int min = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
            }
        }
        return min;
    }
}