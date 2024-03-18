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
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int caso;
        float raio,a,p,v;
        
        System.out.println("Qual operaçao deseja realizar?");
        System.out.println("calcular perimetro do circulo = 1");
        System.out.println("calcular area do circulo = 2");
        System.out.println("calcular volume da esfera = 3");
        caso = input.nextInt();
        
        System.out.println("Qual o raio(cm)?");
        raio = input.nextFloat();
        
        a = (float) ((raio*raio)*3.14);
        p =(float) ((2*raio)*3.14);
        v =(float) (((4/3)*3.14)*((raio*raio)*raio));
        
        switch(caso){
            case 1 -> System.out.println("O perimetro do circulo e "+p + "cm ");
            case 2 -> System.out.println("A area do circulo e "+a+" cm ");
            case 3 -> System.out.println("O volume da esfera  e "+v +" cm3 ");
            default -> System.out.println("ERRO");
        }
            input.close();
    }
    
}
