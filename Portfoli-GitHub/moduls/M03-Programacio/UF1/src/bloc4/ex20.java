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
public class ex20 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner str = new Scanner(System.in);

        String NomTrabajador = null, fi = "";
        boolean salir = false;
        int añosTrabajando = 0;
        
        
        for (int i = 0; salir == false; i++) {
            if (i == 0) {
                System.out.println("Dime el nombre del trabajador del cual quieres saber el bonus que se llevara");
                NomTrabajador = str.nextLine();
            } else if (i != 0){
                System.out.println("Deseas terminar de calcular bonus de los trabajadores?");
                System.out.println("Escribe FI para salir, o NO para continuar");
                fi = str.nextLine();
                if (fi == "NO"){
                System.out.println("Dime el nombre de otro trabajador");
                NomTrabajador = str.nextLine();
                } else if(fi == "FI"){
                    salir = true;
                }
            }
            
            System.out.println("Cuantos años lleva trabajando " + NomTrabajador + " en la empresa?");
            añosTrabajando = in.nextInt();
            
            if ((añosTrabajando >= 2)&& ( añosTrabajando < 10)){ 
                System.out.println(NomTrabajador + "cobrara un total de 300€ por el aniversario de la empresa");
            }else if ((añosTrabajando >= 10) && (añosTrabajando <15)){
                System.out.println(NomTrabajador + "cobrara un total de 400€ por el aniversario de la empresa");
            } else if (añosTrabajando >= 15){
                System.out.println(NomTrabajador + "cobrara un total de 700€ por el aniversario de la empresa");
            } else if ( añosTrabajando < 3){
                System.out.println(NomTrabajador + " no tendra una bonificacion por el aniversario de la empresa");
            }

        }
    }
}
