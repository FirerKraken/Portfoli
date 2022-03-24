/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloc6;

/**
 *
 * @author bhugo
 */
public class ex2Class {
    private String isbn;
    private String titol;
    private String autor;
    private String editorial;
    private int numStock;
    private int preuLlibre;
    
    public ex2Class(){
    
    this.isbn = "";
    this.titol = "";
    this.autor = "";
    this.editorial = "";
    this.numStock = 0;
    this.preuLlibre = 0;
    }
    public ex2Class(String isbn, String titol, String autor, String editorial, int stock, int preu){
    this.isbn = isbn;
    this.titol = titol;
    this.autor = autor;
    this.editorial = editorial;
    this.numStock = stock;
    this.preuLlibre = preu;

    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitol() {
        return titol;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getNumStock() {
        return numStock;
    }

    public int getPreuLlibre() {
        return preuLlibre;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setNumStock(int numStock) {
        this.numStock = numStock;
    }

    public void setPreuLlibre(int preuLlibre) {
        this.preuLlibre = preuLlibre;
    }
    public void imprimeix(){
        System.out.println("ISBN: " + this.isbn );
        System.out.println("Titol: " + this.titol );
        System.out.println("Autor: " + this.autor );
        System.out.println("Editorial: " + this.editorial );
        System.out.println("Stock: " + this.numStock );
        System.out.println("Preu del llibre: " + this.preuLlibre );
    }
    public int sumValorLlibre(int valorFinal) {
        valorFinal = this.numStock * this.preuLlibre;
        System.out.println(valorFinal);
        return valorFinal;
    }
}
