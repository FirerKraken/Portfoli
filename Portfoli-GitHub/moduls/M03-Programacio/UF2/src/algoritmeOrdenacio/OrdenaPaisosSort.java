/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmeOrdenacio;


import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author bhugo
 */
public class OrdenaPaisosSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String num;
        num = in.nextLine();
        int posicion = Integer.parseInt(num); 
        String[] paisos = new String[posicion];
        
        for (int i = 0; i < paisos.length; i++) {
            paisos[i] = in.nextLine();
        }

        List<String> paisosList = Arrays.asList(paisos);
        
        Collections.sort(paisosList);
        
        paisos = paisosList.toArray(new String[0]);
        
        System.out.println("Països ordenats:");
        for (int i = 0; i < paisos.length; i++) {
            System.out.println(paisos[i]);
        }
    }
}
