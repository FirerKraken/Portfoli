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
public class ex16 {

    /*  Programa que llegeixi una frase per teclat i a continuació la mostra per pantalla a l’inrevés */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String frase;

        System.out.println("Escribeme una frase");
        frase = in.nextLine();

        for (int i = frase.length() - 1; i >= 0; i--) {
            System.out.print(frase.charAt(i));
        }
        System.out.println("");
    }
}
