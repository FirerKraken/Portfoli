/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosAntesExamen;

import java.util.Scanner;

/**
 *
 * @author bhugo
 */
public class practicaBurbuja {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String num;
        num = in.nextLine();
        int posicion = Integer.parseInt(num);

        String[] paisos = new String[posicion];

        for (int i = 0; i < paisos.length; i++) {
            paisos[i] = in.nextLine();
        }

        ordenaBombolla(paisos);
        System.out.println("Països ordenats:");
        mostraPaisos(paisos);
    }

    public static void mostraPaisos(String[] paisos) {
        for (int i = 0; i < paisos.length; i++) {
            System.out.println(paisos[i]);
        }
    }

    public static void ordenaBombolla(String[] paisos) {
        String pais = "";
        for (int i = 0; i < paisos.length; i++) {
            for (int j = 0; j < paisos.length - i; j++) {
                if (j > 1) {
                    if (j + 1 < paisos.length) {
                        if (paisos[j + 1].compareTo(paisos[j]) < 0) {
                            pais = paisos[j];
                            paisos[j] = paisos[j + 1];
                            paisos[j + 1] = pais;
                        }
                        if (paisos[j + 1].compareTo(paisos[j]) > 0) {
                            pais = paisos[j];
                            paisos[j] = paisos[j - 1];
                            paisos[j - 1] = pais;
                        }
                    }
                } else {
                    if (j + 1 < paisos.length) {
                        if (paisos[j + 1].compareTo(paisos[j]) < 0) {
                            pais = paisos[j];
                            paisos[j] = paisos[j + 1];
                            paisos[j + 1] = pais;
                        }
                    }
                }
            }
        }

    }
}
