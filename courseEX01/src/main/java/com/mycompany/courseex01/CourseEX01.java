/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.courseex01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author lwuc
 */
public class CourseEX01 {

    public static void main(String[] args) {
        // fazer um programa para ler as medidas de largura e comprimento de um terreno
       // retangular (em uma casa decimal) bem como o valor do metro quadrado do terreno
      // (em duas casas decimais).Mostrar o valor da área do terreno e o valor do preço
     // do terreno (ambos com duas casas decimais)
     Locale.setDefault(Locale.US);
     Scanner sc = new Scanner(System.in);
     
     double larg, comp, valM2, area, preco;
     
     System.out.println("Digite a largura do terreno");
        larg = sc.nextDouble();
     System.out.println("Digite o comprimento do terreno");
        comp = sc.nextDouble();
     System.out.println("Digite o valor do metro quadrado");
        valM2 = sc.nextDouble();
     
     area = larg * comp;
     preco = area * valM2;
    
     System.out.printf("O terreno possui uma área de %.2fm² e custa R$%.2f", area, preco);
     
    }
}
