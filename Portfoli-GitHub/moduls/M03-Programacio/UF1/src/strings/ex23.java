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
public class ex23 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String cadena;
        int i = 0, cont = 0;
        boolean espacio = true;

        System.out.println("Escribe una cadena");
        cadena = in.nextLine();
        for (i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == ' ') {
                System.out.println("");
            } else {
                System.out.print(cadena.charAt(i));
            }
        }
    }
}