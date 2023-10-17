/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.courseex06;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * this program will read two inputs and tell the user if they are multiples or not.
 * @author lwuc
 */
public class CourseEX06 {
    
    public static void main(String[] args) {
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        boolean validInput = false;
        
       
        while(!validInput)
        {
            try
            {
                System.out.println("Are these numbers multiples?");
                System.out.println("First integer number: ");
                n1 = sc.nextInt();
                System.out.println("Second integer number: ");
                n2 = sc.nextInt();
                //  multiply
                if (n2 > n1)
                {
                    if (n2 % n1 == 0)
                        System.out.println("YES!");
                    else
                        System.out.println("NO :/");
                }    

               // divide
               if (n1 > n2)
               {
                   if (n1 % n2 == 0)
                       System.out.println("YES!");
                   else
                       System.out.println("NO :/");
               }
               validInput = true;
            }
            catch (InputMismatchException e)
            {
               System.out.println("Nah. That's not an integer number. Try again.");
               sc.nextLine();
            }
        }
        System.exit(0);
    }
}
