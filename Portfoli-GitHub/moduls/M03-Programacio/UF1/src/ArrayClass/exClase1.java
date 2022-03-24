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
public class exClase1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int [][] array2D = new int[3][3];
        int num = 1;
        
        for (int i = 0; i < array2D.length; i++){
            
            for (int j = 0; j < array2D[i].length; j++){
                
                 array2D[i][j] = num;
                    System.out.print(" " + array2D[i][j]);
                 num = num * 2;
                
            }
            System.out.println("");
        }
    }
}
