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
public class ex2Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ex2Class[] libreria = new ex2Class[3];

        String isbn = "", titol = "", autor = "", editorial = "";
        int stock = 0, preu = 0;

        for (int i = 0; i < libreria.length; i++) {
            System.out.println("Intro ISBN:");
            isbn = in.nextLine();
            System.out.println("Intro titol:");
            titol = in.nextLine();
            System.out.println("Intro autor:");
            autor = in.nextLine();
            System.out.println("Intro editorial");
            editorial = in.nextLine();
            System.out.println("Intro Stock:");
            stock = in.nextInt();
            System.out.println("Intro preu;");
            preu = in.nextInt();

            libreria[i] = new ex2Class(isbn, titol, autor, editorial, stock, preu);
        }
        
        //A continuacio imprimirem el contingut de l'array llibres

        System.out.println("Info libreria:");
        imprimeixArray(libreria);
        //suma del valor de todos los libros de un tipo
        sumValor(libreria);
        //Pedimos un autor y lo comprobamos con los que tenemos ya guardados en el string
        System.out.println("Intro el autor que quieras buscar");
        String buscaAutor = in.nextLine();
        cercaInfo(buscaAutor, libreria);
        
        
        
    }
    public static void imprimeixArray(ex2Class[] llibre){
    
        for (int i = 0; i < llibre.length; i++) {
            System.out.println("Llibre: " + i);
            llibre[i].imprimeix();
            System.out.println("");
        }
    }
    public static void sumValor( ex2Class[] llibre){
    
        int valorLlibres = 0;
        for (int i = 0; i < llibre.length; i++) {
            valorLlibres += llibre[i].getNumStock() * llibre[i].getPreuLlibre();
            
            
        }
        System.out.println("El preu de tots els llibres de la llibreria es de: " + valorLlibres );
    }
    
    public static void cercaInfo(String buscaAutor, ex2Class[] llibre){
        
        for (int i = 0; i < llibre.length; i++) {
            if(llibre[i].getAutor().equals(buscaAutor)){
                llibre[i].imprimeix();
            }
        }
    }
}
