/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloc4;

import java.util.Scanner;

/**
 *
 * @author bhugo
 */
public class ex19 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner str = new Scanner(System.in);

        int trabajador, horasTrabajadas, preguntaSalir, turno = 0;
        double totalCobrado = 0, precioHora = 30, salarioSinImpuestos = 0;
        String NomTrabajador = null;
        boolean salir = false, turnoCorrecto = false;

        for (int i = 0; salir == false; i++) {
            turnoCorrecto = false;
            if (i == 0) {
                System.out.println("Dime el nombre del trabajador del cual quieres saber el salario");
                NomTrabajador = str.nextLine();
            } else {
                System.out.println("Quedan mas trabajadores de los cuales quieras saber el salario?");
                System.out.println("Escribe 0 si deseas continuar, o -1 si en cambio deseas salir");
                preguntaSalir = in.nextInt();
                if (preguntaSalir == -1) {
                    salir = true;
                }
            }

            if (i != 0) {
                System.out.println("Dime el nombre de otro trabajador");
                NomTrabajador = str.nextLine();
            }

            System.out.println("Cuantas horas ha trabajado " + NomTrabajador + "?");
            horasTrabajadas = in.nextInt();

            while (turnoCorrecto == false) {
                System.out.println("En que turno trabaja " + NomTrabajador + "?");
                System.out.println("Escribe 1 si es de mañana, 2 si es de tarde o 3 si es de noche dependiendo de el turno en el que trabaje");
                turno = in.nextInt();
                if (turno == 1) {
                    System.out.println("trabaja de mañana");
                    salarioSinImpuestos = precioHora * horasTrabajadas;
                    turnoCorrecto = true;
                } else if (turno == 2) {
                    System.out.println("trabaja de tarde");
                    precioHora = (double) (precioHora * 1.2);
                    salarioSinImpuestos = (double) (precioHora * horasTrabajadas);
                    turnoCorrecto = true;
                } else if (turno == 3) {
                    System.out.println("Trabaja de noche");
                    precioHora = (double) (precioHora * 1.5);
                    salarioSinImpuestos = (double) (precioHora * horasTrabajadas);
                    turnoCorrecto = true;
                } else {
                    System.out.println("Respuesta erronea. Vuelve a intentarlo");
                }
            }

            if (salarioSinImpuestos > 700) {
                totalCobrado = salarioSinImpuestos * 0.92;
            } else if ((salarioSinImpuestos >= 700) && (salarioSinImpuestos <= 1100)) {
                totalCobrado = salarioSinImpuestos * 0.90;
            } else if (salarioSinImpuestos > 1100) {
                totalCobrado = salarioSinImpuestos * 0.88;
            }
            System.out.println(NomTrabajador + " esta semana ha cobrado un total de: " + totalCobrado);
        }
    }
}
