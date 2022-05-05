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
public class ex2Figures2D {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Scanner strg = new Scanner(System.in);

        String cuadrat = "cuadrat", triangle = "triangle", rectangle = "rectangle", cercle = "cercle", figura = "";
        double perimetro = 0, superficie = 0;
        boolean sortir = false;

        while (sortir == false) {
            System.out.println("Quina figura 2D vols?");
            figura = strg.nextLine();

            if (figura.equalsIgnoreCase(cuadrat)) {
                calculaCuadrat(perimetro, superficie);
                sortir = true;
            } else if (figura.equalsIgnoreCase(triangle)) {
                calculaTriangle(perimetro, superficie);
                sortir = true;
            } else if (figura.equalsIgnoreCase(rectangle)) {
                calculaRectangle(perimetro, superficie);
                sortir = true;
            } else if (figura.equalsIgnoreCase(cercle)) {
                calculaCercle(perimetro, superficie);
                sortir = true;
            } else {
                System.out.println("Torna a intentar-ho");
            }
        }

    }

    public static void calculaCuadrat(double perimetro, double superficie) {
        Scanner in = new Scanner(System.in);
        double lado = 0;
        
        System.out.println("Dime cuanto mide el lado de el cuadrado");
        lado = in.nextDouble();
        perimetro = 4 * lado;
        superficie = lado * lado;
        System.out.println("El perimetro de el cuarado es de : " + perimetro);
        System.out.println("La superficie de el cuarado es de : " + superficie);

    }

    public static void calculaTriangle(double perimetro, double superficie) {

        Scanner in = new Scanner(System.in);
        double    lado  = 0, base = 0, altura = 0;
        
        System.out.println("Dime el alto y el ancho");
        System.out.println("intro alto:");
        lado = in.nextDouble();
        System.out.println("intro ancho:");
        base = in.nextDouble();
        
        altura = Math.sqrt(Math.pow(lado, 2) - (Math.pow(base, 2) / 4));
        perimetro = 2 * lado + base;
        superficie = (base * altura ) / 2;
        System.out.println("El perimetro de el triangulo es de : " + perimetro);
        System.out.println("La superficie de el triangulo es de : " + superficie);
    }

    public static void calculaRectangle(double perimetro, double superficie) {
        Scanner in = new Scanner(System.in);
        double alto = 0, ancho = 0;
        
        System.out.println("Dime el alto y el ancho del rectangulo");
        System.out.println("intro alto:");
        alto = in.nextDouble();
        System.out.println("intro ancho:");
        ancho = in.nextDouble();
        
        perimetro = 2 * (alto + ancho);
        superficie = alto * ancho;
        System.out.println("El perimetro de el rectangulo es de : " + perimetro);
        System.out.println("La superficie de el rectangulo es de : " + superficie);
    }

    public static void calculaCercle(double perimetro, double superficie) {
        Scanner in = new Scanner(System.in);
        double radio = 0;
        
        System.out.println("Intro radio de el circulo");
        radio = in.nextDouble();
        
        perimetro = Math.PI * radio * 2;
        superficie = Math.PI * Math.pow(radio, 2);
        System.out.println("El perimetro de el circulo es de : " + perimetro);
        System.out.println("La superficie de el circulo es de : " + superficie);
    }
}
