/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifexercices;

import java.util.Scanner;

/**
 *
 * @author bhugo
 */
public class exercici15 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float nota;

        System.out.print("introducir nota: ");
        nota = in.nextFloat();

        if ((nota >= 0) && (nota < 5)) {
            System.out.println(" la nota es un supés");
        } else if ((nota >= 5) && (nota < 6)) {
            System.out.println("la nota es un suficient");
        } else if ((nota >= 6) && (nota < 7)) {
            System.out.println("la nota esun bé");
        } else if ((nota >= 7) && (nota < 9)) {
            System.out.println(" la nota es un notable");
        } else if ((nota >= 9) && (nota <= 10)) {
            System.out.println("La nota es un excel·lenr");
        } else {
            System.out.println("nota no valida");
        }
    } 
}
