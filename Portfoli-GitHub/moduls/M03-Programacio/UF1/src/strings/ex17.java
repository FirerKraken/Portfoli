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
public class ex17 {

    /* Programa que llegeixi una frase per teclat i digui quantes vegades hi apareix la vocal “a” */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String frase;
        int contA = 0;
        
        System.out.println("Escribe una frase");
        frase = in.nextLine();
        
        for (int i = 0; i < frase.length(); i++){
            if (frase.charAt(i) == 'a'){
                contA++;
            }
        }
        
        System.out.println("La frase que has escrito tiene un total de: " + contA + " a's");

        
    }
}
