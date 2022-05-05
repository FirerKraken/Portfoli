/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmeOrdenacio;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author bhugo
 */
public class preubasArrayList {

    public static void main(String[] args) {
        
        ArrayList<Integer> listaNum = new ArrayList<Integer>();
        listaNum.add(3);
        listaNum.add(2);
        listaNum.add(4);
        
        
        System.out.println(listaNum);
        Collections.sort(listaNum);
        System.out.println(listaNum);
        Collections.sort(listaNum, Collections.reverseOrder());
        System.out.println(listaNum);
    }

}
