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
public class exercicie4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1;
        System.out.println("Intro primer número");
        n1 = in.nextInt();

        if (n1 % 2 == 0) {
            System.out.println( n1 + " es par cuajao");
        } else {
            System.out.println( n1 +  " es impar bobo o que");
        }

    }
}
