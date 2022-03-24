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
public class ex6ComptadorMines {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int cont = 0;

        int[][] buscaMinas = new int[3][5];
        buscaMinas[0][0] = 0;
        buscaMinas[0][1] = 0;
        buscaMinas[0][2] = -1;
        buscaMinas[0][3] = 0;
        buscaMinas[0][4] = 0;
        buscaMinas[1][0] = -1;
        buscaMinas[1][1] = -1;
        buscaMinas[1][2] = 0;
        buscaMinas[1][3] = -1;
        buscaMinas[1][4] = 0;
        buscaMinas[2][0] = 0;
        buscaMinas[2][1] = 0;
        buscaMinas[2][2] = 0;
        buscaMinas[2][3] = -1;
        buscaMinas[2][4] = -1;

        for (int i = 0; i < buscaMinas.length; i++) {
            for (int j = 0; j < buscaMinas[i].length; j++) {
                System.out.print(buscaMinas[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        for (int i = 0; i < buscaMinas.length; i++) {
            cont = 0;
            for (int j = 0; j < buscaMinas[i].length; j++) {
                if (buscaMinas[i][j] == 0) {
                    if (i == 0) {
                        if (j == 0) {
                            if ((buscaMinas[i][j + 1] == -1)
                                    || (buscaMinas[i + 1][j] == -1) || (buscaMinas[i + 1][j + 1] == -1)) {
                                for (int k = 0; k < 4; k++) {
                                    switch (k) {

                                        case 1:
                                            if ((buscaMinas[i][j + 1] == -1)) {
                                                cont++;
                                            }
                                            break;
                                        case 2:
                                            if ((buscaMinas[i + 1][j] == -1)) {
                                                cont++;
                                            }
                                            break;
                                        case 3:
                                            if ((buscaMinas[i + 1][j + 1] == -1)) {
                                                cont++;
                                            }
                                            break;
                                    }

                                }
                                buscaMinas[i][j] = cont;
                            }
                        } else if (j == 4) {
                            if ((buscaMinas[i][j - 1] == -1)
                                    || (buscaMinas[i + 1][j] == -1) || (buscaMinas[i + 1][j - 1] == -1)) {
                                for (int k = 0; k < 4; k++) {
                                    switch (k) {

                                        case 1:
                                            if ((buscaMinas[i][j - 1] == -1)) {
                                                cont++;
                                            }
                                            break;
                                        case 2:
                                            if ((buscaMinas[i + 1][j] == -1)) {
                                                cont++;
                                            }
                                            break;
                                        case 3:
                                            if ((buscaMinas[i + 1][j - 1] == -1)) {
                                                cont++;
                                            }
                                            break;
                                    }

                                }
                                buscaMinas[i][j] = cont;
                            }

                        } else {
                            if ((buscaMinas[i][j - 1] == -1) || (buscaMinas[i][j + 1] == -1)
                                    || (buscaMinas[i + 1][j - 1] == -1) || (buscaMinas[i + 1][j] == -1) || (buscaMinas[i + 1][j + 1] == -1)) {
                                for (int k = 0; k < 6; k++) {
                                    switch (k) {

                                        case 1:
                                            if (buscaMinas[i][j - 1] == -1) {
                                                cont++;
                                            }
                                            break;
                                        case 2:
                                            if (buscaMinas[i][j + 1] == -1) {
                                                cont++;
                                            }
                                            break;
                                        case 3:
                                            if (buscaMinas[i + 1][j - 1] == -1) {
                                                cont++;
                                            }
                                            break;
                                        case 4:
                                            if (buscaMinas[i + 1][j] == -1) {
                                                cont++;
                                            }
                                            break;
                                        case 5:
                                            if (buscaMinas[i + 1][j + 1] == -1) {
                                                cont++;
                                            }
                                            break;
                                    }
                                    buscaMinas[i][j] = cont;
                                }
                            }

                        }
                    } else if (i == 2) {

                        if (j == 0) {
                            if ((buscaMinas[i][j + 1] == -1)
                                    || (buscaMinas[i - 1][j] == -1) || (buscaMinas[i - 1][j + 1] == -1)) {
                                for (int k = 0; k < 4; k++) {
                                    switch (k) {

                                        case 1:
                                            if (buscaMinas[i][j + 1] == -1) {
                                                cont++;
                                            }
                                            break;
                                        case 2:
                                            if (buscaMinas[i - 1][j] == -1) {
                                                cont++;
                                            }
                                            break;
                                        case 3:
                                            if (buscaMinas[i - 1][j + 1] == -1) {
                                                cont++;
                                            }
                                            break;
                                    }

                                }
                                buscaMinas[i][j] = cont;

                            }
                        }else if (j == 4) {
                                if ((buscaMinas[i][j - 1] == -1)
                                        || (buscaMinas[i - 1][j] == -1) || (buscaMinas[i - 1][j - 1] == -1)) {
                                    for (int k = 0; k < 4; k++) {
                                        switch (k) {

                                            case 1:
                                                if (buscaMinas[i][j - 1] == -1) {
                                                    cont++;
                                                }
                                                break;
                                            case 2:
                                                if (buscaMinas[i - 1][j] == -1) {
                                                    cont++;
                                                }
                                                break;
                                            case 3:
                                                if (buscaMinas[i - 1][j - 1] == -1) {
                                                    cont++;
                                                }
                                                break;
                                        }

                                    }
                                }
                                buscaMinas[i][j] = cont;
                            } else {
                                if ((buscaMinas[i][j - 1] == -1) || (buscaMinas[i][j + 1] == -1)
                                        || (buscaMinas[i - 1][j - 1] == -1) || (buscaMinas[i - 1][j] == -1) || (buscaMinas[i - 1][j + 1] == -1)) {
                                    for (int k = 0; k < 6; k++) {
                                        switch (k) {

                                            case 1:
                                                if (buscaMinas[i][j - 1] == -1) {
                                                    cont++;
                                                }
                                                break;
                                            case 2:
                                                if (buscaMinas[i][j + 1] == -1) {
                                                    cont++;
                                                }
                                                break;
                                            case 3:
                                                if (buscaMinas[i - 1][j - 1] == -1) {
                                                    cont++;
                                                }
                                                break;
                                            case 4:
                                                if (buscaMinas[i - 1][j] == -1) {
                                                    cont++;
                                                }
                                                break;
                                            case 5:
                                                if (buscaMinas[i - 1][j + 1] == -1) {
                                                    cont++;
                                                }
                                                break;
                                        }
                                    }
                                }
                                buscaMinas[i][j] = cont;
                            }
                    } else {
                        if (j == 0) {
                            if ((buscaMinas[i][j + 1] == -1)
                                    || (buscaMinas[i - 1][j] == -1) || (buscaMinas[i - 1][j + 1] == -1)
                                    || (buscaMinas[i + 1][j] == -1) || (buscaMinas[i + 1][j + 1] == -1)) {
                                for (int k = 0; k < 6; k++) {
                                    switch (k) {

                                        case 1:
                                            if (buscaMinas[i][j + 1] == -1) {
                                                cont++;
                                            }
                                            break;
                                        case 2:
                                            if (buscaMinas[i - 1][j] == -1) {
                                                cont++;
                                            }
                                            break;
                                        case 3:
                                            if (buscaMinas[i - 1][j + 1] == -1) {
                                                cont++;
                                            }
                                            break;
                                        case 4:
                                            if (buscaMinas[i + 1][j] == -1) {
                                                cont++;
                                            }
                                            break;
                                        case 5:
                                            if (buscaMinas[i + 1][j + 1] == -1) {
                                                cont++;
                                            }
                                            break;
                                    }

                                }
                                buscaMinas[i][j] = cont;
                            } else if (j == 4) {
                                if ((buscaMinas[i][j - 1] == -1)
                                        || (buscaMinas[i - 1][j] == -1) || (buscaMinas[i - 1][j - 1] == -1)
                                        || (buscaMinas[i + 1][j] == -1) || (buscaMinas[i + 1][j - 1] == -1)) {
                                    for (int k = 0; k < 6; k++) {
                                        switch (k) {

                                            case 1:
                                                if (buscaMinas[i][j - 1] == -1) {
                                                    cont++;
                                                }
                                                break;
                                            case 2:
                                                if (buscaMinas[i - 1][j] == -1) {
                                                    cont++;
                                                }
                                                break;
                                            case 3:
                                                if (buscaMinas[i - 1][j - 1] == -1) {
                                                    cont++;
                                                }
                                                break;
                                            case 4:
                                                if (buscaMinas[i + 1][j] == -1) {
                                                    cont++;
                                                }
                                                break;
                                            case 5:
                                                if (buscaMinas[i + 1][j - 1] == -1) {
                                                    cont++;
                                                }
                                                break;
                                        }

                                    }
                                    buscaMinas[i][j] = cont;
                                }
                            } else {
                                if ((buscaMinas[i][j - 1] == -1) || (buscaMinas[i][j + 1] == -1)
                                    || (buscaMinas[i - 1][j - 1] == -1) || (buscaMinas[i - 1][j] == -1) || (buscaMinas[i - 1][j + 1] == -1)
                                    || (buscaMinas[i + 1][j - 1] == -1) || (buscaMinas[i + 1][j] == -1) || (buscaMinas[i + 1][j + 1] == -1)) {
                                    for (int k = 0; k < 9; k++) {
                                        switch (k) {

                                            case 1:
                                                if (buscaMinas[i][j - 1] == -1) {
                                                    cont++;
                                                }
                                                break;
                                            case 2:
                                                if (buscaMinas[i][j + 1] == -1) {
                                                    cont++;
                                                }
                                                break;
                                            case 3:
                                                if (buscaMinas[i - 1][j - 1] == -1) {
                                                    cont++;
                                                }
                                                break;
                                            case 4:
                                                if (buscaMinas[i - 1][j] == -1) {
                                                    cont++;
                                                }
                                                break;
                                            case 5:
                                                if (buscaMinas[i - 1][j + 1] == -1) {
                                                    cont++;
                                                }
                                                break;
                                            case 6:
                                                if (buscaMinas[i + 1][j - 1] == -1) {
                                                    cont++;
                                                }
                                                break;
                                            case 7:
                                                if (buscaMinas[i + 1][j] == -1) {
                                                    cont++;
                                                }
                                                break;
                                            case 8:
                                                if (buscaMinas[i + 1][j + 1] == -1) {
                                                    cont++;
                                                }
                                                
                                                break;
                                        }
                                    }
                                    buscaMinas[i][j] = cont;
                                }
                            }
                            }

                        }

                    }
                cont = 0;
                }
            }
        
        System.out.println("----------------------");
        for (int i = 0; i < buscaMinas.length; i++) {
            for (int j = 0; j < buscaMinas[i].length; j++) {
                System.out.print(buscaMinas[i][j]);
                System.out.print("  |  ");
            }
            System.out.println("");
        }
        }
    }
