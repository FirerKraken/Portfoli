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
public class ex18 {

    /*  */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String frase;

        System.out.println("Escribe una frase");

        frase = in.nextLine();

        char letra;
        System.out.println("Escribe una letra");

        letra = in.nextLine().charAt(0);

        int contA = 0;

        System.out.println("Escribe una frase");
        frase = in.nextLine();  

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra ) {
                contA++;
            }
        }

        System.out.println("La frase que has escrito tiene un total de: " + contA + " a's");

    }
}
