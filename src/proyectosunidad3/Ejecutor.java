/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectosunidad3;

import controller.CasasControlador;
import controller.LaberintoControlador;
import java.util.Random;

/**
 *
 * @author James
 */
public class Ejecutor {
     public static void main(String[] args) {
        /*CasasControlador CC = new CasasControlador();
        if (CC.registrar_casas("Pio Jaramillo", "Verde", 760, 8)) {
            System.out.println("Guardado con exito");
        } else {
            System.out.println("No se pudo guardar la data");
        }*/
        int n = 0;
        int[] arreglo = new int[n];
        n = 5;
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 2);
        }
        System.out.println(arreglo);
    }
}
