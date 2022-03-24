/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifexercices;

import java.util.Scanner;

/**
 *
 * @author bhugo
 */
public class exercicie6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int anyi, diai, mesi, anya, diaa, mesa, edat;

        anyi = 2002;
        diai = 19;
        mesi = 10;
        anya = 2021;
        diaa = 13;
        mesa = 10;
        if (mesi == mesa) {
            if (diaa > diai) {
                edat = anya - anyi;
                System.out.print("La teva edat es: " + edat);
            } else if (diaa == diai) {
                System.out.print("Felicitats");
            } else {
                edat = anya - anyi;
                edat = edat - 1;
                System.out.print("La teva edat es: " + edat);
            }
        } else if (mesi > mesa) {
            edat = anya - anyi;
            System.out.print("La teva edat es: " + edat);
        } else {
            edat = anya - anyi;
            edat = edat - 1;
            System.out.print("La teva edat es: " + edat);
        }
    }

}
