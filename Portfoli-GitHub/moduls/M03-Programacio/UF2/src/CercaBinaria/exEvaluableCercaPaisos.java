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
public class exEvaluableCercaPaisos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String num;
        num = in.nextLine();
        int posicion = Integer.parseInt(num); 
        String[] paisosList = new String[posicion];
        String pais;
        
        for (int i = 0; i < paisosList.length; i++) {
            paisosList[i] = in.nextLine();
        }
        pais = in.nextLine();
        buscaBinari(paisosList, in, pais);

    }
        public static void buscaBinari(String[] paisosList, Scanner in, String pais) {
        int  cont = 0, bot = 0,mid, top = paisosList.length - 1;
        boolean sortir = false;


        while (bot <= top && sortir == false) {
                mid = (bot + top) / 2;
                System.out.println(cont);
                System.out.println("Bot:" + bot);
                System.out.println("top:" + top);
                System.out.println("mid:" + mid);
            if( pais.equalsIgnoreCase(paisosList[mid])) {
                cont++;
                System.out.println("Total passades: " + cont);
                System.out.println("Trobat a la posició: " + mid);
                sortir = true;
                
            }
            if (pais.charAt(0) > paisosList[mid].charAt(0)) {
                cont++;
                bot = mid + 1;

            } else if (pais.charAt(0) < paisosList[mid].charAt(0)) {
                cont++;
                top = mid - 1;
            } 
        }
        if (sortir == false) {
            System.out.println("No trobat");
        }
    }
}
    