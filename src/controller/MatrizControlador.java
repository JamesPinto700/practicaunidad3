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
public class MatrizControlador {

    private Integer[][] matriz;

    public void setMatriz(Integer[][] matriz) {
        this.matriz = matriz;
    }

    public Integer[][] getMatriz() {
        return this.matriz;
    }

    public Integer[][] llenar(int filas, int columnas) {
        //Integer rand = (int)(Math.random() * 2);
        Random rand = new Random();
        Integer[][] aux = new Integer[filas][columnas];
        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux[0].length; j++) {
                aux[i][j] = 0;
            }
        }
        LUtilidades.print(aux);
        return aux;
    }

    public boolean verificarprimo(int numero) {
        if (numero <= 1) {
            return false;
        } else if (numero == 2) {
            return true;
        } else if (numero % 2 == 0) {
            return false;
        } 
        for (int i = 3; i * i <= numero; i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Ingrese la dimencion: ");
        n = sc.nextInt();
        Integer[][] m = new Integer[n][n];
        //Integer [][] m = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
        MatrizControlador lc = new MatrizControlador();
        lc.setMatriz(m);
        
    }

}
