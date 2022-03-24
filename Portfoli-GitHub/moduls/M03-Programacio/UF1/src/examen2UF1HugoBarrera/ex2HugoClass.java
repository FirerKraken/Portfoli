/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2UF1HugoBarrera;

/**
 *
 * @author bhugo
 */
public class ex2HugoClass {
    /*Exercici 2. 6 p

      Som aficionats a la meteorologia i recollim informació de 10 estacions meteorològiques d'arreu del món a la mateixa hora. ( Pots 
      introduir directament la informació per codi). Emmagatzemem Pais (String), Regió (String), temperatura (int) i pressió 
      atmosfèrica(float). Una vegada introduïda la informació volem:

      Saber la ubicació amb la temperatura més alta (regió i país al que pertany) (1,5 punt)
      Quants  estacions tenim a cada país (3,0 punt)
      Introduint les 4 informacions per teclat,  comprovar si aquesta estació ( pais i regió) ja està introduïda. Si ho està, 
      actualitzar temperatura i pressió atmosfèrica, Si no ho està indicar-ho
      NOTA: A cada pais i regió només hi ha una estació*/

    private String pais;
    private String regio;
    private int temperatura;
    private float presioAtm;

    public ex2HugoClass() {
        this.pais = "";
        this.regio = "";
        this.temperatura = 0;
        this.presioAtm = 0;
    }

    public ex2HugoClass(String pais, String regio, int temperatura, float presioAtm) {
        this.pais = pais;
        this.regio = regio;
        this.temperatura = temperatura;
        this.presioAtm = presioAtm;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getRegio() {
        return regio;
    }

    public void setRegio(String regio) {
        this.regio = regio;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public float getPresioAtm() {
        return presioAtm;
    }

    public void setPresioAtm(float presioAtm) {
        this.presioAtm = presioAtm;
    }

    @Override
    public String toString() {
        return "ex2HugoClass{" + "pais=" + pais + ", regio=" + regio + ", temperatura=" + temperatura + ", presioAtm=" + presioAtm + '}';
    }
    
    

}
