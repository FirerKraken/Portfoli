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
public class ex1A {
    
    private String director;
    private String tipus;
    private String titol;
    
    public ex1A(){
        this.director = "";
        this.tipus = "";
        this.titol = "";
        
    }
    public ex1A(String director, String tipus, String titol){
    
        this.director = director;
        this.tipus = tipus;
        this.titol = titol;
    } 

    public String getDirector() {
        return director;
    }

    public String getTipus() {
        return tipus;
    }

    public String getTitol() {
        return titol;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }
   public void imprimeix() {
        System.out.println("Director: " + this.director );
        System.out.println("Tipus: " + this.tipus );
        System.out.println("Titol: " + this.titol );
        
    } 
}
