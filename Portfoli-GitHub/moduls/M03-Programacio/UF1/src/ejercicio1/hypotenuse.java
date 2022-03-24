/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author bhugo
 */
public class hypotenuse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double cat, hip;

        System.out.println("dame el cateto, cateto!");
        cat = in.nextDouble();

        hip = Math.sqrt((cat * cat) + (cat * cat));
        System.out.printf("La hipotenusa = %.2f", hip);

    }
}