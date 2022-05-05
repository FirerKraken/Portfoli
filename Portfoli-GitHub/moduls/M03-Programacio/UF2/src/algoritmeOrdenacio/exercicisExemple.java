/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmeOrdenacio;

/**
 *
 * @author bhugo
 */
public class exercicisExemple {

    public static void main(String[] args) {
        int[] numElements = new int[6];

        // Emplenem l'array
        generaVector(numElements);
        //Mostrem el contingut de l'array
        mostraVector(numElements);
        //Ordenamiento por seleccion sort, cogemos un valor i miramos las demas casillas restantes
        //System.out.println("Ordenem el array de menor a major");
        //ordenaSeleccio(numElements);
        //Volvemos a mostrar array para cerciorarnos de los resultados
        System.out.println("Comprovació de que hem fet els cambis correctament");
        //mostraVector(numElements);
        //Ordenacio per bombolla
        ordenaBombolla(numElements);
        //Volvemos a mostrar array para cerciorarnos de los resultados
        mostraVector(numElements);
    }

    public static int[] generaVector(int[] numElements) {
        numElements[0] = 6;
        numElements[1] = 5;
        numElements[2] = 4;
        numElements[3] = 3;
        numElements[4] = 2;
        numElements[5] = 1;

        return numElements;
    }

    public static void mostraVector(int[] numElements) {
        for (int i = 0; i < numElements.length; i++) {
            System.out.print(numElements[i]);
        }
        System.out.println("");
    }

    public static void ordenaSeleccio(int[] numElements) {

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

    public static void ordenaBombolla(int[] numElements) {
        int n = 0;
        for (int i = 0; i < numElements.length; i++) {
            for (int j = 0; j < numElements.length - i; j++) {
                if (j > 1) {
                    if (j + 1 < numElements.length) {
                        if (numElements[j + 1] < numElements[j]) {
                            n = numElements[j];
                            numElements[j] = numElements[j + 1];
                            numElements[j + 1] = n;
                        }
                        if (numElements[j - 1] > numElements[j]) {
                            n = numElements[j];
                            numElements[j] = numElements[j - 1];
                            numElements[j - 1] = n;
                        }
                    }
                } else {
                    if (j + 1 < numElements.length) {
                        if (numElements[j + 1] < numElements[j]) {
                            n = numElements[j];
                            numElements[j] = numElements[j + 1];
                            numElements[j + 1] = n;
                        }
                    }
                }
            }
        }

    }

}
