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
public class ex13 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n, cont = 0, major = 0, repetidos = 1;
            
            while(cont <= 10){
                System.out.println("Escribe un numero: ");
                n = in.nextInt();
                if (major == n){
                 repetidos++;
                }
                if (n > major){
                major = n;
                repetidos = 1;
                }
                cont ++;
                
            }
            System.out.println("El numero mas grande de los que has escrito es: " + major);
            System.out.println("El numero major ha salido un total de: " + repetidos + " veces");
        }

}
