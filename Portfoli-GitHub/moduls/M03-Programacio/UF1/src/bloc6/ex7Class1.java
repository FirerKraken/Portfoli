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
public class ex7Class1 {

    private String nom;
    private int edat;
    private int telefon;
    private String nomDepartament;

    public ex7Class1() {

        this.nom = "";
        this.edat = 0;
        this.telefon = 0;
        this.nomDepartament = "";
    }

    public ex7Class1(String nom, int edat, int telefon, String nomDepartament) {
        this.nom = nom;
        this.edat = edat;
        this.telefon = telefon;
        this.nomDepartament = nomDepartament;
    }

    public String getNom() {
        return nom;
    }

    public int getEdat() {
        return edat;
    }

    public int getTelefon() {
        return telefon;
    }

    public String getNomDepartament() {
        return nomDepartament;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public void setTelefon(int telefon) {

        this.telefon = telefon;
    }

    public void setNomDepartament(String nomDepartament) {
        this.nomDepartament = nomDepartament;
    }

    public void imprimeixClass1() {
        System.out.println("Nom: " + this.nom);
        System.out.println("Edat: " + this.edat);
        System.out.println("Telefon: " + this.telefon);
        System.out.println("Departament al qual pertany: " + this.nomDepartament);
    }
}
