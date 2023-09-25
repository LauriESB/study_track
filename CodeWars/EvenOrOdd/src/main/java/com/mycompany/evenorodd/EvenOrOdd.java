/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.evenorodd;
import java.util.Scanner;

/**
 *
 * @author lwuc
 */
public class EvenOrOdd {
    public static String even_or_odd(int n1) {
        //Place code here
        if (n1 % 2 == 0){
            return "Even";
        } 
        else{
            return "Odd";
        }     
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Type an integer number:");
        int n1 = sc.nextInt();
        String result = even_or_odd(n1);
        System.out.println(result);
        sc.close();
    }
}