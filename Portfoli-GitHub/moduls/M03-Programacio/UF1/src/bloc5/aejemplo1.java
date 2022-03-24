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
public class aejemplo1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner inNum = new Scanner(System.in);

        classCotxe[] concessionari = new classCotxe[3];

        int potencia = 0, sumPot = 0, mitjanaPot = 0;
        String marca = "", model = "";
        boolean electric = false;
        for (int i = 0; i < concessionari.length; i++) {
            System.out.println("Intro marca");
            marca = in.nextLine();
            System.out.println("Intro model");
            model = in.nextLine();
            System.out.println("Intro potencia");
            potencia = inNum.nextInt();
            System.out.println("Es electric?");
            electric = inNum.nextBoolean();

            sumPot += potencia;
            concessionari[i] = new classCotxe(marca, model, potencia, electric);

        }

        imprimeix(concessionari);
        mitjanaPotencia(concessionari);
        System.out.println("La mitjana de les potencies es de: " + mitjanaPotencia(concessionari));
        numElectric(concessionari);
        System.out.println("Hi ha: " + numElectric(concessionari) + "vehicles no electrics");
        incrementPotencia(10, concessionari);

    }

    public static void imprimeix(classCotxe[] taller) {
        System.out.println("Impressio de l'array");
        for (int i = 0; i < taller.length; i++) {
            taller[i].imprimeix();
        }
    }

    public static double mitjanaPotencia(classCotxe[] taller) {
        int sumPot = 0;
        double mitjanaPot = 0;
        for (int i = 0; i < taller.length; i++) {
            sumPot += taller[i].getPotencia();
        }
        mitjanaPot = (double) (sumPot / taller.length);
        return mitjanaPot;
    }
    
    public static int numElectric(classCotxe[] taller){
        
        int numNElectrics = 0;
        
        for (int i = 0; i < taller.length; i++) {
            if (taller[i].isElectric() == false){
            numNElectrics ++;
            
            }
        }
        return numNElectrics;
    
    }
    public static void incrementPotencia(int increment, classCotxe[] taller){
    
        for (int i = 0; i < taller.length; i++) {
            taller[i].augmentaPotencia(increment);
        }
    }

}
