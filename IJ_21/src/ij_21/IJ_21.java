/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ij_21;

/**
 *
 * @author Larry
 */
public class IJ_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] M = new int [10][10];
        int [][] P = new int [3][3];
        P [0][0] = 31;
        P [0][1] = 41;
        P [0][2] = 14;
        P [1][0] = 21;
        P [1][1] = 61;
        P [1][2] = 71;
        P [2][0] = 31;
        P [2][1] = 51;
        P [2][2] = 61;
        RM(M);
        System.out.println("--- MATRIZ 10x10 ---");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(M[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("--- MATRIZ 3x3 ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(P[i][j]+" ");
            }
            System.out.println("");
        }
        Comprobador(M,P);
    }
    public static void Comprobador(int [][] M,int [][] P){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (M[i][j]==P[0][0]){
                    int x = i;
                    int z = j;
                    if (M[i][j+1]==P[0][1]){ {
                        if (M[i][j+2]==P[0][2]) {
                            if (M[i+1][j]==P[1][0]) {
                                if (M[i+1][j+1]==P[1][1]) {
                                    if (M[i+1][j+2]==P[1][2]) {
                                        if (M[i+2][j]==P[2][0]) {
                                            if (M[i+2][j+1]==P[2][1]) {
                                                if (M[i+2][j+2]==P[2][2]) {
                                                    System.out.println("");
                                                    System.out.println("SE HA ENCONTRADO LA SUBMATRIZ");
                                                    System.out.print("COORDENADAS DEL PRIMER ELEMENTO DE P --> ["+x+"] ["+z+"]");
                                                    System.out.println("");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    }
    public static int RM(int [][] matriz){
        matriz [0][0] = 15;
        matriz [0][1] = 26;
        matriz [0][2] = 36;
        matriz [0][3] = 47;
        matriz [0][4] = 54;
        matriz [0][5] = 64;
        matriz [0][6] = 72;
        matriz [0][7] = 81;
        matriz [0][8] = 95;
        matriz [0][9] = 10;
        matriz [1][0] = 11;
        matriz [1][1] = 12;
        matriz [1][2] = 13;
        matriz [1][3] = 21;
        matriz [1][4] = 22;
        matriz [1][5] = 67;
        matriz [1][6] = 20;
        matriz [1][7] = 10;
        matriz [1][8] = 61;
        matriz [1][9] = 56;
        matriz [2][0] = 54;
        matriz [2][1] = 34;
        matriz [2][2] = 45;
        matriz [2][3] = 65;
        matriz [2][4] = 34;
        matriz [2][5] = 54;
        matriz [2][6] = 54;
        matriz [2][7] = 34;
        matriz [2][8] = 54;
        matriz [2][9] = 95;
        matriz [3][0] = 87;
        matriz [3][1] = 55;
        matriz [3][2] = 98;
        matriz [3][3] = 32;
        matriz [3][4] = 21;
        matriz [3][5] = 65;
        matriz [3][6] = 87;
        matriz [3][7] = 98;
        matriz [3][8] = 65;
        matriz [3][9] = 32;
        matriz [4][0] = 14;
        matriz [4][1] = 98;
        matriz [4][2] = 78;
        matriz [4][3] = 12;
        matriz [4][4] = 36;
        matriz [4][5] = 45;
        matriz [4][6] = 67;
        matriz [4][7] = 78;
        matriz [4][8] = 98;
        matriz [4][9] = 78;
        matriz [5][0] = 45;
        matriz [5][1] = 12;
        matriz [5][2] = 15;
        matriz [5][3] = 65;
        matriz [5][4] = 89;
        matriz [5][5] = 90;
        matriz [5][6] = 75;
        matriz [5][7] = 25;
        matriz [5][8] = 89;
        matriz [5][9] = 23;
        matriz [6][0] = 32;
        matriz [6][1] = 12;
        matriz [6][2] = 98;
        matriz [6][3] = 45;
        matriz [6][4] = 14;
        matriz [6][5] = 22;
        matriz [6][6] = 26;
        matriz [6][7] = 71;
        matriz [6][8] = 11;
        matriz [6][9] = 91;
        matriz [7][0] = 31;
        matriz [7][1] = 31;
        matriz [7][2] = 41;
        matriz [7][3] = 14;
        matriz [7][4] = 91;
        matriz [7][5] = 41;
        matriz [7][6] = 41;
        matriz [7][7] = 41;
        matriz [7][8] = 51;
        matriz [7][9] = 61;
        matriz [8][0] = 71;
        matriz [8][1] = 21;
        matriz [8][2] = 61;
        matriz [8][3] = 71;
        matriz [8][4] = 21;
        matriz [8][5] = 31;
        matriz [8][6] = 71;
        matriz [8][7] = 31;
        matriz [8][8] = 81;
        matriz [8][9] = 31;
        matriz [9][0] = 21;
        matriz [9][1] = 31;
        matriz [9][2] = 51;
        matriz [9][3] = 61;
        matriz [9][4] = 21;
        matriz [9][5] = 31;
        matriz [9][6] = 71;
        matriz [9][7] = 81;
        matriz [9][8] = 16;
        matriz [9][9] = 14;
        return matriz[0][0];
    }
}
