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
public class añosbisiesto {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float n1;

        System.out.println(" Introduce un nuemro cuajao: ");
        n1 = in.nextFloat();

        if (n1 % 4 == 0) {

        } else if (n1 % 100 == 0) {
            if (n1 % 400 == 0) {
                System.out.println("Es un año bisiesto UwU");
             } else {
                System.out.println("No es un año bisiesto");

            }

        } else {
            System.out.println("No es un año bisiesto");

        }

    }
}
