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
public class multiplicarnums {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, n2, multi;
        System.out.println("Pon un numero bobo o que");
        n1 = in.nextInt();

        System.out.println("Otro numero bb");
        n2 = in.nextInt();
        multi = n1 * n2;
        System.out.println("la suma és " + multi);
    }
}
