/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifexercices;

import java.util.Scanner;

/**
 *
 * @author bhugo
 */
public class exercice7 {
   /* Write a program that reads a number and says if it is multiple of two, three, of both or of none of them. */ 
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float n1;

        System.out.println(" Introduce un nuemro cuajao: ");
        n1 = in.nextFloat();

        if  ( ( n1 % 2 == 0 ) && ( n1 %3 == 0 ) ){
         System.out.println( n1 + " es multiplo de 2 y 3");
        } else if ( n1 % 2 == 0 ) {
         System.out.println( n1 + " es multiplo de 2");
        } else if ( n1 % 3 == 0 ){
         System.out.println( n1 + " es multiplo de 3");
        }else {
         System.out.println( n1 + " no es muliplo ni de 2 ni de 3");
        }


    }
}
