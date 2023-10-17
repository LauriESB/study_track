/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.courseex05;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author lwuc
 */
public class CourseEX05 {

    public static void main(String[] args) {
    // fazer um programa para ler um número inteiro e depois dizer se esse número é nagativo ou não
    
    int n1;
    boolean validInput = false;
    
    Scanner sc = new Scanner(System.in);
    
    while(!validInput){
        System.out.println("Type an integer number:");

        try
        {
            n1 = sc.nextInt();
            if (n1 < 0)
            System.out.printf("%d is a negative number", n1);
        else if (n1 > 0)
            System.out.printf("%d is a positive number", n1);
        else if (n1 == 0)
            System.out.printf("%d equals zero", n1);
        validInput = true;// exit the loop
        }
        catch(InputMismatchException e)
        {
            System.out.println("This is not a valid integer. Please, try again.");
            sc.nextLine(); // Clear the invalid input from the scanner
        }
    }
    System.exit(0);
  }
}
