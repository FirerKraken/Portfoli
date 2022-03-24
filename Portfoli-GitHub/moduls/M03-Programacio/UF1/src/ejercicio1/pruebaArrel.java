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
public class pruebaArrel {
           public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float n1, resultat;
        
        System.out.println("bobo o que");
        n1 = in.nextFloat();
        resultat = (float) Math.sqrt(n1);
        System.out.printf("Resultat = %.2f", resultat);
        
    }
}
