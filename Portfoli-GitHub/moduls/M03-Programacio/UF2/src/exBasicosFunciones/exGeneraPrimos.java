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
public class exGeneraPrimos {

    static int[] arrayPrimers;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cont = 0;
        arrayPrimers = new int[100];
        int primerNum = 2, num;

        while (cont < 100) {
            if (esNombrePrimer(primerNum)) {
                arrayPrimers[cont] = primerNum;
                cont++;
            }
            primerNum++;
        }
        num = in.nextInt();
        mostrarPrimos(num);
    }

    public static boolean esNombrePrimer(int primerNum) {
        int cont = 2;
        boolean primer = true;
        while ((primer) && (cont != primerNum)) {
            if (primerNum % cont == 0) {
                primer = false;
            }
            cont++;
        }

        return primer;
    }

    public static void mostrarPrimos(int num) {
        int cont = 0, cont2 = 0;
        for (int i = 0; i < num; i++) {
            if (i == (num - 1)) {
                System.out.print(arrayPrimers[i] + ".");
            } else if (i < num) {
                if ((cont == 9) && (cont2 == 0)) {
                    System.out.println(arrayPrimers[i] + ", ");
                    cont = 0;
                    cont2 = 1;
                } else if ((cont2 == 1) && (cont == 10)) {
                    System.out.println(arrayPrimers[i] + ", ");
                    cont = 0;
                } else {
                    System.out.print(arrayPrimers[i] + ", ");
                }
            }
            cont++;
        }
    }
}
