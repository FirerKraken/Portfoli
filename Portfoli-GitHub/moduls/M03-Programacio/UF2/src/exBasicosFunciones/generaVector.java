/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exBasicosFunciones;


/**
 *
 * @author bhugo
 */
public class generaVector {
    static int[]arrayPrimers;
    
    public static void main(String[] args) {    
        int cont = 0; 
        arrayPrimers=new int[100];
        int primerNum=2;
        
        while(cont<100){            
            if(esNombrePrimer(primerNum)){
                arrayPrimers[cont]=primerNum;
                cont++;
            }
            primerNum++;          
        } 
        
        mostrarPrimos(); 
    }
    
    public static boolean esNombrePrimer(int primerNum){
        int cont = 2;
        boolean primer=true;
        while ((primer) && (cont!=primerNum)){
          if (primerNum % cont == 0)
            primer = false;
          cont++;
        }
        
        
        return primer;
    }
    
    public static void mostrarPrimos(){
        for(int i=0;i< 100;i++){
            System.out.print(arrayPrimers[i]+", ");
        }
    }
}
