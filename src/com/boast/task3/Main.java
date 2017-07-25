package com.boast.task3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import com.boast.Buyer;

/**
 * Created by Bondarenko Oleh on 24.07.2017.
 */

public class Main {

    public static void main(String[] args) {

        String menuCommand = "";
        Scanner in = new Scanner(System.in);
        Buyer[] buyers = new Buyer[10];
        for (int i = 0; i < buyers.length; i++) {
            buyers[i] = new Buyer();
        }

        System.out.println("Menu Commands:");
        System.out.println("show");
        System.out.println("surnameStartFrom");
        System.out.println("getCardsFromDiapason");
        System.out.println("sortByAddress");
        System.out.println("exit");

        while (!menuCommand.equals("exit")) {
            menuCommand = in.nextLine();

            if(menuCommand.equals("show")) {
                for (Buyer buyer : buyers) {
                    System.out.println(buyer);
                }
            }

            if(menuCommand.equals("surnameStartFrom")) {
                System.out.print("Start from: ");
                String start = in.nextLine();
                boolean nonFlag = true;
                for (Buyer buyer : buyers) {
                    if(buyer.getSecondName().startsWith(start)) {
                        System.out.println(buyer);
                        nonFlag = false;
                    }
                }
                if(nonFlag) {
                    System.out.println("No matches");
                }
            }

            if(menuCommand.equals("getCardsFromDiapason")) {
                System.out.print("Diapason start: ");
                long start = in.nextLong();
                System.out.print("Diapason end: ");
                long end = in.nextLong();
                boolean nonFlag = true;
                for (Buyer buyer : buyers) {
                    if(buyer.getCreditCardNumber() >= start && buyer.getCreditCardNumber() <= end) {
                        System.out.println(buyer);
                        nonFlag = false;
                    }
                }
                if(nonFlag) {
                    System.out.println("No matches");
                }
            }

            if(menuCommand.equals("sortByAddress")) {
                Arrays.sort(buyers, new BuyerAddressComparator());
                for (Buyer buyer : buyers) {
                    System.out.println(buyer);
                }
            }
        }

    }
}

class BuyerAddressComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String address1 = ((Buyer) o1).getAddress();
        String address2 = ((Buyer) o2).getAddress();
        return address1.compareTo(address2);
    }
}