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
public class numeroMajor {

   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;

        System.out.println(" Introduce un nuemro cuajao: ");
        a = in.nextInt();
        System.out.println(" Introduce el segundo nuemro cuajao: ");
        b = in.nextInt();
        System.out.println(" Introduce el tercer nuemro cuajao: ");
        c = in.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println("El numero más grande es: " + a);
            } else {
                System.out.println("EL numero mas grande es: " + c);
            }
        } else if (a < b) {
            if (b > c) {
                System.out.println("EL numero mas grande es: " + b);
            } else {
                System.out.println("EL numero mas grande es: " + c);
            }
        }
    }
}
