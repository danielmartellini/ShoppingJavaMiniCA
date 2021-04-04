/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopping;

import java.util.Scanner;
import products.*;

/**
 *
 * @author Ken
 */
public class Shopping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ShoppingBag myBag = new ShoppingBag(); //this is myBag. I can buy things to put in it

        int amount = 1;
        int code = 0;
        double total = 0;
        boolean exit = false;
        System.out.println("Welcome to the shop");
        System.out.println("What are you looking for today?");

        while (!exit) {

            System.out.println("[1] Check the refrigerated items:");
            System.out.println("[2] Check the fresh produce:");
            System.out.println("[3] Check the Butcher's");
            System.out.println("[4] Exit Shop");
            code = input.nextInt();

            switch (code) {
                case 1: {
                    while (code != 4) {
                        System.out.println("[1] buy Butter");
                        System.out.println("[2] buy Milk");
                        System.out.println("[3] buy Cheese");
                        System.out.println("[4] Exit fridge");
                        code = input.nextInt();
                        switch (code) {
                            case 1:
                                System.out.println("How many packs of 250 grams of butter would you like?");
                                amount = input.nextInt();
                                ChilledGoods butter = new Butter();
                                butter.setNumItems(amount);
                                total += butter.getPrice();
                                myBag.buyItem(butter);

                                break;
                            case 2:
                                System.out.println("How many bottles of 1 liter of Milk would you like?");
                                amount = input.nextInt();
                                ChilledGoods milk = new Milk();
                                milk.setNumItems(amount);
                                total += milk.getPrice();
                                myBag.buyItem(milk);
                                break;
                            case 3:
                                System.out.println("How many packs of 300 grams of Cheese would you like?");
                                amount = input.nextInt();
                                ChilledGoods cheese = new Cheese();
                                cheese.setNumItems(amount);
                                total += cheese.getPrice();
                                myBag.buyItem(cheese);

                                break;

                        }
                    }

                    break;
                }

                case 2: {
                    while (code != 4) {
                        System.out.println("[1] buy Carrots");
                        System.out.println("[2] buy Potatos");
                        System.out.println("[3] buy Spinach");
                        System.out.println("[4] Exit produce area");
                        code = input.nextInt();
                        switch (code) {
                            case 1:
                                System.out.println("How many packs of 6 Carrots would you like?");
                                amount = input.nextInt();
                                Produce carrots = new Carrots();
                                carrots.setNumItems(amount);
                                total += carrots.getPrice();
                                myBag.buyItem(carrots);

                                break;
                            case 2:
                                System.out.println("How many packs of 1 kg of potatos would you like?");
                                amount = input.nextInt();
                                Produce potatos = new Potatos();
                                potatos.setNumItems(amount);
                                total += potatos.getPrice();
                                myBag.buyItem(potatos);
                                break;
                            case 3:
                                System.out.println("How many packs of 300g of Spinach would you like?");
                                amount = input.nextInt();
                                Produce spinach = new Spinach();
                                spinach.setNumItems(amount);
                                total += spinach.getPrice();
                                myBag.buyItem(spinach);

                                break;

                        }
                    }
                }

                break;

                case 3: {
                    while (code != 4) {
                        System.out.println("[1] buy Beef");
                        System.out.println("[2] buy Chicken");
                        System.out.println("[3] buy Pork");
                        System.out.println("[4] Exit Butcher's");
                        code = input.nextInt();
                        switch (code) {
                            case 1:
                                System.out.println("How many packs of 1/2 kg of Beef would you like?");
                                amount = input.nextInt();
                                Butchers beef = new Beef();
                                beef.setNumItems(amount);
                                total += beef.getPrice();
                                myBag.buyItem(beef);
                                

                                break;
                            case 2:
                                System.out.println("How many packs of 1 kg of Chicken would you like?");
                                amount = input.nextInt();
                                Butchers chicken = new Chicken();
                                chicken.setNumItems(amount);
                                total += chicken.getPrice();
                                myBag.buyItem(chicken);

                                break;
                            case 3:
                                System.out.println("How many packs of 800 grams of Pork would you like?");
                                amount = input.nextInt();
                                Butchers pork = new Pork();
                                pork.setNumItems(amount);
                                total += pork.getPrice();
                                myBag.buyItem(pork);

                                break;

                        }
                    }
                }

                break;

                case 4:
                    exit = true;

                    break;

            }
        }
        System.out.println(myBag.emptyBag());
        System.out.println("end");
        System.out.println(total);
        //myBag.myMethod();

    }
/*
    public void operator(Object item, int numItems) {
        item.setNumItems(numItems);
        total += pork.getPrice();
        myBag.buyItem(item);

    }

    public static double total(double price){
        return price+=price;
    }
*/

}
