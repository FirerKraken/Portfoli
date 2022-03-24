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
public class ex3Figures3D {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Scanner strg = new Scanner(System.in);

        String cilindre = "cilindre", hexaedre = "hexaedre", tetraedre = "tetraedre", esfera = "esfera", figura = "";
        double volumen = 0, superficie = 0;
        boolean sortir = false;

        while (sortir == false) {
            System.out.println("Quina figura 3D vols?");
            figura = strg.nextLine();

            if (figura.equalsIgnoreCase("cilindre")) {
                calculaCilindre(superficie, volumen, figura);
                sortir = true;
            } else if (figura.equalsIgnoreCase("hexaedre")) {
                calculaHexaedre(superficie, volumen, figura);
                sortir = true;
            } else if (figura.equalsIgnoreCase("tetraedre")) {
                calculaTetraedre(superficie, volumen, figura);
                sortir = true;
            } else if (figura.equalsIgnoreCase("esfera")) {
                calculaEsfera(superficie, volumen, figura);
                sortir = true;
            } else {
                System.out.println("Torna a intentar-ho");
            }
        }

    }

    public static void calculaCilindre(double superficie, double volumen, String figura) {
        Scanner in = new Scanner(System.in);
        double alto = 0, radio = 0;
        System.out.println("Dime el alto y el radio de el cilidro");
        System.out.println("Intro alto");
        alto = in.nextDouble();
        System.out.println("Intro radio");
        radio = in.nextDouble();

        superficie = (2 * Math.PI * radio * alto) + (2 * Math.PI * Math.pow(radio, 2));
        volumen = Math.PI * alto * Math.pow(radio, 2);

        System.out.println("La superficie del " + figura + " es de: " + superficie + "cm");
        System.out.println("El volumen del " + figura + " es de: " + volumen + "cm");
    }

    public static void calculaHexaedre(double superficie, double volumen, String figura) {
        Scanner in = new Scanner(System.in);
        double arista = 0;
        System.out.println("Dime la arista del hexaedro");
        arista = in.nextDouble();

        superficie = 6 * Math.pow(arista, 2);
        volumen = 6 * Math.pow(arista, 3);
        
        System.out.println("La superficie del " + figura + " es de: " + superficie + "cm");
        System.out.println("El volumen del " + figura + " es de: " + volumen + "cm");
    }

    public static void calculaTetraedre(double superficie, double volumen, String figura) {
        Scanner in = new Scanner(System.in);
        double lado = 0, altura = 0;
        System.out.println("Dime cuanto mide el lado de el " + figura);
        lado = in.nextDouble();

        altura = lado * Math.sqrt(6 / 3);
        superficie = Math.pow(lado, 2) * Math.sqrt(3);
        volumen = Math.pow(lado, 3) * (Math.sqrt(2) / 12);

        System.out.println("La superficie del " + figura + " es de: " + superficie + "cm");
        System.out.println("El volumen del " + figura + " es de: " + volumen + "cm");

    }

    public static void calculaEsfera(double superficie, double volumen, String figura) {
        Scanner in = new Scanner(System.in);
        double radio = 0;
        System.out.println("Dime cuanto mide el radio de la " + figura);
        radio = in.nextDouble();
        
        superficie = 4 * Math.PI * Math.pow(radio, 2);
        volumen = (4 * Math.PI * Math.pow(radio, 3))/3;

        System.out.println("La superficie de la " + figura + " es de: " + superficie + "cm");
        System.out.println("El volumen de la " + figura + " es de: " + volumen + "cm");

    }
}
