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
public class ejemploArray2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] mitjana = new int[10];

        intro(mitjana);
        suma(mitjana);
    }

    public static void intro(int[] notes) {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < notes.length; i++) {

            if (i == 0) {
                System.out.println("Escribe un numero:");
                notes[i] = in.nextInt();
            } else {
                System.out.println("Escribe otro numero:");
                notes[i] = in.nextInt();
            }
        }
    }
    public static void suma(int[] notes){
        int sumaPar = 0, sumaImpar = 0;
        for (int i = 0; i < notes.length; i++) {

            if (notes[i] % 2 == 0) {
                sumaPar += notes[i];
            } else {
                sumaImpar += notes[i];
            }
        }
        mostra(sumaPar, sumaImpar);
    
    }
    public static void mostra( int sumPar, int sumImpar){
        System.out.println("La suma de los numeros que ocupan posiciones par es: " + sumPar);
        System.out.println("La suma de los numeros que ocupan posiciones impar es: " + sumImpar);
    }
}