/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayClass;

import java.util.Scanner;

/**
 *
 * @author bhugo
 */
public class exDeUnExamen {

    /* Un examen consta de 3 exercicis; el primer te una puntuacio de 2 punts, el segon 3 punts i el tercer 5 punts. Fes un programa:
    
        · Que demani quant alumnat ha fet l'examen i, per cada alumne, que demani les notes dels tres exericis, cal comprovar si són correctes.
         (2pts)
        · Que calculi la nota de l'examen de l'alumne i digui si ha aprovato suspés.
        · Que en acabar mostri le següents estadistiques: mitjaes de cada exercici i d'examen, notes d'examen més baixa i més alta,
          i percentatge d'aprovats
     */
    public static final int alumnes = 5;
    public static final int notes = 3;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] examen = new int[alumnes][notes];

        //Generamos los numeros del array y los mostramos por pantalla
        for (int i = 0; i < alumnes; i++) {
            for (int j = 0; j < notes; j++) {

                if (j == 0) {
                    examen[i][j] = (int) (Math.random() * 3);
                    System.out.print(examen[i][j] + " ");
                } else if (j == 1) {
                    examen[i][j] = (int) (Math.random() * 4);
                    System.out.print(examen[i][j] + " ");
                } else if (j == 2) {
                    examen[i][j] = (int) (Math.random() * 6);
                    System.out.print(examen[i][j] + " ");
                }
            }
            System.out.println("");
        }
        //Leemos el array y vemos sumamos las notas, mitjana, nota mes alta i més baixa i percentatge d'aprobats
        int sum = 0, alumne = 0, aprobats = 0, nMesAlta = 0, nMesBaixa = 0, millorAlumne = 0, pitjorAlumne = 0;
        double  pAprobats = 0, mitjana = 0;
        for (int i = 0; i < alumnes; i++) {
            for (int j = 0; j < notes; j++) {
                sum = sum + examen[i][j];
                mitjana += sum;
            }
            alumne = i;
            if (sum < 5) {
                System.out.println("El alumne " + alumne + ", a tret un: " + sum + " a l'examen, per tant NO esta aprobat");
            } else if (sum >= 5) {
                System.out.println("El alumne " + alumne + ", a tret un: " + sum + " a l'examen, per tant SI esta aprobat");
                aprobats++;
            }
            if (i == 0) {
                nMesAlta = sum;
                nMesBaixa = sum;
            }
            if (nMesAlta < sum) {
                nMesAlta = sum;
                millorAlumne = i;
            }
            if (nMesBaixa > sum) {
                nMesBaixa = sum;
                pitjorAlumne = i;
            }

            sum = 0;
        }
        System.out.println(mitjana);
        pAprobats = (double)(aprobats * 100 / alumnes);
        mitjana  = mitjana / alumnes;
        
        System.out.println("La nota mes alta del examen ha estat la de l'alumne: " + millorAlumne + " que ha tret un: " + nMesAlta);
        System.out.println("La nota mes baixa del examen ha estat la de l'alumne: " + pitjorAlumne + " que ha tret un: " + nMesBaixa);
        System.out.println("El precentatce d'aprobats en la clase es de " + pAprobats + "%");
        System.out.println("La mitjana de les notes de la clase ha estat de: " + mitjana );
    }

}
