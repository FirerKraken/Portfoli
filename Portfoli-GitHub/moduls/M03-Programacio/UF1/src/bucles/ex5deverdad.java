/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author bhugo
 */
public class ex5deverdad {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*Programa que mostra per pantalla les taules de multiplicar dels números compresos entre el 2 i el 10*/
        int mult = 2, cont = 2, num = 2;

        while ((cont >= 2) && (cont <= 10)) {
            System.out.println("Taula de multiplica del " + cont);
            num = mult * 1;
            System.out.print(num + ", ");
            num = mult * 2;
            System.out.print(num + ", ");
            num = mult * 3;
            System.out.print(num + ", ");
            num = mult * 4;
            System.out.print(num + ", ");
            num = mult * 5;
            System.out.print(num + ", ");
            num = mult * 6;
            System.out.print(num + ", ");
            num = mult * 7;
            System.out.print(num + ", ");
            num = mult * 8;
            System.out.print(num + ", ");
            num = mult * 9;
            System.out.print(num + ", ");
            num = mult * 10;
            System.out.println(num);
            mult++;
            cont++;
        }
    }
}
