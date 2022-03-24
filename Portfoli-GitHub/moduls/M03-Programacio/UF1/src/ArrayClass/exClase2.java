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
public class exClase2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] array2D = new int[10][10];

        for (int i = 0; i < array2D.length; i++) {
            Arrays.fill(array2D[i], 0);
            for (int j = 0; j < array2D[i].length; j++) {
                if (i + j == array2D.length - 1) {
                    array2D[i][j] = 1;
                }
                System.out.print(" " + array2D[i][j]);
            }
            System.out.println("");
        }
    }
}
