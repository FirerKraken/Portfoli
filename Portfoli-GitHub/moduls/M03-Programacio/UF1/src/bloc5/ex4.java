/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloc5;

import java.util.Scanner;

/**
 *
 * @author bhugo
 */
public class ex4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int [] notes = new int[20];
        float media = 0, suma = 0;
        
        for ( int i = 0; i < notes.length; i++){
            if (i == 0) {
                System.out.println("Escribe un numero:");
                notes[i] = in.nextInt();
            } else {
                System.out.println("Escribe otro numero:");
                notes[i] = in.nextInt();
            }
            
            suma = notes[i] + suma;
        }
        
        media = suma / notes.length;
        System.out.println(media);
        

    }
}
