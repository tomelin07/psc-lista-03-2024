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
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int a,b,c;
         double raiz,delta,x1,x2,x;
         
         System.out.println("Equação segundo grau");
         System.out.println("Ax²+Bx+C=0");
         System.out.println("Qual o valor de A?");
         a=input.nextInt();
         
         System.out.println("Qual o valor de B?");
         b=input.nextInt();
         
         System.out.println("Qual o valor de C?");
         c=input.nextInt();
         
         delta=(double)((b*b)-(4*a*c));
         
         raiz=Math.sqrt(delta);
         
         x1=(double)(-b+raiz)/(2*a);
         
         x2=(double)(-b-raiz)/(2*a);
           
             if((a==0)&&(b==0)&&(c!=0)){ 
            System.out.println("Coeficientes informados incorretamente.");
       
             } else if ((a==0)&&(b!=0)) {    
            System.out.println("Equacao de primeiro grau");
            x=(double)((-c-b)*(-1));
            System.out.println("Resultado "+x);     
                
             }else if(delta<0){     
            System.out.println("Equacao nao possui raiz");
            
             }else if(delta==0){    
             System.out.println("Equacao possui duas raizes iguais");
             System.out.println("O resultado e : "+x1+ " e "+x2);
        
             }else if(delta>0){
             System.out.println("Equacao possui duas raizes diferentes");
             System.out.println("O resultado e : "+x1+ " e "+x2);
    }
             input.close();
    }   
}
