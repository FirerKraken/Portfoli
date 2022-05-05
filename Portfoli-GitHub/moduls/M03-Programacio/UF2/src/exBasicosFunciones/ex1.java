/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exBasicosFunciones;

import java.util.Scanner;

import java.util.Random;

/**
 *
 * @author bhugo
 */
public class ex1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        int num1 = 0, num2 = 0, majorMenor = 0;
        
        //Escribir por pantalla holamundo
        holaMundo();
        //Pedir dos numeros por pantalla para trabajar con ellos
        System.out.println("Escriu un num");
        num1 = in.nextInt();
        System.out.println("Escriu otro num");
        num2 = in.nextInt();
        //Dar la suma de los dos numeros introducidos
        suma(num1, num2);
        //Decir si alguno de los dos numeros introducidos es major que 0
        System.out.println(" Escribe un numero nuevo:");
        majorMenor = in.nextInt();
        majorQue(majorMenor);
        //Numero random entre num1 y num2
        System.out.println("Con los dos primeros numeros que introduciste se generara un numero aleatorio entre esos 2");
        
        
        //random(num1,num2);
        
    }
    public static void holaMundo(){
    
        System.out.println("Hola mundo!!");
    }
    public static void suma(int num1, int num2){
    
        int suma = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Escriu un num");
        num1 = in.nextInt();
        System.out.println("Escriu otro num");
        num2 = in.nextInt();
        
        suma = num1 + num2;
        
        System.out.println("La suma dels dos numeros es de: " + suma);
        
    }
    public static void majorQue(int majorMenor){
        if (majorMenor > 0 ){
            System.out.println("El primer numero que introducieste es major que 0:" + majorMenor);
        } else if ( majorMenor < 0) {
            System.out.println("El primer numero que introduciste es menor que 0: " + majorMenor);
        } else {
            System.out.println("El numero que introduciste es igual a 0: " + majorMenor);
        }
    }
//    public static void random(int num1, int num2){
//        int numRandom = 0;
//        
//        numRandom = Math.random()*3;
//    }
    
}
