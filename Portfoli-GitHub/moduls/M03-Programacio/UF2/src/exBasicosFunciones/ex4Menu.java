/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exBasicosFunciones;

import java.util.Scanner;

/**
 *
 * @author bhugo
 */
public class ex4Menu {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Scanner strg = new Scanner(System.in);
        String eleccion = "";
        boolean sortir = false;

        while (sortir) {

            System.out.println("Que ejercicio quieres hacer: 'calculadora', 'figuras2D','figuras3D' o en su defecto 'sortir'");
            eleccion = in.nextLine();
            if (eleccion.equalsIgnoreCase("calculadora")) {

            } else if (eleccion.equalsIgnoreCase("figuras2D")) {

            } else if (eleccion.equalsIgnoreCase("figuras3D")) {
                
            } else if (eleccion.equalsIgnoreCase("sortir")) {
                sortir = true;
            } else {
                System.out.println("tas equivocat, torna a intentar-ho:");
            }

        }
    }
}
