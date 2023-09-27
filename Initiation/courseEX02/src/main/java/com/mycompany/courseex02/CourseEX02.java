/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.courseex02;

import java.util.Scanner;

/**
 *
 * @author lwuc
 */
public class CourseEX02 {

    public static void main(String[] args) {
        // Crie um programa que leia dois valores inteiros e mostre na tela
       // o resultado da soma deles com uma mensagem explicativa
        Scanner sc = new Scanner(System.in);
        
        int n1, n2, soma;
        
        System.out.println("Digite o primeiro número");
        n1 = sc.nextInt();
        System.out.println("Digite o segundo número");
        n2 = sc.nextInt();
        
        soma = n1 + n2;
        System.out.print("SOMA = " + soma);
    }
}
