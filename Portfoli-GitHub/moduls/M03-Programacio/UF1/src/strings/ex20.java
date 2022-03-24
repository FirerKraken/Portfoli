/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author bhugo
 */
public class ex20 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1, num2, potencianum1, potencianum2;

        System.out.println("Introduce un numero");
        num1 = in.nextInt();

        System.out.println("Introduce otro numero");
        num2 = in.nextInt();

        double pot = Math.pow(num1, num2);
        System.out.println(pot);
        
        potencianum1 = 1;

        for (int i = 0; i < num2; i++) {

            potencianum1 = potencianum1 * num1;

        }
        
        System.out.println("La potencia de: " + num1 + " es igual a: " + potencianum1);

    }
}
