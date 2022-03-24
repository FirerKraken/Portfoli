/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author bhugo
 */
public class ex5 {

    public static void main(String[] args) {
        /*Programa que mostra la suma dels 100 primers números naturals (1,2,...100*/
        
        int contador = 0, suma = 0;
        
        for (contador = 0; contador <= 100 ; contador++){
            suma = suma + contador;
            System.out.println(suma);
        }
    }
}
