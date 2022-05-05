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
public class BarreraCastilloHugo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] stringNoms = new String[8];
        stringNoms[0] = "Torres Hernández, Pere";
        stringNoms[1] = "Majoral Gatell, Anna";
        stringNoms[2] = "Pérez Gomis, Josep";
        stringNoms[3] = "López López, Rosa";
        stringNoms[4] = "Camps García, Ricard";
        stringNoms[5] = "Sánchez Pasqual, Carles";
        stringNoms[6] = "Mengual Sánchez, Gemma";
        stringNoms[7] = "Puig Soler, Jordi";

        ordenaBombolla(stringNoms);
        mostraLlista(stringNoms);
        cercaBinaria(stringNoms, in);
    }

    public static void ordenaBombolla(String[] stringNoms) {
        
        for (int i = 0; i < stringNoms.length - 1; ++i) {
            for (int j = 0; j < stringNoms.length - 1 - i; ++j) {
                String[] nombreSeparado = stringNoms[j].split(", ");
                String[] nombreSeparadoMas1 = stringNoms[j + 1].split(", ");
                if (nombreSeparado[1].compareTo(nombreSeparadoMas1[1]) > 0) {
                    // Intercanviem posicions
                    String aux = stringNoms[j];
                    stringNoms[j] = stringNoms[j + 1];
                    stringNoms[j + 1] = aux;
                }
            }
        }

    }
    public static void mostraLlista(String[] stringNoms) {
        for (int i = 0; i < stringNoms.length; i++) {
            System.out.println(stringNoms[i]);
        }
    }
    public static void cercaBinaria(String[] stringNoms, Scanner in) {
        int cont = 0, bot = 0, mid, top = stringNoms.length - 1;
        String nom;
        boolean sortir = false;

        nom = in.nextLine();

        while (bot <= top && sortir == false) {
            mid = (bot + top) / 2;
            String[] nombreSeparado = stringNoms[mid].split(", ");
            if (nom.equalsIgnoreCase(nombreSeparado[1])) {
                cont++;
                System.out.println("El nom " + nom + "s'ha trobat a la posició " + (mid +1) + " de la llista ordenada.");
                sortir = true;

            }
            if (nom.compareTo(nombreSeparado[1]) > 0) {
                cont++;
                bot = mid + 1;

            } else if (nom.compareTo(nombreSeparado[1]) < 0) {
                cont++;
                top = mid - 1;
            }
        }
        if (sortir == false) {
            System.out.println("El nom " + nom + " no s'ha troba a la llista.");
        }
    }
}
