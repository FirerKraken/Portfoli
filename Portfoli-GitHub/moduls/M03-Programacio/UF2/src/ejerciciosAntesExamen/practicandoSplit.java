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
public class practicandoSplit {

    public static void main(String[] args) {
        String frase = "Hola que, tal"; 

        String[] fraseSeparada = frase.split(", ");
        System.out.println("Separado por palabras");
        for (int i = 0; i < fraseSeparada.length; i++) {
            System.out.println(fraseSeparada[i]);
        }
        
        //Hay muchos caracteres especiales que no funcionan por si mismos y hay que poner \\ seguido de el simbolo a separar.
        String frase2 = "Holaquetal"; 
        System.out.println("Separado por letras");
        String[] fraseSeparada2 = frase2.split("|");
        
        for (int i = 0; i < fraseSeparada2.length; i++) {
            System.out.println(fraseSeparada2[i]);
        }
    }
}
