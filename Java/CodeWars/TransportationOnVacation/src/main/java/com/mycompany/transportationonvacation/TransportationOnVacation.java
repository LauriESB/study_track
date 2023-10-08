/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.transportationonvacation;

import java.util.Scanner;

/**
 *
 * @author lwuc
 */
public class TransportationOnVacation {
       // After a hard quarter in the office you decide to get some rest on a vacation. So you will book a flight for you and your girlfriend
      // and try to leave all the mess behind you. You will need a rental car in order for you to get around in your vacation. The manager of 
     // the car rental makes you some good offers. Every day you rent the car costs $40. If you rent the car for 7 or more days, you get $50 
    // off your total. Alternatively, if you rent the car for 3 or more days, you get $20 off your total.
   // Write a code that gives out the total amount for different days(d).

public static int rentalCarCost(int rentDays) {
    // Your solution here
    if(rentDays > 0 && rentDays < 3){
        return (rentDays * 40);
    }
    else if(rentDays >= 3 && rentDays < 7){
        return (rentDays * 40) - 20;
    }
    else if(rentDays >= 7){
        return (rentDays * 40) - 50;
    }
    return 0;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Rental days:");
    int rentDays = sc.nextInt();
    int totalDays = rentalCarCost(rentDays);
    System.out.printf("For %d days the total amount is $%d", rentDays, totalDays );
    sc.close();
    }
}