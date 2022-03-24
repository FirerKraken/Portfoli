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
public class ex {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int souAbans, augment;

        System.out.println("Cual era el sueldo que cobraba");
        souAbans = in.nextInt();

        if ((souAbans <= 9000) && (souAbans > 0)) {

        } else if ((souAbans > 9000) && (souAbans < 15000)) {

        } else if ((souAbans > 15000) && (souAbans <= 20000)) {

        } else if (souAbans > 20000) {

        } else {
        System.out.println("Error");
        }

    }
}
