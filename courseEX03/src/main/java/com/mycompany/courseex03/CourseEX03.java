/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.courseex03;

import java.util.Scanner;

/**
 *
 * @author lwuc
 */
public class CourseEX03 {

    public static void main(String[] args) {
      //Faça um programa para ler o valor do raio de um círculo, e depois mostrar 
     // o valor da área deste círculo com quatro casas decimais conforme exemplos
     
     Scanner sc = new Scanner(System.in);
     
     double raio, area;
     
     System.out.println("Digite o valor da área do circulo");
     raio = sc.nextDouble();
     
     area = 3.14159 * Math.pow(raio, 2);
     System.out.printf("Aárea do círculo é de %.4f", area);
    }
}
