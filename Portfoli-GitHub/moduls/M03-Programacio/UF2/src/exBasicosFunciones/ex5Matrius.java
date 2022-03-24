/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exBasicosFunciones;

import java.util.Scanner;

/**
 *
 * @author bhugo
 */
public class ex5Matrius {

    public static void main(String[] args) {

        int[][] matriu = new int[2][2];
        matriu[0][0] = 2;
        matriu[0][1] = 3;
        matriu[1][0] = 5;
        matriu[1][1] = 1;
        System.out.println("Mostrarem la matriu:");
        mostraMatriu(matriu);
        System.out.println("Donem valors a la matriu per pantalla i la tornem a mostrar");
        demanaMatriu(matriu);
        mostraMatriu(matriu);
        System.out.println("Agafem el maxim i el minim de la matriu i creem un matriu amb aquestes dimensions amb numeros aleatoris");
        generaMatriu(matriu);
    }

    public static void mostraMatriu(int[][] matriu) {
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.print(matriu[i][j]);
            }
            System.out.println("");
        }
    }

    public static int[][] demanaMatriu(int[][] matriu) {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.println("Intro valor de la martiu");
                matriu[i][j] = in.nextInt();
            }
        }
        return matriu;

    }

    public static int[][] generaMatriu(int[][] matriu) {

        int max = 0, min = 0;

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                if ((j == 0) && (i == 0)) {
                    max = matriu[i][j];
                    min = matriu[i][j];
                } else if (matriu[i][j] > max) {
                    max = matriu[i][j];
                } else if (matriu[i][j] < min) {
                    min = matriu[i][j];
                }
            }

        }
        System.out.println("maximo" + max + " minimo " + min);
        
        int[][] matriuNova = new int[max][min];
        
        for (int i = 0; i < matriuNova.length; i++) {
            for (int j = 0; j < matriuNova[i].length; j++) {
                
                matriuNova[i][j] =  (int) (Math.random() * (max - min) + min);
            }
            System.out.println("");
        }
        for (int i = 0; i < matriuNova.length; i++) {
            for (int j = 0; j < matriuNova[i].length; j++) {
                
                System.out.print(matriuNova[i][j]);
            }
            System.out.println("");
        }
        
        return matriuNova;
    }
}
