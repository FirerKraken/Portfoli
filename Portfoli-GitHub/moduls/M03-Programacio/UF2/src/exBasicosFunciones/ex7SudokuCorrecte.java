/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exBasicosFunciones;

import java.util.Scanner;

/**
 *
 * @author bhugo
 */
public class ex7SudokuCorrecte {

    public static final int files = 9;
    public static final int columnes = 9;
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] sudoku = new int[files][columnes];
        boolean correcte = false;
        int fila = 0;        
        int columna = 0;        
        int filaInicial = 0, columnaInicial = 0;  
        sudoku = llegirSudoku();
        
        if ((esFilaValida(sudoku, fila)) && (esColumnaValida(sudoku,columna)) && (esRegioValida(sudoku, filaInicial, columnaInicial))){
         correcte = true;
        }
        if (correcte){
            System.out.println("Si");
        } else{
            System.out.println("No");
        }
    }

    public static int[][] llegirSudoku() {
        int[][] sudoku = new int[files][columnes];

        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                sudoku[i][j] = in.nextInt();
            }
        }
        return sudoku;
    }

    public static boolean esFilaValida(int[][] sudoku, int fila) {
        int[] test = new int[9];
        for (int c = 0; c < sudoku.length; c++) {
            if (test[sudoku[fila][c] - 1] == 1) {
                return false;
            }
            test[sudoku[fila][c] - 1] = 1;
        }
        return true;
    }
    public static boolean esColumnaValida(int[][] sudoku, int columna){
         int[] test = new int[9];
        for (int i = 0; i < sudoku.length; i++) {
            if (test[sudoku[i][columna]-1] == 1) return false;
            test[sudoku[i][columna]-1] = 1;
        }
        return true;
    }
    public static boolean esRegioValida(int[][] sudoku, int filaInicial, int columnaInicial){
        int max;
        int[] valores = {0, 3, 6, 0, 3, 6, 0, 3, 6};
        for (int l = 0; l < 9; l++) {
            filaInicial = columnaInicial = valores[l];
            max = filaInicial + 3;
            int[] test = new int[9];
            for (int i = filaInicial; i < max; i++) {
                for (int j = columnaInicial; j < max; j++) {
                    if (test[sudoku[i][j]-1] == 1) return false;
                    test[sudoku[i][j]-1] = 1;
                }
            }
        }
        return true;
    }


}
