/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloc5;

import java.util.Scanner;

/**
 *
 * @author bhugo
 */
public class ex3 {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int [] array = new int[100];
        int sumar = 0;
        
         for (int i = 0; i < array.length; i++) {

            if (i == 0) {
                System.out.println("Escribe un numero:");
                array[i] = in.nextInt();
            } else {
                System.out.println("Escribe otro numero:");
                array[i] = in.nextInt();
            }
        }
         
         for (int i = 0; i < array.length; i++){
             if (i %3 == 0 ){
                 sumar = array[i] + sumar;
             }
         }
    }
}
