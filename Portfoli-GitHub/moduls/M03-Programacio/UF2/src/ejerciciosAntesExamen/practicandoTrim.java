/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosAntesExamen;

/**
 *
 * @author bhugo
 */
public class practicandoTrim {
   
    public static void main(String [] args){
        
      // Quitar los espacios del principio i de el final
    String s = " geeks for geeks has all java functions to read  "; 
    System.out.println(s.trim());  
      
    // trims the leading spaces 
    s = " Chetna loves reading books"; 
    System.out.println(s.trim());
    s = s.trim(); 
    System.out.println(s);
    
    }
}
