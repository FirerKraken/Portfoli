/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2UF1HugoBarrera;

import java.util.Scanner;

/**
 *
 * @author bhugo
 */
public class ex1HugoBarrera {

    /*Exercici 1. 4p

      En un tauler de joc de taula de 8 x 8 caselles hi ha situades aleatòriament 5  'X' (Pots col.locar-les directament per codi) i volem 
      col.locar 4 fitxes més amb la condició que no estiguin en contacte amb les vores ni en contacte amb cap fitxa ja existent. 

      El joc consisteix en dir posicions i que el sistema et digui si es pot col.locar o no. Disposes de 10 intents

      Ha d'indicar si ho has aconseguit i el nombre d'intents , o si no ho has aconseguit*/
    public static final int files = 8;
    public static final int columnes = 8;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[][] joc = new String[files][columnes];
        joc[0][0] = "x";
        joc[0][6] = "x";
        joc[2][2] = "x";
        joc[4][0] = "x";
        joc[7][1] = "x";

        int cordenadaI = 0, cordenadaJ = 0, contFallos = 0, contPuestos = 0;
        boolean sortir = false;

        while (contPuestos < 4 && sortir == false) {
            
                System.out.println("Intro la la fila y la columna en la que vols introduir la x ");
                System.out.println("Files:");
                cordenadaI = in.nextInt();
                System.out.println("Columnes:");
                cordenadaJ = in.nextInt();
                
                if ((cordenadaJ == 0)) {
                    if (((joc[cordenadaI][cordenadaJ + 1] == "x") || (joc[cordenadaI][cordenadaJ] == "x"))) {
                        contFallos++;
                        System.out.println("Has fallat, torna a intentar-ho");
                    } else {
                        System.out.println("Has posat una x a les cordenades, i: " + cordenadaI + " j: " + cordenadaJ);
                        joc[cordenadaI][cordenadaJ] = "x";
                        contPuestos++;
                    }
                } else if (((joc[cordenadaI][cordenadaJ - 1] == "x") || (joc[cordenadaI][cordenadaJ + 1] == "x") || (joc[cordenadaI][cordenadaJ] == "x"))) {
                    contFallos++;
                    System.out.println("Has fallat, torna a intentar-ho");
                } else {
                    System.out.println("Has posat una x a les cordenades, i: " + cordenadaI + " j: " + cordenadaJ);
                    joc[cordenadaI][cordenadaJ] = "x";
                    contPuestos++;
                }
                if (contFallos >= 10) {
                    
                    sortir = true;
                }
            
        }
        if (contPuestos == 4) {
            System.out.println("Enorabona has conseguit superar el joc.");
        } else {
            System.out.println("No has pogut superar el joc.");
        }
        System.out.println("Has fallat un total de: " + contFallos + " vegades.");

    }
}
