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
public class ex3HugoBarrera {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //PRIMER DE TOT EL QUE FAREM SERA CREAR LES VARIABLES QUE NECESITAREM PER EL NOSTRE PROGRAMA
        String nom = "", nomInt = "";
        int nomSumats = 0, suma = 0, suma2en2 = 0;
        boolean sortir = false, sortir2 = false;

        //ARA CERAREM EL BUCLE ENCARREGAT DE RECOPILAR LA CADENA DE 8 NUMEROS I DE VALIDAR LA SEVA LONGITUD
        while (sortir == false) {
            System.out.println("Introduceme un numero de 8 cifras");
            nom = in.nextLine();
            if (nom.length() != 8) {
                System.out.println("numero de cifras incorrecto, vuelve a intentarlo;");
            } else {
                sortir = true;
            }
        }

        /*AQUI EL QUE HE FET ES CREAR UN BUCLE QUE HEM VAGI LLEGINT LLETRA PER LLETRA I QUE AIXO HO AFEGEIXI A UNA VARIABLE QUE CADA VOLTA ES
        VUIDA PER TAL DE CADA VOLTA SUMAR NOMES UN DIGIT*/
        for (var i = 0; i < nom.length(); i++) {
            if (nom.charAt(i) != ' ') {

                nomInt += nom.charAt(i);

                nomSumats += Integer.parseInt(nomInt);

                nomInt = "";
            }

        }
        //AQUI ES MOSTRA LA PRIMERA PART DE L'EXERCICI QUE TRACTA DE QUE CALCULI LA SUMA DE LES XIFRES QUE CONSTA
        System.out.println(nomSumats);
        
        /* AQUI SEGUIREM AMB LA MATEIXA LOGICA QUE EN L'ANTERIOR, PERO EL QUE FAREM SERA SUMAR LA POSICIO QUE VOLEM MES UNA ALTRE I 
        A LA ULTIMA VOLTA LI TORNAREM A SUMAR 1 A I PER TAL DE NO REPETIR POSICIONS A CADA VOLTA*/
        for (var i = 0; i < nom.length(); i++) {
            if (nom.charAt(i) != ' ') {

                nomInt += nom.charAt(i);
                nomInt += nom.charAt(i + 1);

                suma2en2 += Integer.parseInt(nomInt);

                nomInt = "";
                i++;
            }
        }
        System.out.println(suma2en2);
        

    }
}
