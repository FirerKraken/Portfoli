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
public class ex1HugoBarrera {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        /*En un vacunòdrom de Terrassa volen fer un programa informàtic per recollir dades de les persones que hi venen i de les vacunes 
        administrades
        Van recollint la informació de totes les persones que venen. Es recull nom ( no cal cognoms) (String), sexe  (String) i edat (int).
        Per donar la recollida per tancada s'ha d'introduir en el camp nom la paraula 'final'
        Al finalitzar el dia s'ha de dir el percentatge d'homes i dones, la mitjana d'edat dels homes i de les dones i quants hi ha ( homes i 
        dones junts)de 20 a 40 anys, de 41 a 60 anys,  61 a 80, o més de 80.*/

        // Creacio de les variables que necessitare per fer el exercici
        String nom = null, sexe = null, fi = "final";
        int edat = 0, contHome = 0, contDona = 0, sumEdatHomes = 0, sumEdatDones = 0, rang1 = 0, rang2 = 0, rang3 = 0, rang4 = 0, contTotal;
        float percentatge = 0, mitjanaHomes = 0, mitjanaDones = 0;
        boolean sortir = false;

        //Aqui es crea el bucle encarregat de la recollida de dades de els pacients, per despres fer els deguts calculs
        while (sortir == false) {
            System.out.println("Introdueix el nom, sexe i edat de el pacient per recollir-li l'informacio");
            System.out.println("Primer introdueix el nom, o per el contrari introdueix 'final' si el dia ya ha finalitzat");
            nom = str.nextLine();
            
            // UNA VEGADA DEMANAT EL NOM CREEM UN IF QUE ENS COMPARARA EL NOM PER SABER SI VOLEM SORTIR O CONTINUANT RECABANT DADES
            if (nom.equalsIgnoreCase(fi)) {
                sortir = true;
            } else {
                System.out.println("Ara introdueix el teu sexe: 'Home' o 'Dona'.");
                sexe = str.nextLine();

                if (sexe.equalsIgnoreCase("home")) {
                    contHome++;
                    sumEdatHomes += edat;
                    System.out.println("Ara introdueix la teva edat");
                    edat = in.nextInt();
                    if ((edat >= 20) && (edat <= 40)) {
                        rang1++;
                    } else if ((edat > 40) && (edat <= 60)) {
                        rang2++;
                    } else if ((edat > 60) && (edat <= 80)) {
                        rang3++;
                    } else if (edat > 80) {
                        rang4++;
                    }
                } else if (sexe.equalsIgnoreCase("dona")) {
                    contDona++;
                    sumEdatDones += edat;
                    System.out.println("Ara introdueix la teva edat");
                    edat = in.nextInt();
                    if ((edat >= 20) && (edat <= 40)) {
                        rang1++;
                    } else if ((edat > 40) && (edat <= 60)) {
                        rang2++;
                    } else if ((edat > 60) && (edat <= 80)) {
                        rang3++;
                    } else if (edat > 80) {
                        rang4++;
                    }
                } else {
                    System.out.println("Has introduit una data erronea, torna a intentar-ho.");
                }

            }

        }
        //UNA VEGADA TENIM LES DADES TOCA FER ELS CALCULS
        contTotal = contHome + contDona;
        //TOTAL HOMES, DONES PER SEPARAT I JUNTS
        System.out.println("Hi a un total de: " + contHome + " homes");
        System.out.println("Hi a un total de: " + contDona + " dones");
        System.out.println("Hi a un total de: " + contTotal + " persones");
        //MITJANA D'HOMES I DONES
        mitjanaHomes = (float) contHome / contTotal;
        mitjanaDones = (float) contDona / contTotal;
        System.out.printf("%.2f", mitjanaHomes);
        System.out.println("");
        System.out.printf("%.2f", mitjanaDones);
        System.out.println("");
        //SABER EN QUIN RANG D'EDAT ES TROBEN
        System.out.println("Hi ha un total de: " + rang1 + " d'homes i dones que tenen un rang d'edat entre 20 i 40 anys");
        System.out.println("Hi ha un total de: " + rang2 + " d'homes i dones que tenen un rang d'edat entre 41 i 60 anys");
        System.out.println("Hi ha un total de: " + rang3 + " d'homes i dones que tenen un rang d'edat entre 61 i 80 anys");
        System.out.println("Hi ha un total de: " + rang4 + " d'homes i dones que tenen un rang major a 80 anys");
    }
}
