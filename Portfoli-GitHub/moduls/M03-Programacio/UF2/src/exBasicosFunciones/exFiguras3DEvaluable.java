/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exBasicosFunciones;

import java.util.Scanner;

/**
 *
 * @author bhugo
 */
public class exFiguras3DEvaluable {
     public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String cilindre = "c", hexaedre = "h", tetraedre = "t", esfera = "f", figura = "";
        double volumen = 0, superficie = 0;
        boolean sortir = false;

        while (sortir == false) {
            figura = in.nextLine();

            if (figura.equalsIgnoreCase(cilindre)) {
                calculaCilindre(superficie, volumen, figura, in);
            } else if (figura.equalsIgnoreCase(hexaedre)) {
                calculaHexaedre(superficie, volumen, figura, in);
            } else if (figura.equalsIgnoreCase(tetraedre)) {
                calculaTetraedre(superficie, volumen, figura, in);
            } else if (figura.equalsIgnoreCase(esfera)) {
                calculaEsfera(superficie, volumen, figura, in);
            } else if (figura.equalsIgnoreCase("s")){
                sortir = true;
            }
        }

    }

    public static void calculaCilindre(double superficie, double volumen, String figura, Scanner in) {
        double alto = 0, radio = 0;
        System.out.println("==Cilindre==");
        alto = in.nextDouble();
        radio = in.nextDouble();

        superficie = (2 * Math.PI * radio * alto) + (2 * Math.PI * Math.pow(radio, 2));
        volumen = Math.PI * alto * Math.pow(radio, 2);

        System.out.printf("Superfície: %.2f %n", superficie);
        System.out.printf("Volum: %.2f %n", volumen);
        
        

    }

    public static void calculaHexaedre(double superficie, double volumen, String figura, Scanner in) {
        double arista = 0;
        System.out.println("==Hexaedre==");
        arista = in.nextDouble();

        superficie = 6 * Math.pow(arista, 2);
        volumen = 6 * Math.pow(arista, 3);
        
        System.out.printf("Superfície: %.2f %n", superficie);
        System.out.printf("Volum: %.2f %n", volumen);
    }

    public static void calculaTetraedre(double superficie, double volumen, String figura, Scanner in) {
        double lado = 0, altura = 0;
        System.out.println("==Tetraedre==");
        lado = in.nextDouble();
        altura = lado * Math.sqrt(6 / 3);
        
        superficie = Math.pow(lado, 2) * Math.sqrt(3);
        volumen = Math.pow(lado, 3) * (Math.sqrt(2) / 12);

        System.out.printf("Superfície: %.2f %n", superficie);
        System.out.printf("Volum: %.2f %n", volumen);

    }

    public static void calculaEsfera(double superficie, double volumen, String figura, Scanner in) {
        double radio = 0;
        System.out.println("==Esfera==");
        radio = in.nextDouble();
        
        superficie = 4 * Math.PI * Math.pow(radio, 2);
        volumen = (4 * Math.PI * Math.pow(radio, 3))/3;

        System.out.printf("Superfície: %.2f %n", superficie);
        System.out.printf("Volum: %.2f %n", volumen);

    }
}
