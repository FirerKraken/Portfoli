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
public class exprimos {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = 0, contPrimos = 0, cont = 2;
        boolean esPrimer = true;

        while (contPrimos < 30) {
            num++;
            cont = 2;
            esPrimer = true;
            while ((cont <= num / 2) && (esPrimer == true)) {
                if (num %cont == 0){
                esPrimer = false;
                }
                cont++;
            }
            if (esPrimer == true) {
                contPrimos++;
                System.out.println(num);
            }
        }
    }

}
