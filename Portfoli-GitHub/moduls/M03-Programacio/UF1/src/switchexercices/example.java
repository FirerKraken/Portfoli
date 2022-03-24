/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchexercices;

import java.util.Scanner;

/**
 *
 * @author bhugo
 */
public class example {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, n2, n3, entrada;

        System.out.println("numero 1");
        n1 = in.nextInt();

        System.out.println("numero 2");
        n2 = in.nextInt();

        System.out.println("numero 3");
        n3 = in.nextInt();

        entrada = (n1 / 1000) / (n3 / 3600);

        if (entrada < n2) {
            System.out.println("OK");
        } else if ((entrada > n2) && ( entrada < ((n2 * 20 / 100)) + n2)) {
            System.out.println("MULTA");
        } else if (entrada > (n2 * 20 / 100 )){
            System.out.println("PUNTOS");
        }
    }
}
