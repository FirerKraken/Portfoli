/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcions3;

import java.util.Scanner;

/**
 *
 * @author bhugo
 */
public class ex2_TaulesMultiplicar {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0, cont = 1, taula = 0, taulaInicial = 0, taulaFinal = 0;

        System.out.println("Quantes taules de multiplicar vols mostrar?");
        num = in.nextInt();

        //  muntarLiniaTaulaMultiplicar(taula,num);
        //  muntarLiniaPantalla(taulaInicial, taulaFinal,num);
        mostrarBlocPantalla(taulaInicial, taulaFinal, num);

    }
    // Mostra un bloc de taules per pantalla des de taulaInicial fins taulaFinal.
    static void mostrarBlocPantalla(int taulaInicial, int taulaFinal, int num) {
        String fila1 = "";
        taulaInicial = 1;
        taulaFinal = 0;
        int cont = 1, guardaNum = 0, resultat = 0;

        for (int i = 0; ((taulaInicial <= num) && (cont <= 10)); i++) {
            fila1 = "";
            resultat = taulaInicial * cont;
            if ((taulaFinal == 0) && (resultat < 10)) {
                fila1 += taulaInicial + " x  " + cont + " =  " + resultat;
            } else if ((taulaFinal == 0) && (cont == 10) && (resultat < 100)) {
                fila1 += taulaInicial + " x " + cont + " = " + resultat;
            } else if ((taulaFinal == 0) && (cont == 10) && (resultat >= 100)) {
                fila1 += taulaInicial + " x " + cont + " =" + resultat;
            } else if ((taulaFinal == 0) && (resultat >= 10) && (resultat < 100)) {
                fila1 += taulaInicial + " x  " + cont + " = " + resultat;
            } else if ((taulaFinal == 0) &&(resultat >= 100) && (resultat <1000) && (cont==10)) {
                fila1 += taulaInicial + " x " + cont + " =" + resultat;
            } else if ((taulaFinal == 0) && (resultat >= 100) && (resultat < 1000)) {
                fila1 += taulaInicial + " x  " + cont + " =" + resultat;
            } else if (resultat < 10) {
                fila1 += "      " + taulaInicial + " x  " + cont + " =  " + resultat;
            } else if ((resultat >= 10) && (resultat <100) && (cont < 10)) {
                fila1 += "      " + taulaInicial + " x  " + cont + " = " + resultat;
            } else if ((resultat >= 100) && (resultat <1000)) {
                fila1 += "      " + taulaInicial + " x " + cont + " =" + resultat;
            } else if ((resultat >= 100) && (resultat <1000) && (cont==10)) {
                fila1 += "      " + taulaInicial + " x " + cont + " =" + resultat;
            } else if (cont == 10) {
                fila1 += "      " + taulaInicial + " x " + cont + " = " + resultat;
            }
            taulaInicial++;
            taulaFinal++;

            System.out.print(fila1);

            if ((taulaFinal == 4) && (cont != 10)) {
                System.out.println("");
                cont++;
                guardaNum = taulaInicial;
                if (taulaInicial <= 4) {
                    taulaInicial = 1;
                } else if (taulaInicial > 4) {
                    taulaInicial = taulaInicial - 4;
                }
                taulaFinal = 0;

            }
            if (taulaInicial == num + 1) {
                System.out.println("");
                cont++;
                guardaNum = taulaInicial;
                ;
                if (taulaInicial <= 4) {
                    taulaInicial = 1;
                } else if (taulaInicial > 4) {

                    taulaInicial = taulaInicial - taulaFinal;
                }
                taulaFinal = 0;
            }

            if ((taulaFinal == 4) && (cont == 10)) {
                System.out.println("");
                System.out.println("");
                cont = 1;
                taulaInicial = guardaNum;
                taulaFinal = 0;
            }

        }
    }
}
