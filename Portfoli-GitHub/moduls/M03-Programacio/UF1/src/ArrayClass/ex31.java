/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayClass;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author bhugo
 */
public class ex31 {

    public static final int vendedors = 4;
    public static final int producte = 7;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] array = new int[vendedors][producte];

        //Rellenamos el array con valores
        for (int i = 0; i < vendedors; i++) {
            for (int j = 0; j < producte; j++) {
                array[i][j] = (int) (Math.random() * 50);
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");

        }

        //Leemos por filas 
        int sum = 0, maxVenedor = 0, maxVendes = 0;
        for (int i = 0; i < vendedors; i++) {

            for (int j = 0; j < producte; j++) {
                sum = sum + array[i][j];
            }
            System.out.println("Venedor " + i + ": " + sum);
            if (i == 0) {
                maxVenedor = i;
                maxVendes = sum;

            } else {
                if (maxVendes < sum) {
                    maxVenedor = i;
                    maxVendes = sum;
                }
            }

            sum = 0;
        }
        System.out.println("El millor venedor es: " + maxVenedor);
        System.out.println("El maxim de vendes ha estat en: " + maxVendes);

        //Leemos por columnas
        int maxProducte = 0, maxVendesProducte = 0;
        for (int j = 0; j < producte; j++) {

            for (int i = 0; i < vendedors; i++) {
                sum = sum + array[i][j];
            }
            System.out.println("Producte " + j + ": " + sum);
            if (j == 0) {
                maxProducte = j;
                maxVendesProducte = sum;

            } else {
                if (sum > maxVendesProducte) {
                    maxProducte = j;
                    maxVendesProducte = sum;
                }
            }

            sum = 0;
        }
        System.out.println("El millor producte es: " + maxProducte);
        System.out.println("El maxim de vendes ha estat en: " + maxVendesProducte);
    }

}
