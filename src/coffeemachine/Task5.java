package coffeemachine;

import java.util.Scanner;
class Task5 {
    final static Scanner scanner = new Scanner(System.in);
    static int haswater = 400;
    static int hasmilk = 540;
    static int hasbeans = 120;
    static int hascups = 9;
    static int hasdlrs = 550;
    static boolean end = true;

    final static int WATER_FOR_CAPPUCCINO = 200;
    final static int MILK_FOR_CAPPUCCINO = 100;
    final static int COFFEE_BEANS_FOR_CAPPUCCINO = 12;
    final static int COST_OF_CAPPUCCINO = 6;

    final static int WATER_FOR_LATTE = 350;
    final static int MILK_FOR_LATTE = 75;
    final static int COFFEE_BEANS_FOR_LATTE = 20;
    final static int COST_OF_LATTE = 7;

    final static int WATER_FOR_ESPRESSO = 250;
    final static int COFFEE_BEANS_FOR_ESPRESSO = 16;
    final static int COST_OF_ESPRESSO = 4;

    public static void buycoffee() {
        switch (scanner.next()) {
            case "1":
                if (haswater < WATER_FOR_ESPRESSO) {
                    System.out.println("Sorry, not enough water!");
                    break;
                }
                else if (hasbeans < COFFEE_BEANS_FOR_ESPRESSO) {
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                }
                else if (hascups < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                    break;
                }
                else {
                    System.out.println("I have enough resources, making you a coffee!");
                }

                haswater = haswater - WATER_FOR_ESPRESSO;
                hasbeans = hasbeans - COFFEE_BEANS_FOR_ESPRESSO;
                hascups = hascups - 1;
                hasdlrs = hasdlrs + COST_OF_ESPRESSO;
                break;

            case "2":
                if (haswater < WATER_FOR_LATTE) {
                    System.out.println("Sorry, not enough water!");
                    break;
                }
                else if (hasmilk < MILK_FOR_LATTE) {
                    System.out.println("Sorry, not enough milk!");
                    break;
                }
                else if (hasbeans < COFFEE_BEANS_FOR_LATTE) {
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                }
                else if (hascups < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                    break;
                }
                else {
                    System.out.println("I have enough resources, making you a coffee!");
                }

                haswater = haswater - WATER_FOR_LATTE;
                hasmilk = hasmilk - MILK_FOR_LATTE;
                hasbeans = hasbeans - COFFEE_BEANS_FOR_LATTE;
                hascups = hascups - 1;
                hasdlrs = hasdlrs + COST_OF_LATTE;
                break;

            case "3":
                if (haswater < WATER_FOR_CAPPUCCINO) {
                    System.out.println("Sorry, not enough water!");
                    break;
                }
                else if (hasmilk < MILK_FOR_CAPPUCCINO) {
                    System.out.println("Sorry, not enough milk!");
                    break;
                }
                else if (hasbeans < COFFEE_BEANS_FOR_CAPPUCCINO) {
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                }
                else if (hascups < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                    break;
                }
                else {
                    System.out.println("I have enough resources, making you a coffee!");
                }

                haswater = haswater - WATER_FOR_CAPPUCCINO;
                hasmilk = hasmilk - MILK_FOR_CAPPUCCINO;
                hasbeans = hasbeans - COFFEE_BEANS_FOR_CAPPUCCINO;
                hascups = hascups - 1;
                hasdlrs = hasdlrs + COST_OF_CAPPUCCINO;
                break;

            case "back":
                return;
        }
    }

    public static void coffeemachinedata() {
        System.out.println("The coffee machine has:");
        System.out.println(haswater + " ml of water");
        System.out.println(hasmilk + " ml of milk");
        System.out.println(hasbeans + " g of coffee beans");
        System.out.println(hascups + " disposable cups");
        System.out.println(hasdlrs + "$ of money");
    }

    public static void coffeemachinefilling() {
        System.out.println("Write how many ml of water you want to add:");
        int addwater = scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        int addmilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        int addbeans = scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add:");
        int addcups = scanner.nextInt();

        haswater = haswater + addwater;
        hasmilk = hasmilk + addmilk;
        hasbeans = hasbeans + addbeans;
        hascups = hascups + addcups;
    }

    public static void takingmoney() {
        System.out.println("I gave you " + hasdlrs + "$");
        hasdlrs = 0;
    }

    public static void ending() {
        end = false;
    }

    public static void main(String[] args) {

        while (end) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            switch (scanner.next()) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    buycoffee();
                    break;
                case "fill":
                    coffeemachinefilling();
                    break;
                case "take":
                    takingmoney();
                    break;
                case "remaining":
                    coffeemachinedata();
                    break;
                case "exit":
                    ending();
                    break;
            }
        }
    }
}