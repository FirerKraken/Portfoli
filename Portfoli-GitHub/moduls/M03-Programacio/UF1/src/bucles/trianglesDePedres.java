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
public class trianglesDePedres {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         
        int pedres, pedresPosades = 0, pedresPerFila = 0;
        
        System.out.println("Pedres disponibles...");
        pedres = in.nextInt();
        
        while (pedresPosades <= pedres){
            pedresPerFila++;
            pedresPosades = pedresPosades + pedresPerFila;
        }
        System.out.println("El triangle es de " + (pedresPerFila -1));
        System.out.println("Sobren " + (pedres - ( pedresPosades - pedresPerFila )));
    }
}
