/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack4repaso;

import java.util.Scanner;

/**
 *
 * @author bhugo
 */
public class ex8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, sDivisores = 0, i = 1;
        System.out.println("Dime un numero");
        n = in.nextInt();

        while (i < n) {
            if (n % i == 0) {
                System.out.print("Un divisor de 6 es: ");
                System.out.println(i);
                sDivisores = sDivisores + i;
                
            }
            i++;
        }

        if (sDivisores == i) {

            System.out.println("Es un numero perfecte");
        } else {
            System.out.println("No es perfecte");
        }

    }
}
