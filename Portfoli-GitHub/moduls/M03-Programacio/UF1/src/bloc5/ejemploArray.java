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
public class ejemploArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int [] mitjana = new int[10];
        int  media = 0;
        
        for (int i = 0; i < mitjana.length ; i++){
            
            if ( i == 0 ){
                System.out.println("Escribe un numero:");
                mitjana[i] = in.nextInt();
            } else {
                System.out.println("Escribe otro numero:");
                mitjana[i] = in.nextInt();
            }
        }
        
        for ( int i = 0; i < mitjana.length; i++  ){
            
            media += mitjana[i];
        }
        
        media = media / mitjana.length;
        System.out.println("La mitjana de la array es:");
        System.out.println(media);
    }
    
}
