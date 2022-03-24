/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloc6;

import java.util.Scanner;

/**
 *
 * @author bhugo
 */
public class ex7Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ex7Class1[] empleat = new ex7Class1[4];

        String nom = "", nomDepartament = "";
        int edat = 0, telefon = 0;
        
        ex7Class2[] datos = new ex7Class2[4];
        String nomEmpleat = "", departamentClass2 ="";
        int hora = 0, sueldo = 0;

        for (int i = 0; i < empleat.length; i++) {
            System.out.println("Introdueix les dades de l'empleat " + i);
            System.out.println("Intro nom:");
            nom = in.nextLine();
            System.out.println("Intro edat:");
            edat = in.nextInt();
            System.out.println("Intro telefon:");
            telefon = in.nextInt();
            System.out.println("Intro departament:");
            nomDepartament = in.nextLine();

            empleat[i] = new ex7Class1(nom, edat, telefon, nomDepartament);
        }
        for (int i = 0; i < datos.length; i++) {
            System.out.println("Intro datos: ");
            System.out.println("Intro nombre empleado: ");
            nomEmpleat = in.nextLine();
            System.out.println("Intro nombre departament:");
            departamentClass2 = in.nextLine();
            System.out.println("Intro horas:");
            hora = in.nextInt();
            System.out.println("Intro sueldo:");
            sueldo = in.nextInt();
            
            datos[i] = new ex7Class2 (nomEmpleat, departamentClass2, hora, sueldo);
        }
        imprimeixMain1(empleat);
        imprimeixMain2(datos);

    }

    public static void imprimeixMain1(ex7Class1[] treballador) {

        for (int i = 0; i < treballador.length; i++) {
            System.out.println("Treballador: " + i);
            treballador[i].imprimeixClass1();
            System.out.println("");
        }
    }
    public static void imprimeixMain2(ex7Class2[] treballador) {

        for (int i = 0; i < treballador.length; i++) {
            System.out.println("Treballador: " + i);
            treballador[i].imprimeixClass2();
            System.out.println("");
        }
    }
}
