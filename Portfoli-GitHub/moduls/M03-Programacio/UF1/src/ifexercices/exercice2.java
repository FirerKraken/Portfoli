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
public class exercice2 {
       public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, n2;
        System.out.println("Intro primer número");
        n1 = in.nextInt();
        System.out.println("Intro segund número");
        n2 = in.nextInt();
        if (n1 < n2) {
            System.out.println(n2 + " es més gran que " + n1);
        } else {
            System.out.println(n1 + " es més gran que " + n2);
        }

    }
}

