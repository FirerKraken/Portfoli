/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack4repaso;

import java.util.Scanner;

/**
 *
 * @author bhugo
 */
public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int i = 0, cont = 0;
        
        while ( cont <= 20){
        
            if ( i %2 != 0  ){
                System.out.println(i);
                cont ++;
        }
            i++;
        }
    }
}
