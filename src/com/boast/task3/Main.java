package com.boast.task3;

import java.util.Scanner;
import com.boast.buyer.*;
import com.boast.menu.ConsoleMenu;

/**
 * Created by Bondarenko Oleh on 24.07.2017.
 */

public class Main {

    public static void main(String[] args) {

        String menuCommand;
        Scanner in = new Scanner(System.in);

        Buyer[] buyers = new Buyer[10];
        for (int i = 0; i < buyers.length; i++) {
            buyers[i] = new Buyer();
        }

        ConsoleMenu consoleMenu = new ConsoleMenu();

       do {
           menuCommand = in.nextLine();
       }  while (consoleMenu.processCommand(buyers, menuCommand));
    }
}
