/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmeOrdenacio;

import java.util.Scanner;

/**
 *
 * @author bhugo
 */
public class ex2Temperaturas {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int contVector = 0;
        
        
            num = in.nextInt();
            double[] numElements = new double[num];

            // Emplenem l'array
            generaVector(numElements, in);
            //Ordenamiento por seleccion sort, cogemos un valor i miramos las demas casillas restantes
            ordenaSelecció2(numElements, contVector);
            //Volvemos a mostrar array para cerciorarnos de los resultados
    }

    public static double[] generaVector(double[] numElements, Scanner in) {
        for (int i = 0; i < numElements.length; i++) {
            numElements[i] = in.nextDouble();
        }
        return numElements;
    }

    public static void mostraVector(double[] numElements) {
        for (int i = 0; i < numElements.length; i++) {
            System.out.print(numElements[i]);
            System.out.print(" ");
        }
        System.out.println("");
    }


    public static void ordenaSelecció2(double[] numElements, int contVector) {     
        double n;
        
        for (int i = 0; i < numElements.length - 1; i++) {
            for (int j = i + 1; j < numElements.length; j++) {
                if (numElements[i] < numElements[j]) {
                    n = numElements[j];
                    numElements[j] = numElements[i];
                    numElements[i] = n;
                }
                  contVector++;
            }
        }
        mostraVector(numElements);
        System.out.println("Total passades: " + contVector);
    }
}
    