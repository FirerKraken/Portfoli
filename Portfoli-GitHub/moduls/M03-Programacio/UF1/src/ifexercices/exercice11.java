/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifexercices;

import java.util.Scanner;

/**
 *
 * @author bhugo
 */
public class exercice11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float preu;
        
        System.out.println( " Introduce un nuemro cuajao: " );
        preu = in.nextFloat();
        
        if (preu > 10000) {
            preu = preu * 10 /100; 
        } else {
            preu = preu *5 / 100;
        }
        System.out.println( "El preu final es: " + preu );
    }
}
