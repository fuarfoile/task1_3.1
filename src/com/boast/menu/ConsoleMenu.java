package com.boast.menu;

import java.util.Arrays;
import java.util.Scanner;
import com.boast.buyer.*;

/**
 * Created by Bondarenko Oleh on 24.07.2017.
 */

public class ConsoleMenu implements MenuInterface {

    public ConsoleMenu() {
        help();
    }

    public boolean processCommand(Buyer[] buyers, String command) {

        if(command.equals("help")) {
            help();
            return true;
        }

        if(command.equals("showAll")) {
            showAll(buyers);
            return true;
        }

        if(command.equals("showSurnamesStartFrom")) {
            Scanner in = new Scanner(System.in);
            System.out.print("Start from: ");
            showSurnamesStartFrom(buyers, in.nextLine());
            return true;
        }

        if(command.equals("showCardsFromDiapason")) {
            Scanner in = new Scanner(System.in);
            System.out.print("From: ");
            long start = in.nextLong();
            System.out.print("To: ");
            long end = in.nextLong();
            showCardsFromDiapason(buyers, start, end);
            return true;
        }

        if(command.equals("sortAllByAddress")) {
            sortByAddress(buyers);
            System.out.println("Sorting complete");
            return true;
        }

        if(command.equals("exit")) {
            return false;
        }

        System.out.println("Unidentified command");
        return true;
    }

    private void help() {
        System.out.println("Menu Commands:");
        System.out.println("showAll");
        System.out.println("showSurnamesStartFrom");
        System.out.println("showCardsFromDiapason");
        System.out.println("sortAllByAddress");
        System.out.println("exit");
    }

    public void showAll(Buyer[] buyers) {
        for (Buyer buyer : buyers) {
            System.out.println(buyer);
        }
    }

    public void showSurnamesStartFrom(Buyer[] buyers, String start) {
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

    public void showCardsFromDiapason(Buyer[] buyers, long start, long end) {
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

    public void sortByAddress(Buyer[] buyers){
        Arrays.sort(buyers, new BuyerAddressComparator());
    }
}