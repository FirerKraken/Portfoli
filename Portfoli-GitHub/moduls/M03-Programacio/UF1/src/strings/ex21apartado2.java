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
public class ex21apartado2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String palabra, reves = "", pSinEspacios = "", rSinEspacios = "";
        System.out.println("Escribe una palabra");
        palabra = in.nextLine();

        palabra = palabra.toLowerCase();

        for (int i = palabra.length() - 1; i >= 0; i--) {

            reves = reves + palabra.charAt(i);
        }
        System.out.println(reves);
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) != ' ') {
                pSinEspacios = pSinEspacios + palabra.charAt(i);
            }
        }
        for (int i = 0; i < reves.length(); i++) {
            if (reves.charAt(i) != ' ') {
                rSinEspacios = rSinEspacios + reves.charAt(i);
            }
        }
        System.out.println("rSinEspacios: " + rSinEspacios);
        System.out.println("pSinEspacios: " + pSinEspacios);
        if (pSinEspacios.equals(rSinEspacios)) {
            System.out.println("Es palindrimo");
        } else {
            System.out.println("No es palindrimo");
        }
    }
}
