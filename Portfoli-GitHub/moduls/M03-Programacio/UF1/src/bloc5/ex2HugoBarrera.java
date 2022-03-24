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
public class ex2HugoBarrera {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //PRIMER DE TOT, EL QUE FAREM SERA CREAR LES VARIABLES QUE UTILITZAREM EN EL NOSTRE PROGRAMA
        String dni = "";
        int calcularDNI = 0, resto;
        boolean sortir = false;

        //CREAREM EL BUCLE EN EL QUAL ES VALIDARA EL DNI INTRODUÏT I QUE LA SEVA LONGITUD SIGUI LA CORRECTA
        while (sortir == false) {
            System.out.println("Introduceme tu dni sin la letra del final, para asi poder calcularla");
            dni = in.nextLine();
            if (dni.length() != 8) {
                System.out.println("El DNI esta mal escrito, escribalo de nuevo");
            } else {
                sortir = true;
            }
        }
        
        //UNA VEGADA YA HEM RECOPILAT EL DNI EL QUE FAREM SERA A CONVERTIR LA STRING EN UN ENTER PER D'AQUESTA MANERA PODER CALCULAR-HO
        calcularDNI = Integer.parseInt(dni);

        //ARA CALCULAREM EL RESTO PER PODER SABER QUINA ES LA LLETRA DEL DNI.
        resto = calcularDNI / 23;
        
        if (resto == 0) {
            System.out.println("Tu letra del DNI es la T por tanto tu dni quedaria de la siguiente manera: " + dni + "T ");
        } else if (resto == 1) {
            System.out.println("Tu letra del DNI es la R por tanto tu dni quedaria de la siguiente manera: " + dni + "R");
        } else if (resto == 2) {
            System.out.println("Tu letra del DNI es la W por tanto tu dni quedaria de la siguiente manera: " + dni + "W");
        } else if (resto == 3) {
            System.out.println("Tu letra del DNI es la A por tanto tu dni quedaria de la siguiente manera: " + dni + "A");
        } else if (resto == 4) {
            System.out.println("Tu letra del DNI es la G por tanto tu dni quedaria de la siguiente manera: " + dni + "G");
        } else if (resto == 5) {
            System.out.println("Tu letra del DNI es la M por tanto tu dni quedaria de la siguiente manera: " + dni + "M");
        } else if (resto == 6) {
            System.out.println("Tu letra del DNI es la Y por tanto tu dni quedaria de la siguiente manera: " + dni + "Y");
        } else if (resto == 7) {
            System.out.println("Tu letra del DNI es la F por tanto tu dni quedaria de la siguiente manera: " + dni + "F");
        } else if (resto == 8) {
            System.out.println("Tu letra del DNI es la P por tanto tu dni quedaria de la siguiente manera: " + dni + "P");
        } else if (resto == 9) {
            System.out.println("Tu letra del DNI es la D por tanto tu dni quedaria de la siguiente manera: " + dni + "D");
        } else if (resto == 10) {
            System.out.println("Tu letra del DNI es la X por tanto tu dni quedaria de la siguiente manera: " + dni + "X");
        } else if (resto == 11) {
            System.out.println("Tu letra del DNI es la B por tanto tu dni quedaria de la siguiente manera: " + dni + "B");
        } else if (resto == 12) {
            System.out.println("Tu letra del DNI es la N por tanto tu dni quedaria de la siguiente manera: " + dni + "N");
        } else if (resto == 13) {
            System.out.println("Tu letra del DNI es la J por tanto tu dni quedaria de la siguiente manera: " + dni + "J");
        } else if (resto == 14) {
            System.out.println("Tu letra del DNI es la Z por tanto tu dni quedaria de la siguiente manera: " + dni + "Z");
        } else if (resto == 15) {
            System.out.println("Tu letra del DNI es la S por tanto tu dni quedaria de la siguiente manera: " + dni + "S");
        } else if (resto == 16) {
            System.out.println("Tu letra del DNI es la Q por tanto tu dni quedaria de la siguiente manera: " + dni + "Q");
        } else if (resto == 17) {
            System.out.println("Tu letra del DNI es la V por tanto tu dni quedaria de la siguiente manera: " + dni + "V");
        } else if (resto == 18) {
            System.out.println("Tu letra del DNI es la H por tanto tu dni quedaria de la siguiente manera: " + dni + "H");
        } else if (resto == 19) {
            System.out.println("Tu letra del DNI es la L por tanto tu dni quedaria de la siguiente manera: " + dni + "L");
        } else if (resto == 20) {
            System.out.println("Tu letra del DNI es la C por tanto tu dni quedaria de la siguiente manera: " + dni + "C");
        } else if (resto == 21) {
            System.out.println("Tu letra del DNI es la K por tanto tu dni quedaria de la siguiente manera: " + dni + "K");
        } else if (resto == 22) {
            System.out.println("Tu letra del DNI es la E por tanto tu dni quedaria de la siguiente manera: " + dni + "E");
        }
    }
}
