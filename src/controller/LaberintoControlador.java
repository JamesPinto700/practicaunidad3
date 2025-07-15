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
 * @author James
 */
public class LaberintoControlador {
     private Integer[][] matriz;

    public void setMatriz(Integer[][] matriz) {
        this.matriz = matriz;
    }
    
    public Integer[][] getMatriz(){
        return this.matriz;
    }

    public Integer [][] caminosparedes(int dimension) {
        //Integer rand = (int)(Math.random() * 2);
        Random rand = new Random();
        int devolverc = dimension;
        Integer [][] aux = new Integer [devolverc][dimension];        
            for(int i = 0; i < aux.length; i++) {
                for (int j = 0; j < aux[0].length; j++) {
                    aux[i][j] = rand.nextInt(2);
                }
            }
            LUtilidades.print(aux);        
        return aux;
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
        lc.caminosparedes(n);
    }
    
}
