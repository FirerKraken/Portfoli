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
public class ex9 {

    /*Programa que demana per teclat 40 números compresos entre 0 i 10 (són les notes d’un examen corresponents a 
        una classe de 40 alumnes). Una vegada entrades les 40 notes, el programa indicarà el número d’alumnes 
        aprovats i el número d’alumnes suspesos. A més, ha de dir quants han tret un suficient, quants un bé, 
        quants un notable i quants un excel.lent*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cont = 0, suficient = 0, be = 0, notable = 0, excel = 0, suspes = 0;
        float num = 0;

        for (cont = 0; cont <= 10; cont++) {
            System.out.println(" Introduce un numero");
            num = in.nextFloat();
            if ((num < 5) && (num >= 0)) {
                suspes++;
            } else if  ((num >= 5) && (num < 6)) {
                suficient++;
            } else if ((num >= 6) && (num < 7)) {
                be++;
            } else if ((num >= 7) && (num < 9)) {   
                notable++;
            } else if ((num >= 9) && (num <= 10)) {
                excel++;
            } else {
                System.out.println("Nota incorrecta");
                cont--;
            }
        }
        System.out.println("Hi ha un total de: " + suspes + " suspesos");
        System.out.println("Hi ha un total de: " + suficient + " aprobats amb sficients");
        System.out.println("Hi ha un total de: " + be + " aprobats amb un bé");
        System.out.println("Hi ha un total de: " + notable + " aprobats amb noables");
        System.out.println("Hi ha un total de: " + excel + " aprobats amb excel·lents");

    }
}
