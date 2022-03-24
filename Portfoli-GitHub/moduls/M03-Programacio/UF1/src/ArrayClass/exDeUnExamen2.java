/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayClass;

import static ArrayClass.exDeUnExamen.alumnes;
import static ArrayClass.exDeUnExamen.notes;
import java.util.Scanner;

/**
 *
 * @author bhugo
 */
public class exDeUnExamen2 {

    /* Un ramader d'Olot te 5animals malalts i ha de fer un segument de la seva temperatura diàriament durant un mes.
        ·Indica quina és la temperatura mitjana de tots els animals al final del mes (1punt).
        ·Indica quin animal ha tingut la temperatura mitjana mes alta(1punt).
        ·Indica quin animal ha tingut la temperatura més alta i quin dia(1 punt).
        ·Indica la temperatua dels altres animals el dia que et surt a l'apartat anterior
        ·Indica, per cada animal, quant es devia la màxima i la ínima respecte de la mitjana (2 punts).
        ·Observació1. Introducció de dades amb random
        ·Observació2. Considerare que tots els mesos tenen 31 dies.
     */
    public static final int animals = 5;
    public static final int mes = 31;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] ramader = new int[animals][mes];

        //generaremos el array
        for (int i = 0; i < animals; i++) {
            for (int j = 0; j < mes; j++) {
                ramader[i][j] = (int) (Math.random() * 10) + 31;

                System.out.print(ramader[i][j] + "  ");
            }
            System.out.println("");
        }
        /*·Indica quina és la temperatura mitjana de tots els animals al final del mes (1punt).
          ·Indica quin animal ha tingut la temperatura mitjana mes alta(1punt).
          ·Indica, per cada animal, quant es desvia la màxima i la ínima respecte de la mitjana (2 punts).
          
         */
        int suma = 0, mitjanaAnimal = 0, mitjanaMax = 0, mitjanaMin = 0, animalMax = 0, animalMin = 0;
        int tMaxPosible = 40, tMinPosible = 30, desviaMax = 0, desviaMin = 0;
        for (int i = 0; i < animals; i++) {
            mitjanaAnimal = 0;
            suma = 0;
            desviaMax = 0;
            desviaMin = 0;
            for (int j = 0; j < mes; j++) {
                suma += ramader[i][j];
            }
            mitjanaAnimal = suma / 31;
            System.out.println("L'animal " + i + " ha tingut una mitjana de " + mitjanaAnimal + " de temperatura");
            if (i == 0) {
                mitjanaMax = mitjanaAnimal;
                mitjanaMin = mitjanaAnimal;
                animalMax = i;
                animalMin = i;
            }
            if (mitjanaAnimal > mitjanaMax) {
                mitjanaMax = mitjanaAnimal;
                animalMax = i;
            }
            if (mitjanaAnimal < mitjanaMin) {
                mitjanaMin = mitjanaAnimal;
                animalMin = i;
            }
            desviaMax = tMaxPosible - mitjanaAnimal;
            desviaMin = mitjanaAnimal - tMinPosible;
            System.out.println("L'animal " + i + "la temperatura mitjana se li desvia de la maxima en: " + desviaMax +"º");
            System.out.println("L'animal " + i + "la temperatura mitjana se li desvia de la maxima en: " + desviaMin +"º");
            System.out.println("");
        }
        
        System.out.println("La mitjana més alta ha estat la midel animal " + animalMax + "que ha tingut una mitjana de temperatura de: " + mitjanaMax);
        System.out.println("La mitjana més baixa ha estat la del animal " + animalMin + "que ha tingut una mitjana de temperatura de: " + mitjanaMin);

        /*·Indica quin animal ha tingut la temperatura més alta i quin dia(1 punt).*/
        int temperaturaMax = 0, diaTMaxima = 0;
        for (int i = 0; i < animals; i++) {
            temperaturaMax = 0;
            for (int j = 0; j < mes; j++) {
                if (ramader[i][j] > temperaturaMax) {
                    temperaturaMax = ramader[i][j];
                    diaTMaxima = j;
                }
            }
            System.out.println("EL dia " + diaTMaxima + " l'animal " + i + "ha tingut un pic de temperatura de: " + temperaturaMax);
            
        }

    }
}
