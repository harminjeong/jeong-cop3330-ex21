/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Harmin Jeong
 */
package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String month = " ";
        System.out.print("Please enter the number of the month: ");
        String userInput = in.nextLine();
        int num = Integer.parseInt(userInput);

        switch(num){
            case 1:
                month = month.replaceAll(" ", "January");
                break;
            case 2:
                month = month.replaceAll(" ", "February");
                break;
            case 3:
                month = month.replaceAll(" ", "March");
                break;
            case 4:
                month = month.replaceAll(" ", "April");
                break;
            case 5:
                month = month.replaceAll(" ", "May");
                break;
            case 6:
                month = month.replaceAll(" ", "June");
                break;
            case 7:
                month = month.replaceAll(" ", "July");
                break;
            case 8:
                month = month.replaceAll(" ", "August");
                break;
            case 9:
                month = month.replaceAll(" ", "September");
                break;
            case 10:
                month = month.replaceAll(" ", "October");
                break;
            case 11:
                month = month.replaceAll(" ", "November");
                break;
            case 12:
                month = month.replaceAll(" ", "December");
                break;
            default:System.out.print("Error");
                System.exit(0);

        }
        String output = "The name of the month is " + month + ".";
        System.out.print(output);
    }
}
