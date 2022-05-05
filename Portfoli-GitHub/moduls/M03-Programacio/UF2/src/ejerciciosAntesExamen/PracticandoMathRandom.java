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
public class PracticandoMathRandom {
    public static void main(String [] args){
    int min = 0, max = 7;
   
    int[] x = new int[8];

        for (int i = 0; i < x.length; i++) {
            x[i] = (int) (Math.random()*(max - min)+min);
            System.out.println(x[i]);
        }
    }
}
