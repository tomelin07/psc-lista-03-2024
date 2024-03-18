/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.psc_lista_03_2024;

import java.util.Scanner;

/**
 *
 * @author Lorena
 */
public class Ex1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num1,num2,num3,maior,menor;
        float media;
        
        System.out.println("Digite numero 1 :");
        num1 = input.nextInt();
        
        System.out.println("Digite numero 2 :");
         num2 = input.nextInt();
         
        System.out.println("Digite numero 3 :");
        num3 = input.nextInt();
        
        maior = Math.max(num2,Math.max(num1, num3));
        menor = Math.min(num2,Math.min(num1, num3));
        media = (num1+num2+num3)/3;
        
        System.out.println("O maior valor e :"+maior);
        System.out.println("O menor valor e :"+menor);
        System.out.println("a media dos valores e :"+media);
        
        input.close();
    }
}
