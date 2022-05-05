/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exBasicosFunciones;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author bhugo
 */
public class exCalculadoraEvaluable {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int resultat = 0;
        String suma = "+", divisio = "/", multiplicacio = "x", resta = "-", operacio = "", num1 = "", num2 = "";
        boolean sortir = false;

        while (sortir == false) {

            num1 = in.nextLine();
            if (num1.equalsIgnoreCase("S")) {
                sortir = true;
            } else {
                num2 = in.nextLine();
                operacio = in.nextLine();

                if (operacio.equals(suma)) {
                    calculaSuma(num1, num2, resultat);
                } else if (operacio.equals(resta)) {
                    calculaResta(num1, num2, resultat);
                } else if (operacio.equals(multiplicacio)) {
                    calculaMultiplicacio(num1, num2, resultat);
                } else if (operacio.equals(divisio)) {
                    calculaDivisio(num1, num2, resultat);
                }
            }
        }

    }

    public static void calculaSuma(String num1, String num2, int resultat) {

        int a, b;
        a = parseInt(num1);
        b = parseInt(num2);

        resultat = a + b;
        System.out.println(num1 + " + " + num2 + " = " + resultat);

    }

    public static void calculaResta(String num1, String num2, int resultat) {

        int a, b;
        a = parseInt(num1);
        b = parseInt(num2);

        resultat = a - b;
        System.out.println(num1 + " - " + num2 + " = " + resultat);


    }

    public static void calculaDivisio(String num1, String num2, int resultat) {
        int a, b;
        a = parseInt(num1);
        b = parseInt(num2);
        if (b == 0) {
            System.out.println("No es pot dividir per 0.");
        } else {
            resultat = a / b;
            System.out.println(num1 + " / " + num2 + " = " + resultat);

        }
       
    }

    public static void calculaMultiplicacio(String num1, String num2, int resultat) {
        int a, b;
        a = parseInt(num1);
        b = parseInt(num2);

        resultat = a * b;
        System.out.println(num1 + " x " + num2 + " = " + resultat);
       

    }

}   
