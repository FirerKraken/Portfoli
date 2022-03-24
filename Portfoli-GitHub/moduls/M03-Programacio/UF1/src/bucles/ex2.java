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
public class ex2 {

    /*Una empresa paga als seus treballadors setmanalment d’acord amb el nombre d’hores treballades, a raó de D €/h si han treballat menys
    de 40 hores setmanals (o igual). El nombre d’hores que passin de 40 es paguen un 50% més cares l’hora (1.5D). Es demana fer un programa
    que, per a cada treballador (suposeu un número de treballadors), llegeixi el nombre d’hores treballades, la quantitat pagada per hora, i 
    doni la quantitat final que ha de cobrar cadascun d’ells. */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int hores = 0, horesExtra = 0;
        float euroHora = 0, totalExtra = 0, totalCobrado = 0;

        for (int trabajadores = 0; trabajadores <= 10; trabajadores++) {

            
            System.out.println("Cuanto cobran tus trabajdores por hora??");
            euroHora = in.nextInt();

            System.out.println("Cuantes hores ha treballat el teu treballador");
            hores = in.nextInt();

            if (hores > 40) {
                horesExtra = hores - 40;

                totalExtra = (float) (horesExtra * (euroHora * 1.5));
                totalCobrado = totalExtra + (hores * euroHora);

            } else if (hores <= 40) {

                totalCobrado = hores * euroHora;
            }

            System.out.println("ha cobrado: " + totalCobrado + " esta semana");
        }

    }
}
