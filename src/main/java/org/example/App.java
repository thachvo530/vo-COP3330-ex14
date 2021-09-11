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

        System.out.print("What is the order amount? ");
        Scanner amount = new Scanner(System.in);
        double amount1 = amount.nextDouble();

        System.out.print("What is the State? ");
        Scanner state = new Scanner(System.in);
        String state1 = state.next();

        if (state1.equals(WI)) {

            double tax = 0.055 * amount1;
            double total = amount1 + tax;

            System.out.print("The subtotal is $" + df.format(amount1) + ".\nThe tax is $" + df.format(tax) + ".\nThe total is $" + df.format(total) + ".");

        }

        if (!state1.equals(WI)) {

            System.out.print("The total is $" + df.format(amount1) + ".");

        }
    }
}
