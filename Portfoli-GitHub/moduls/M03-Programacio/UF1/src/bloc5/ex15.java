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
public class ex15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
        int [] array = new int[20];
        int i = 0; 
        for ( int j = 0; j < array.length; i++){
            if (i %2 == 0) {
                array[j] = i;
                j++;
                System.out.println(i);
            }
        }
        System.out.println(array);
    }
}
