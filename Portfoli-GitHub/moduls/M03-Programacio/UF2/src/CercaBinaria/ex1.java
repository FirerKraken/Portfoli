/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CercaBinaria;

import java.util.Scanner;

/**
 *
 * @author bhugo
 */
public class ex1 {

    /*if (n <= numElements[]) {
                cont++;
                i = (numElements.length - 1) / 2;
                if (n == numElements[i]) {
                    System.out.println("El teu numero es " + numElements[i] + " que es troba a la posicio" + (i + 1));
                    sortir = true;
                } else {
                    while (sortir == false) {
                        if ( n == numElements[i] ) {
                            System.out.println("El numero " + numElements[i]+ " que busques es trba a la posicio " + i);
                            sortir = true;
                        }else if (n > numElements[i]) {
                            cont++;
                            i = (numElements[numElements.length - 1] - i) / 2;
                        } else if (n < numElements[i]) {
                            cont++;
                            i = (i - numElements[0]) / 2;
                        }
                    }
                }
            }*/
    public static void main(String[] args) {

        int[] numElements = new int[10];
        // Emplenem l'array
        generaVector(numElements);
        //Mostrem el contingut de l'array
        mostraVector(numElements);
        //Buscaremos el valor que querams
        buscaValor(numElements);
        //Ordenamos el array y comprobamos los cambios
        ordenaArray(numElements);
        mostraVector(numElements);
        //Buscaremos el valor de forma binaria
        buscaBinari(numElements);
    }

    public static int[] generaVector(int[] numElements) {
        for (int i = 0; i < numElements.length; i++) {
            numElements[i] = (int) (Math.random() * 10);
        }
        return numElements;
    }

    public static void mostraVector(int[] numElements) {
        for (int i = 0; i < numElements.length; i++) {
            System.out.print(numElements[i]);
        }
        System.out.println("");
    }

    public static void buscaValor(int[] numElements) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        boolean sortir = false;
        System.out.println("Quin numero vols buscar");
        n = in.nextInt();

        for (int i = 0; sortir == false; i++) {
            if (n == numElements[i]) {
                System.out.println("El numero " + numElements[i] + " que busques, esta a la posicio:" + (i + 1));
                sortir = true;
            } else if ((n != numElements[i]) && (i == numElements.length - 1)) {
                System.out.println("No s'ha trobat el teu numero");
                sortir = true;
            }
        }

    }

    public static void ordenaArray(int[] numElements) {
        int n = 0;
        for (int i = 0; i < numElements.length; i++) {
            for (int j = 0; j < numElements.length; j++) {
                if (numElements[i] < numElements[j]) {
                    n = numElements[j];
                    numElements[j] = numElements[i];
                    numElements[i] = n;
                }
            }
        }
    }

    public static void buscaBinari(int[] numElements) {
        Scanner in = new Scanner(System.in);
        int n = 0, cont = 0, mid = (numElements[numElements.length - 1] / 2), bot = 0, top = numElements[numElements.length - 1];
        boolean sortir = false, sortirBucle = false;
        System.out.println("Quin numero vols buscar");
        n = in.nextInt();

        while (bot <= top) {
            if (n > numElements[mid]) {
                cont++;
                bot = mid + 1;
                mid = (bot + top) / 2;

            } else if (n < numElements[mid]) {
                cont++;
                top = mid - 1;
                mid = (bot + top) / 2;
            } else {
                cont++;
                System.out.println("El numero " + numElements[mid] + " que busques, esta a la posicio: " + mid);
                System.out.println("S'han necesitat un total de: " + cont + " intent/s.");
                sortir = true;
                break;
            }
        }
        if (sortir == false) {
            System.out.println("No s'ha trobat");
        }
    }

}
