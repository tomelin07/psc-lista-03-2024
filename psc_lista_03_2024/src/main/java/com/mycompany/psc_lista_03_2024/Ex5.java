/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.psc_lista_03_2024;

import java.util.Scanner;

/**
 *
 * @author Lorena
 */
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String operacao;
        float num1,num2,res;
        
        System.out.println("Operaçoes matematicas");
        System.out.println("Numero 1");
        num1= input.nextFloat();
        System.out.println("Numero 2");
        num2= input.nextFloat();
        
        System.out.println("Qual operacao realizar?");
        operacao = input.next();
        
        switch(operacao){
        case "+" -> {
            res=num1+num2;
            System.out.println("O resultado e "+ res);
            }
        case "-" -> {
            res=num1-num2;
            System.out.println("O resultado e "+ res);
            }
        case "*" -> {
            res=num1*num2;
            System.out.println("O resultado e "+ res);
            }
        case "/" -> {
            res=num1/num2;
            System.out.println("O resultado e "+ res);
            }
        default -> System.out.println("ERRO");        
                
        }
        input.close();
        }
    }
    
