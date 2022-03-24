/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.Scanner;

/**
 *
 * @author bhugo
 */
public class ex19 {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                
        String frase;
        int contA = 0, contE = 0, contI = 0, contO = 0, contU = 0;
        
        System.out.println("Escribe una frase");
        frase = in.nextLine();
        
        frase = frase.toLowerCase();
        for (int i = 0; i < frase.length(); i++){
            if (frase.charAt(i)  == 'a'){
                contA++;
            } else if (frase.charAt(i) == 'e'){
                contE++;
            } else if (frase.charAt(i) == 'i'){
                contI++;
            } else if (frase.charAt(i) == 'o'){
                contO++;
            } else if (frase.charAt(i) == 'u'){
                contU++;
            }
            
            
        }
        
        System.out.println("La frase que has escrito tiene un total de: " + contA + " a " + contE + " e " + contI + " i " + contO + " o " + contU + " u");

      
    }
}
