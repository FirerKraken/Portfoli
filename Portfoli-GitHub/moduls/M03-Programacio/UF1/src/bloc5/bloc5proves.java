/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloc5;

/**
 *
 * @author bhugo
 */
import java.util.Scanner;

public class bloc5proves {

 public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Scanner inNum = new Scanner(System.in);

        classCotxe[] concessionari = new classCotxe[3];

        for (int i = 0; i < concessionari.length; i++) {
            if (concessionari[i] == null) {
                System.out.println("No hi ha res en la posiciÃ³ " + i);
            }
        }

        for (int i = 0; i < concessionari.length; i++) {
            System.out.println("Marca:");
            String marca = in.nextLine();
            System.out.println("Model:");
            String model = in.nextLine();
            System.out.println("PotÃ¨ncia:");
            int potencia = inNum.nextInt();
            System.out.println("Ã‰s electric:");
            boolean electric = inNum.nextBoolean();

            concessionari[i] = new classCotxe(marca, model, potencia, electric);
        }

        // Per esborrar un objete Ã©s sufient amb posar-lo a null
        // P.e. : concessionari[0] = null;
        
        
        imprimeix(concessionari);
        // Mostra quina Ã©s la potencia mitjana de tots els vehicles
        System.out.println("La potencia Ã©s " + mitjanaPotencia(concessionari));
        // MOstra quants vehicles hi ha no elÃ¨ctrics
        System.out.println("Hi ha " + noElectrics(concessionari) + " vehicles no elÃ¨ctrics");
        // Incrementa en 10 CV la potÃ¨ncia de tots els vehicles
        incrementPotencia(10, concessionari);
        // Duplica la potÃ¨ncia de tots els vehicles
        duplicaPotencia(concessionari);
        // Mostra les dades del vehicle de mÃ©s potÃ¨ncia ( en el programa principal) 
        // Recollim l'objecte que ens retorna el mÃ¨tode mesPotencia
        // Forma 1
        classCotxe cotxeMesPotent = cotxeMesPotent(concessionari);
        // Imprimim el contigut de l'objecte
        cotxeMesPotent.imprimeix();
        // Forma 2
        cotxeMesPotent(concessionari).imprimeix();
    }

    public static classCotxe cotxeMesPotent(classCotxe[] taller) {
        int posicioVehicleMesPotent = 0;
        int potenciaMaxima = taller[0].getPotencia();
        for (int i = 1; i < taller.length; i++) {
            if (taller[i].getPotencia() > potenciaMaxima) {
                posicioVehicleMesPotent = i;
                potenciaMaxima = taller[i].getPotencia();
            }
        }
        // Retornem l'objecte complet
        return taller[posicioVehicleMesPotent];
    }

    public static void duplicaPotencia(classCotxe[] taller) {
        int potencia;
        // Forma 1. Pas a pas
        for (int i = 0; i < taller.length; i++) {
            potencia = taller[i].getPotencia();
            potencia = potencia * 2;
            taller[i].setPotencia(potencia);
        }
        // Forma 2. Integrant passos
        for (int i = 0; i < taller.length; i++) {
            taller[i].setPotencia(taller[i].getPotencia() * 2);
        }
    }

    public static void incrementPotencia(int increment, classCotxe[] taller) {
        for (int i = 0; i < taller.length; i++) {
            taller[i].augmentaPotencia(increment);
        }
    }

    public static void imprimeix(classCotxe[] taller) {
        System.out.println("ImpressiÃ³ de l'array");
        for (int i = 0; i < taller.length; i++) {
            taller[i].imprimeix();
        }
    }

    public static double mitjanaPotencia(classCotxe[] taller) {
        int sumaPot = 0;
        for (int i = 0; i < taller.length; i++) {
            sumaPot = sumaPot + taller[i].getPotencia();
        }
        double mitjana = (float) sumaPot / taller.length;
        return mitjana;
    }

    public static int noElectrics(classCotxe[] taller) {
        int noElec = 0;
        for (int i = 0; i < taller.length; i++) {
            if (taller[i].isElectric() == false) {
                noElec++;
            }
        }
        return noElec;
    }
}
   