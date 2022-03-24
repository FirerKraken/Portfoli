/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author bhugo
 */
public class ex10 {

    /*Amb les dades del programa anterior, fes un programa que calculi la nota mitjana dels suspesos i 
la nota mitjana dels aprovats, així com la proporció de suspesos i aprovats*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cont = 0, aprovat = 0, suspes = 0, dif = 0;
        float num = 0, mitjaSuspes = 0, mitjaAprovats = 0;

        for (cont = 0; cont < 10; cont++) {
            System.out.println(" Introduce un numero");
            num = in.nextFloat();
            if ((num < 5) && (num >= 0)) {
                suspes++;
                mitjaSuspes = mitjaSuspes + num;
            } else if ((num >= 5) && (num <= 10)) {
                aprovat++;
                mitjaAprovats = mitjaAprovats + num;
            } else {
                System.out.println("Nota incorrecta");
            }
        }
        mitjaAprovats = mitjaAprovats / aprovat;
        mitjaSuspes = mitjaSuspes / suspes;
        System.out.println("La nota mitjana dels suspesos es de: " + mitjaSuspes);
        System.out.println("La nota mitjana dels aprovats es de: " + mitjaAprovats);
        
        if (suspes > aprovat){
            dif = suspes - aprovat;
            System.out.println("Hi ha " + dif + " suspesos que aprovats:(");
        } else if ( aprovat > suspes){
            dif = aprovat - suspes;
            System.out.println("Hi ha " + dif + " aprovats que suspesos.:)");
        } else {
            System.out.println("Hi ha el mateix nombre de aprovats que de suspesos");
        }
    }
}
