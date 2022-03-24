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
public class sumarnums {
    public static void main(String[] args) {
             Scanner in = new Scanner(System.in);
     int n1,n2,suma;
     System.out.println("Intro primer número");
     n1 = in.nextInt();
     
     System.out.println("Intro sgundo numero");
     n2=in.nextInt();
     suma = n1 + n2;
     System.out.println("la suma és " + suma);
    }
}
