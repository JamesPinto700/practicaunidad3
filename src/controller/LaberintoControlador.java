/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import utiles.LUtilidades;

/**
 *
 * @author USUARIO
 */
public class LaberintoControlador {

    private Integer[][] matriz;

    public void setMatriz(Integer[][] matriz) {
        this.matriz = matriz;
    }
    
    public Integer[][] getMatriz(){
        return this.matriz;
    }
    
    public static String convertirConDeepToString(Integer[][] matriz) {
        return Arrays.deepToString(matriz);
    }

    public Integer caminosparedes() {
        //Integer rand = (int)(Math.random() * 2);
        Random rand = new Random();
        if (matriz.length * matriz[0].length >= 9) {
            Integer[][] aux = new Integer [matriz.length][matriz.length];
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    matriz[i][j] = rand.nextInt(2);
                }
            }
            LUtilidades.print(matriz);
        }
        return null;
    }
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Ingrese la dimencion: ");
        n = sc.nextInt();
        Integer [][] m = new Integer [n][n];
        //Integer [][] m = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
        LaberintoControlador lc = new LaberintoControlador();
        lc.setMatriz(m);
        lc.caminosparedes();
    }
}
