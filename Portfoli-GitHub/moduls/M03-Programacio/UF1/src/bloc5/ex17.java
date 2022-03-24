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
public class ex17 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] array = {3, 1, 3, 65, 7, 2, 7, 10, 7, 29, 37, 2, 21, 72, 21, 12, 21, 23, 19, 20};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i){
                System.out.println(array[i] + " Es superior a la posicion que ocupa en la array");
            }
        }
    }
}
