/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayClass;

import java.util.Scanner;

/**
 *
 * @author bhugo
 */
public class exClase4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] array2D = new int[4][5];

        int num = 0, suma = 0;

        for (int i = 0; i < array2D.length; i++) {

            for (int j = 0; j < array2D[i].length; j++) {
                
                if (i == 0) {
                    array2D[i][j] = num * 2;
                }
                if (i == 1) {
                    if (j == 0){
                    num = i;
                    array2D[i][j] = num;
                    }
                    else {
                        num = num * 2;
                        array2D[i][j] = num;
                    }
                    
                }
                if (i == 2) {
                    if (j == 0){
                    num = i;
                    array2D[i][j] = num;
                    }
                    else {
                        num = num * 2;
                        array2D[i][j] = num;
                    }
                }
                if (i == 3) {
                    if (j == 0){
                    num = i;
                    array2D[i][j] = num;
                    }
                    else {
                        num = num * 2;
                        array2D[i][j] = num;
                    }
                    
                }
                suma += array2D[i][j]; 
                System.out.print(array2D[i][j] + " ");
                
            }
            System.out.println("La suma de la fila " + i + " es igual a: " + suma);
            System.out.println("");
            suma  = 0;
        }
    }
}
