/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloc5;

import java.util.Scanner;

/**
 *
 * @author bhugo
 */
public class ex7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String palabra;

        boolean validar = false;
        
        char[] letras ={'q','r','e','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','ñ','z'};

        /*for (int i = 0; i < letras.length; i++) {

            if (i == 0) {
                System.out.println("Escribe una letra :");
                letras[i] = in.nextLine().charAt(0);
            } else {
                System.out.println("Escribe otra letra:");
                letras[i] = in.nextLine().charAt(0);
            }
        }*/

        System.out.println("Ahora introduce una palabra");
        palabra = in.nextLine();
        for (int i = 0; i < palabra.length(); i++) {
            for (int j = 0; j < letras.length; j++){
                 if (letras[i] == palabra.charAt(j)) {
                    validar = true;
                    j = 50000;
                } else {
                    validar = false;
                }
                 if ((validar == false) && ( j >= letras.length)){ 
                     System.out.println("No se puede escribir" + palabra);
                }
            }
         
        }
        if (validar == true) {
            System.out.println("Si se puede escribir: " + palabra);
        }
    }
}
