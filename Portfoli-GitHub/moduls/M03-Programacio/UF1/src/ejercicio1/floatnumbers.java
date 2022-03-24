/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author bhugo
 */
public class floatnumbers {
       public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float n1, n2, div;
        System.out.println("Pon un numero que sea float cuajao");
        n1 = in.nextFloat();

        System.out.println("Otro float bb");
        n2 = in.nextFloat();
        div = n1 / n2;
        System.out.printf("la dvisió és %.2f",div);
    }
}
