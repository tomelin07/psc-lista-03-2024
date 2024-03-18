/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.psc_lista_03_2024;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lorena
 */
public class Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int num1,num2;
        
       
        System.out.println("Sorteio");
        System.out.println("Numero 1");
        num1= input.nextInt();
        System.out.println("Numero 2");
        num2= input.nextInt();
        
        Random gerador =new Random();
      
       
       if(num1>=num2){
       System.out.println("Numero "+num1+" maior que " +num2);
       
    }else {
           System.out.println("Numero "+num2+" maior que " +num1);
       }
       
       System.out.println("O numero sorteado é"+ gerador.nextInt(10)) ;
    
      
         if(gerador.nextInt(10)%2==0){
            System.out.println("Numero par");
        }else {
            System.out.println("Numero impar ");
            
        }         
        
           input.close();    
}
}