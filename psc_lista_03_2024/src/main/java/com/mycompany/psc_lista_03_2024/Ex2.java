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
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        int cliente,nota,troco;
        float suco,doces,salgadinhos,refrigerante;
        
        
        
        System.out.println("Compra automatica");
        System.out.println("Suco = 1");
        System.out.println("refrigerante = 2");
        System.out.println("doces = 3");
        System.out.println("salgadinhos = 4");
         System.out.println("Qual item?");
        cliente =input.nextInt();
        
        suco = (float) 4.00;
        refrigerante = (float) 5.00;
        doces = (float) 2.00;
        salgadinhos = (float)4.00;
        
        switch(cliente){
        case 1 -> System.out.println("O valor a ser pago e "+suco);
        
        case 2 -> System.out.println("O valor a ser pago e "+refrigerante);
        
        case 3 -> System.out.println("O valor a ser pago e "+doces);
        
        case 4 -> System.out.println("O valor a ser pago e "+salgadinhos);
        
        default -> System.out.println("invalido");
        
                
        
    }
        
         System.out.println("Qual o valor da nota?");
        nota = input.nextInt();
        troco = (int)nota-cliente;
        
        if(nota>=cliente)
        
        switch(nota){
        case 50 -> System.out.println("O valor a seu troco e "+troco);
        
        case 20 -> System.out.print("O valor a seu troco e "+troco);
        
        case 10 -> System.out.println("O valor a seu troco e "+troco);
        
        case 5 -> System.out.println("O valor a seu troco e "+troco);
        
        case 2 -> System.out.println("O valor a seu troco e "+troco);
        
        case 1 -> System.out.println("O valor a seu troco e "+troco);
        
        default -> System.out.println("invalido");
        }
   
        else
            System.out.println("valor invalido" );
        
        System.out.println("nota 50 = "+(troco/50));
        System.out.println("nota 20 = "+((troco%50)/20));
        System.out.println("nota 10 = "+((troco%50)%20)/10);        
        System.out.println("nota 5 = "+(((troco%50)%20)%10)/5);    
        System.out.println("nota 2 = "+((((troco%50)%20)%10)%5)/2);
        System.out.println("nota 1 = "+(((((troco%50)%20)%10)%5)%2)/1);
        
        input.close();
    }       
        
}
