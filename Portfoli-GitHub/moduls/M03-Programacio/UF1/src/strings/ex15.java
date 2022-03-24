/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.Scanner;

/**
 *
 * @author bhugo
 */
public class ex15 {
    /* Programa que llegeixi per teclat el vostre nom i mostri per pantalla “Hola” seguit del vostre nom. Que indiqui la seva longitud i quina
    lletra ocupa la posició 3. A continuació recull un altre nom i comprova que siguin o no iguals. Indica si són o no són iguals. Finalment 
    passa el primer a majúscules i el segon a minúscules.  */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nom, nom2;

        nom = in.nextLine();

        System.out.println("Dime tu nombre");
        System.out.println("Hola " + nom);

        System.out.println("La posició 3 de el teu nom es: " + nom.charAt(3));

        System.out.println("Dime el nombre de alguien");
        nom2 = in.nextLine();

        if (nom.equalsIgnoreCase(nom2)) {
            System.out.println("El nom: " + nom + " es igual a: " + nom2);
        } else {
            System.out.println("El nom: " + nom + " no es igual a: " + nom2);
        }

        System.out.println(nom.toUpperCase());
        System.out.println(nom2.toLowerCase());

    }
}
