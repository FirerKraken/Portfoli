/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcions3;

import java.util.Scanner;

/**
 *
 * @author bhugo
 */
public class ex03_Penjat {
    
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        String[] paraules = {"patata", "cochino", "palomo", "manzana", "rinoceronte"};
        String[][] penjat ={{" ", " ", " ", "_", "_", "_", "_", "_", " ", " "," ", " "},
                            {" ", " ", "|", " ", " ", " ", " ", " ", "|", " "," ", " "},
                            {" ", " ", "|", " ", " ", " ", " ", " ", " ", " "," ", " "},
                            {" ", " ", "|", " ", " ", " ", " ", " ", " ", " "," ", " "},
                            {" ", " ", "|", " ", " ", " ", " ", " ", " ", " "," ", " "},
                            {" ", " ", "|", " ", " ", " ", " ", " ", " ", " "," ", " "},
                            {" ", "_", "|", "_", " ", " ", " ", " ", " ", " "," ", " "},
                            {"|", " ", " ", " ", "|", "_", "_", "_", "_", "_","_", " "},
                            {"|", " ", " ", " ", " ", " ", " ", " ", " ", " "," ", "|"},
                            {"|", "_", "_", "_", "_", "_", "_", "_", "_", "_","_", "|"}};   
 
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.print(penjat[i][j]);
            }
            System.out.println("");
        }
        
        String paraulaSecreta ="";
        boolean sortir = false;
        
        paraulaSecreta = paraules[random()]; 
        System.out.println(paraulaSecreta);
        for (int i = 0; sortir == false; i++) {
            
        }
        
        while(sortir == false){
        
        }
    }
    public static int random(){
        return (int) (Math.random()*5);
    }
}
