/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloc6;

import java.util.Scanner;

/**
 *
 * @author bhugo
 */
public class ex1B {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ex1A[] pelicula = new ex1A[5];
        String director = "", tipus = "", titol = "";

        for (int i = 0; i < pelicula.length; i++) {
            System.out.println("Escriu el director de la pelicula");
            director = in.nextLine();
            System.out.println("Escriu el tpius de pelicula");
            tipus = in.nextLine();
            System.out.println("Escriu el titol de la pelicula");
            titol = in.nextLine();

            pelicula[i] = new ex1A(director, tipus, titol);
        }
        System.out.println("Ara imprimirem l'array amb els seus objectes");
        imprimeixArray(pelicula);
    }

    public static void imprimeixArray(ex1A[] pelis) {

        for (int i = 0; i < pelis.length; i++) {
            System.out.println("Peli: " + i);
            pelis[i].imprimeix();
            System.out.println("");
        }

    }
}
