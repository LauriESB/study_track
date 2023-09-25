/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.courseex04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author lwuc
 */
public class CourseEX04 {

    public static void main(String[] args) {
       // Fazer um programa para ler quatro valores inteiros A, B, C e D. 
      // A seguir, calcule e mostre a diferença do produto de A e B pelo 
     // produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
     
     Locale.setDefault(Locale.US);
     Scanner sc = new Scanner(System.in);
     
     int A, B, C, D, diferenca;
     
     System.out.println("Digite o primeiro valor");
     A = sc.nextInt();
     System.out.println("Digite o segundo valor");
     B = sc.nextInt();
     System.out.println("Digite o terceiro valor");
     C = sc.nextInt();
     System.out.println("Digite o quarto valor");
     D = sc.nextInt();
     
     diferenca = (A * B) - (C * D);
     
     System.out.printf("DIFERENÇA = %d", diferenca);
    }
}
