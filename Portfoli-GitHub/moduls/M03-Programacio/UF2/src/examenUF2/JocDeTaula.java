/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenUF2;

import java.util.Scanner;

/**
 *
 * @author bhugo
 */
public class JocDeTaula {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        creaTauler();

        int[][] joc = creaTauler();

        int cordenadaI = 0, cordenadaJ = 0, cont = 1, contPuestos = 0;
        boolean sortir = false;

        while (contPuestos < 4 && sortir == false) {

            System.out.println("Intent: " + cont);
            System.out.println("Files:");
            cordenadaI = in.nextInt();
            System.out.println("Columnes:");
            cordenadaJ = in.nextInt();

            if (tocaVora(cordenadaJ) == true) {
                System.out.println("No és vàlida. Es una vora");
            } else if (existeixFitxa(joc, cordenadaI, cordenadaJ) == true) {
                System.out.println("No és vàlida. Ja hi ha una fitxa!");
            } else if (existeixFitxa(joc, cordenadaI, cordenadaJ) == false) {
                joc[cordenadaI][cordenadaJ] = 2;
                System.out.println("Perfecte! La posició és vàlida");
                contPuestos++;
            }
            if (cont >= 10) {

                sortir = true;
            }
            cont++;

        }
        if (contPuestos == 4) {
            System.out.println("Enhorabona! Has guanyat!");
        } else {
            System.out.println("No has pogut superar el joc...:( ");
        }
        System.out.println("El tauler");
        mostraTauler(joc);
    }

    public static int[][] creaTauler() {
        int[][] joc = new int[8][8];
        int min = 0, max = 7, cont = 0;
        while (cont < 20) {
            int i = (int) (Math.random() * (max - min) + min), j = (int) (Math.random() * (max - min) + min);
            if (joc[i][j] != 1) {
                joc[i][j] = 1;
                cont++;
            }

        }

        for (int i = 0; i < joc.length; i++) {
            for (int j = 0; j < joc[i].length; j++) {
                if (joc[i][j] < 1) {
                    joc[i][j] = 0;
                }
            }
        }

        return joc;
    }

    public static boolean tocaVora(int cordenadaJ) {
        if ((cordenadaJ == 0) || (cordenadaJ == 7)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean existeixFitxa(int[][] joc, int cordenadaI, int cordenadaJ) {
        if ((joc[cordenadaI][cordenadaJ] == 1) || (joc[cordenadaI][cordenadaJ] == 2)) {
            return true;
        } else {
            return false;
        }
    }

    public static void mostraTauler(int[][] joc) {
        for (int i = 0; i < joc.length; i++) {
            for (int j = 0; j < joc[i].length; j++) {
                System.out.print(joc[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
