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
public class ex22 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String cadena;
        int i = 0, cont = 0;
        
        System.out.println("Ponme una frase");
        cadena = in.nextLine();
        
        
        while (i < cadena.length()){
            if (cadena.charAt(i) == '@'){
                cont++;
            }
            i++;
        }
        
        System.out.println("En esta cadena: " + cadena + " hay un total de: " + cont + "@");
    }
}
