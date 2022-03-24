/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author bhugo
 */
public class ex7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*Programa que demana números per teclat fins a introduir el valor zero i després treu per pantalla quants valors han estat parells.*/
        int num = 0, contpar = 0;
        
         do {
            System.out.println("introduce un numero");
            num = in.nextInt();
            if ((num % 2 == 0) && ( num != 0 )){
                contpar++;
            }
        }while (num != 0);
        System.out.println(contpar);
    }
}
