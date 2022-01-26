package com.mycompany.voto;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Eleicao {

    public static void main(String[] args) {
       Scanner t = new Scanner(System.in);
       System.out.print("Qual o ano de nascimento: ");  
       int nasc = t.nextInt();
         int i = 2019 - nasc;
         System.out.println("Sua idade e "+ i);
         if (i < 16 ){ //entao
            System.out.print("Nao vota");
          }else{
             if ((i >=16 && i < 18) || ( i >70)){ //entao 
                 System.out.print(" Voto OPCIONAL ");
             }else{ //entao
                 System.out.print(" Obrigatorio");
            }
        }             
    }    
}