package coffeemachine;

import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need?");
        int cupsofcoffee = scanner.nextInt();
        int water = 200;
        int milk = 50;
        int coffeebeans = 15;

        System.out.println("For" + cupsofcoffee + "cups of coffee you will need:");
        System.out.println(water * cupsofcoffee + " ml of water");
        System.out.println(milk * cupsofcoffee + " ml of milk");
        System.out.println(coffeebeans * cupsofcoffee + " g of coffee beans");
    }
}
