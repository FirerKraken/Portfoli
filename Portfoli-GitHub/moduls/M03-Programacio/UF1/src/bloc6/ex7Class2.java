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
public class ex7Class2 {

    private int hora;
    private int sueldo;
    private String nomEmpleat;


    public ex7Class2() {

        this.hora = 0;
        this.sueldo = 0;
        this.nomEmpleat = "";

        
    }

    public ex7Class2(int hora, int sueldo, String nomEmpleat) {
        this.hora = hora;
        this.sueldo = sueldo;
        this.nomEmpleat = nomEmpleat;

    }

    public String getNomEmpleat() {
        return nomEmpleat;
    }

    public void setNomEmpleat(String nomEmpleat) {
        this.nomEmpleat = nomEmpleat;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    
    @Override
    public String toString() {
        return "ex7Class2{" + "nom empleat = " + nomEmpleat + ", horas = " + hora + ", sueldo = " + sueldo + '}';
    }
    
}
