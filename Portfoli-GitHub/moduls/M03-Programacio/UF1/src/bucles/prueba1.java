/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author bhugo
 */
public class prueba1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valor, resultat = 1;
        System.out.println("introduce un numro");
        valor = in.nextInt();

        for (int i = valor; i >= 1; i--) {
            resultat = resultat * i;
            System.out.println(resultat);
        }
        resultat = 1;
        int r = valor;
        while( r >= 1 ){
        resultat = resultat * r;
        System.out.println(resultat);
        r--;
        }
         resultat = 1;
         int i = valor;
        do {
         resultat =resultat * i; 
         System.out.println(resultat);
         i--;
        } while ( i >= 1 );
    }
}