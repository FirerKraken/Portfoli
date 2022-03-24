/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2UF1HugoBarrera;

import java.util.Scanner;

/**
 *
 * @author bhugo
 */
public class ex2HugoMain {

    /*Exercici 2. 6 p

      Som aficionats a la meteorologia i recollim informació de 10 estacions meteorològiques d'arreu del món a la mateixa hora. ( Pots 
      introduir directament la informació per codi). Emmagatzemem Pais (String), Regió (String), temperatura (int) i pressió 
      atmosfèrica(float). Una vegada introduïda la informació volem:

      Saber la ubicació amb la temperatura més alta (regió i país al que pertany) (1,5 punt)
      Quants  estacions tenim a cada país (3,0 punt)
      Introduint les 4 informacions per teclat,  comprovar si aquesta estació ( pais i regió) ja està introduïda. Si ho està, 
      actualitzar temperatura i pressió atmosfèrica, Si no ho està indicar-ho
      NOTA: A cada pais i regió només hi ha una estació*/
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ex2HugoClass[] estacions = new ex2HugoClass[10];

        String pais = "", regio = "";
        int temperatura = 0;
        float presioAtm = 0;

        estacions[0] = new ex2HugoClass("España", "Andalucia", 20, 12);
        estacions[1] = new ex2HugoClass("España", "Cataluña", 17, 11);
        estacions[2] = new ex2HugoClass("España", "Galicia", 14, 10);
        estacions[3] = new ex2HugoClass("Francia", "Paris", 19, 13);
        estacions[4] = new ex2HugoClass("USA", "Texas", 27, 9);
        estacions[5] = new ex2HugoClass("USA", "California", 19, (float) 12.2);
        estacions[6] = new ex2HugoClass("Rusia", "Moscou", 2, 14);
        estacions[7] = new ex2HugoClass("Alemania", "Berlin", 10, 13);
        estacions[8] = new ex2HugoClass("Italia", "Roma", 15, 10);
        estacions[9] = new ex2HugoClass("España", "Comunidad Valenciana", 16, 10);

        temperaturaMax(estacions);
        countEstacions(estacions);
        introEstacions(estacions);

    }

    public static void temperaturaMax(ex2HugoClass[] estacions) {
        int maxTemperatura = 0;
        String paisMaxTmp = "", regioMaxTmp = "";

        for (int i = 0; i < estacions.length; i++) {
            if (estacions[i].getTemperatura() > maxTemperatura) {
                maxTemperatura = estacions[i].getTemperatura();
                paisMaxTmp = estacions[i].getPais();
                regioMaxTmp = estacions[i].getRegio();
            }
        }
        System.out.println("La maxima temperatura ha estat de: " + maxTemperatura + ", en el pais: " + paisMaxTmp + " i regio: " + regioMaxTmp + ".");
    }

    public static void countEstacions(ex2HugoClass[] estacions) {

        int countEsp = 0, countFr = 0, countUSA = 0, countR = 0, countA = 0, countI = 0, countMax = 0;
        String maxEstacio = "";
        for (int i = 0; i < estacions.length; i++) {
            if (estacions[i].getPais() == "España") {
                countEsp++;
            } else if (estacions[i].getPais() == "Francia") {
                countFr++;
            } else if (estacions[i].getPais() == "USA") {
                countUSA++;
            } else if (estacions[i].getPais() == "Rusia") {
                countR++;
            } else if (estacions[i].getPais() == "Alemania") {
                countA++;
            } else if (estacions[i].getPais() == "Italia") {
                countI++;
            }
        }
        if (countMax < countEsp) {
            countMax = countEsp;
            maxEstacio = "España";
        }
        if (countMax < countFr) {
            countMax = countFr;
            maxEstacio = "Francia";
        }
        if (countMax < countUSA) {
            countMax = countUSA;
            maxEstacio = "USA";
        }
        if (countMax < countR) {
            countMax = countR;
            maxEstacio = "Rusia";
        }
        if (countMax < countA) {
            countMax = countA;
            maxEstacio = "Alemania";
        }
        if (countMax < countI) {
            countMax = countI;
            maxEstacio = "Italia";
        }
        System.out.println("La estacio que ha estat mes repetida, ha sigut: " + maxEstacio + ", que ha estat repetida un total de: " + countMax + " vegades.");
    }

    public static void introEstacions(ex2HugoClass[] estacions) {
        Scanner in = new Scanner(System.in);
        Scanner src = new Scanner(System.in);
        String introPais = "", introRegio = "";
        boolean sortir = false, paisTrobat = false;
        int preguntaSortir = 0;
        while (sortir == false) {
            paisTrobat = false;
            System.out.println("Intro el pais que vols buscar");
            introPais = src.nextLine();
            System.out.println("Intro la regio que vols buscar");
            introRegio = src.nextLine();
            for (int i = 0; i < estacions.length; i++) {
                if (introPais == estacions[i].getPais()) {
                    if (introRegio == estacions[i].getRegio()) {
                        System.out.println("Actualitza la temperatura y la presio atmosferica");
                        System.out.println("Nova temperatura");
                        estacions[i].setTemperatura(in.nextInt());
                        System.out.println("Nova PA");
                        estacions[i].setPresioAtm(in.nextFloat());
                        paisTrobat = true;
                    }
                } else {
                paisTrobat = false;
                }
            }
            if (paisTrobat == false){
                System.out.println("No sa trobat cap pais ni regio amb les teves credencials.");
            }
            System.out.println("Vols sortir o vols continuar cercant dades(0 = sortir / 1 = continuar)");
            preguntaSortir = in.nextInt();
            if (preguntaSortir == 0){
            sortir = true;
            }
        }
    }
}
