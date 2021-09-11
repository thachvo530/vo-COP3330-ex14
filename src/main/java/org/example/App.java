/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Thach Vo
 */

package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String WI = "WI";
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner scan = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        double amount = scan.nextDouble();

        System.out.print("What is the state? ");
        String state = scan.next();

        if (state.equals(WI)) {

            double tax = 0.055 * amount;
            double total = amount + tax;

            System.out.print("The subtotal is $" + df.format(amount) + ".\nThe tax is $" + df.format(tax) + ".\nThe total is $" + df.format(total) + ".");

        }

        if (!state.equals(WI)) {

            System.out.print("The total is $" + df.format(amount) + ".");

        }
    }
}
