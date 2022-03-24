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
public class ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int [] numeros = new int[20];
        
        for ( int i = 0; i < numeros.length; i++){
            if (i == 0) {
                System.out.println("Escribe un numero:");
                numeros[i] = in.nextInt();
            } else {
                System.out.println("Escribe otro numero:");
                numeros[i] = in.nextInt();
            }        }
    }
}
