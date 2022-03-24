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
public class ex4 {

    /*Realitzar un programa que rep una quantitat d’hores,minuts i segons i la incrementi un segon.*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hores, min, seg;
        
        System.out.println("Intro hora");
        hores = in.nextInt();
        
        System.out.println("Intro min");
        min = in.nextInt();
        
        System.out.println("Intro seg");
        seg = in.nextInt();
        /* con bucle while*/
        /*while (hores != 24){
            System.out.println("Reloj: " + hores + ":" + min + ":" + seg);
            if (seg == 59){
            min++;
            seg = 0;
            } else if (min == 59){
            hores++;
            min = 0;
            }
            seg++;
            
        }*/
        
        /*Sin bucle con if*/
        if (seg == 59){
        min++;
        seg = 0;
        if (min >= 59){
            hores++;
            min = 0;
        }
        } else{
            seg = seg + 1;
        }
        System.out.println("Reloj: " + hores + ":" + min + ":" + seg);
    }
}
