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
public class ultimodigitofactoial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, factorial = 1;
        System.out.println("dame num");
        num = in.nextInt();
        for (int i = num; i > 0; i--){
        factorial = factorial * i;
        }
        System.out.println("El factorial es " + factorial);
        System.out.println("la darrera xifra es " + (factorial % 10));
    }
}
