/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack4repaso;

/**
 *
 * @author bhugo
 */
public class ex12 {
    public static void main(String[] args) {
        
        String deu="", nou="",vuit="",set="",sis="";
        
        int n = 10;
        
        for (int i = 10 ; i >= 6; i--){
            for (int j = i; j >= 0; j--){
                System.out.print(j);
                if (j ==     0){
                    System.out.println("");
                }
            }
        }
        
        /*
        while (n >= 0){
            if (n <= 10){
             deu = deu + n; 
            }
            if (n <= 9){
             nou = nou + n; 
            }
            if (n <= 8){
             vuit = vuit + n; 
            }
            if (n <= 7){
             set = set + n; 
            }
            if (n <= 6){
             sis = sis + n; 
            }
            n--;
        }
        System.out.println(deu);
        System.out.println(nou);
        System.out.println(vuit);
        System.out.println(set);
        System.out.println(sis);*/
    }
}
