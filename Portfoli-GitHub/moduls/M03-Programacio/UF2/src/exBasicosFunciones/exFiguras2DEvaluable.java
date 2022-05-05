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
public class exFiguras2DEvaluable {
 

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String cuadrat = "q", triangle = "t", rectangle = "r", cercle = "c", figura = "";
        double perimetro = 0, superficie = 0;
        boolean sortir = false;

        while (sortir == false) {
            figura = in.nextLine();

            if (figura.equalsIgnoreCase(cuadrat)) {
                calculaCuadrat(perimetro, superficie, in);
            } else if (figura.equalsIgnoreCase(triangle)) {
                calculaTriangle(perimetro, superficie, in);
            } else if (figura.equalsIgnoreCase(rectangle)) {
                calculaRectangle(perimetro, superficie, in);
            } else if (figura.equalsIgnoreCase(cercle)) {
                calculaCercle(perimetro, superficie, in);
            } else if (figura.equalsIgnoreCase("S")){
                sortir = true;
            }
        }

    }

    public static void calculaCuadrat(double perimetro, double superficie, Scanner in) {
        double lado = 0;
        
        System.out.println("==Quadrat==");
        lado = in.nextDouble();
        perimetro = 4 * lado;
        superficie = lado * lado;
        
        System.out.printf("Perímetre : %.2f %n", perimetro);
        System.out.printf("Superfície: %.2f %n", superficie);
    }

    public static void calculaTriangle(double perimetro, double superficie, Scanner in) {

        double    lado  = 0, base = 0, altura = 0;
        
        System.out.println("==Triangle isòsceles==");
        lado = in.nextDouble();
        base = in.nextDouble();
        
        altura = Math.sqrt(Math.pow(lado, 2) - (Math.pow(base, 2) / 4));
        perimetro = 2 * lado + base;
        superficie = (base * altura ) / 2;
        
        System.out.printf("Perímetre : %.2f %n", perimetro);
        System.out.printf("Superfície: %.2f %n", superficie);
    }

    public static void calculaRectangle(double perimetro, double superficie, Scanner in) {

        double alto = 0, ancho = 0;
        
        System.out.println("==Rectangle==");
        alto = in.nextDouble();
        ancho = in.nextDouble();
        
        perimetro = 2 * (alto + ancho);
        superficie = alto * ancho;
        
        System.out.printf("Perímetre : %.2f %n", perimetro);
        System.out.printf("Superfície: %.2f %n", superficie);
    }

    public static void calculaCercle(double perimetro, double superficie, Scanner in) {
        
        double radio = 0;
        
        System.out.println("==Cercle==");
        radio = in.nextDouble();
        
        perimetro = Math.PI * radio * 2;
        superficie = Math.PI * Math.pow(radio, 2);
        
        System.out.printf("Perímetre : %.2f %n", perimetro);
        System.out.printf("Superfície: %.2f %n", superficie);
    }
}

    