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
public class ex18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] array = {3, 1, 3,5,7,2,7,5,7,4,7,3,6,3,6,8,7,2,4,9,2,4,6,5,6,3,2,4,8,10};
        int aprobats = 0, suspes = 0;
        
        for (int i= 0; i < array.length; i++){
            if ((array[i] >= 5)&&(array [i] <= 10)){
            aprobats++;
            }else if ((array[i] >= 0)&&(array[i] < 5)){
            suspes ++;
            }
        }

    }
}
