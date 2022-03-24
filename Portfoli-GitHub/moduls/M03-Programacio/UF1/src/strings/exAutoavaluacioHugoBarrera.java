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
public class exAutoavaluacioHugoBarrera {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String cadena = "eva Evaristo Lucia Genoveva eva Luis";
        int i;
        boolean esEva = false;

        for (i = 0; i < cadena.length(); i++) {
            if ((cadena.charAt(i) == 'e') && (cadena.charAt(i + 1) == 'v') && (cadena.charAt(i + 2) == 'a')) {

                if (i == 0) {
                    if (cadena.charAt(i + 3) == ' ') {
                        esEva = true;
                    }
                } else if (i == cadena.length() - 3) {
                    if (cadena.charAt(i - 1) == ' ') {
                        esEva = true;
                    }
                } else {
                    if ((cadena.charAt(i - 1) == ' ') && (cadena.charAt(i + 3) == ' ')) {
                        esEva = true;
                    }
                }

                if (esEva == true) {
                    cadena = cadena.substring(0, i) + "E" + cadena.substring(i + 1, cadena.length());
                    esEva = false;
                }

            }
        }
        System.out.println(cadena);

    }
}
