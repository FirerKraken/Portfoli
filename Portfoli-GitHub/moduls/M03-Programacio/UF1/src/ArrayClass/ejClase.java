/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayClass;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author bhugo
 */
public class ejClase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
        String prueba = "Hola que tal";
        
        
        //toCharArray
        char[] array = new char [prueba.length()];
        array = prueba.toCharArray();
        
        System.out.println("Aqui empieza toCharArray");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }
        System.out.println("");
        
        System.out.println("Aqui empieza Split");
        // String; Split
        String cadena = "Hugo;Barrera Castillo;Knekrer;Terrassa";
        String[] cadenaArray = new String[4];
        cadenaArray = cadena.split(";");
        
        for (int i = 0; i < cadenaArray.length; i++){
            System.out.println("Camp:" + cadenaArray[i]);
        }
        
        System.out.println("Aqui empieza copyOf");
        //Arrays: copyOf
        int[] arrInt = new int[] { 2, 4, 6, 8, 0, 7, 5};
        int[] arrInt2 =  Arrays.copyOf(arrInt, arrInt.length);
        
        System.out.println(arrInt2);
        
        //Arrays: equals
        int[] arrIgual1 = new int[] { 2, 4, 6,};
        int[] arrIgual2 = new int[] { 2, 4, 6,};
        
        boolean iguals = Arrays.equals(arrIgual1, arrIgual2);
        
        if (iguals == true){
            System.out.println("Son iguals");
        } else if(iguals == true){
            System.out.println("No son iguals");
        }
        
        //Array: fill
        
        int[] paraFillear = new int[] {4, 6, 21, 3, 22, 5, 3, 6};
        
        System.out.println("Sin fillear: " + paraFillear);
        Arrays.fill(paraFillear, 1000);
        System.out.println("Rellenar con 1000: " + paraFillear);
        
        //Array: sort
        int[] arrayS1 = new int[] {2, 4, 1, 5, 7, 20, 10, 24};
    } 
    
}
