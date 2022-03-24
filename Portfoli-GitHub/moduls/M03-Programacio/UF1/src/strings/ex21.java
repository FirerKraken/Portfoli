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
public class ex21 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String palabra, reves = "";
        System.out.println("Escribe una palabra");
        palabra = in.nextLine();

        for (int i = palabra.length() - 1; i >= 0; i--) {

            reves = reves + palabra.charAt(i);
        }
        System.out.println(reves);
            
        palabra = palabra.replace(" ", "");
        reves = reves.replace(" ", "");
        if (palabra.equals(reves)) {
            System.out.println("Es palindrimo");
        } else {
            System.out.println("No es palindrimo");
        }
    }
}
