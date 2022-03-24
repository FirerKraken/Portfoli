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
public class ex1Calculadora {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Scanner src = new Scanner(System.in);

        int num1 = 0, num2 = 0, resultat = 0;
        String suma = "suma", divisio = "divisió", multiplicacio = "multiplicació", resta = "resta", operacio = "";
        boolean sortir = false;

        System.out.println("Escribe un numero");
        num1 = in.nextInt();
        System.out.println("Escribe otro numero");
        num2 = in.nextInt();

        while (sortir == false) {
            System.out.println("Que operacion deseas realizar");
            operacio = src.nextLine();

            if (operacio.equalsIgnoreCase(suma)) {
                resultat = calculaSuma(num1, num2);
                sortir = true;
            } else if (operacio.equalsIgnoreCase(resta)) {
                resultat = calculaResta(num1, num2);
                sortir = true;
            } else if ((operacio.equalsIgnoreCase(multiplicacio)) || (operacio.equalsIgnoreCase("multiplicacio"))) {
                resultat = calculaMultiplicacio(num1, num2);
                sortir = true;
            } else if ((operacio.equalsIgnoreCase(divisio)) || (operacio.equalsIgnoreCase("divisio"))) {
                resultat = calculaDivisio(num1, num2);
                sortir = true;
            } else {
                System.out.println("Torna a intentar-ho");
            }
        }

        System.out.println("Has escollit fer una: " + operacio + "asi que el teu resultat a estat:" + resultat);

    }

    public static int calculaSuma(int num1, int num2) {

        return num1 + num2;

    }

    public static int calculaResta(int num1, int num2) {

        return num1 - num2;

    }

    public static int calculaDivisio(int num1, int num2) {
        return num1 / num2;

    }

    public static int calculaMultiplicacio(int num1, int num2) {

        return num1 * num2;

    }
}
