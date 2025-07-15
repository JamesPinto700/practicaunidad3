/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodigoCorregido;

/**
 *
 * @author nicof
 */
public class Codigo {
    public static void main(String[] args) {
        int x = 0;
        String[] tabla = {"10", "10", "10", "10", "10", "10", "10", "10", "10", "10"};
        for (x = 0; x < tabla.length-1; x++){ 
            tabla[x] = String.valueOf(x); 
    }
        int j = 0;
        int k = 0;
        for (x = 0; j <= tabla.length-1; x++){
		for (j = 0; j <= tabla.length-1; j++){
			for (k = 0; k <= tabla.length-1; k++){
				System.out.printf(x+"\t", tabla[x]);
                                System.out.printf(j+"\t", tabla[j]);
                                System.out.printf(k+"\t", tabla[k]);
			}
			        System.out.println("\n");
		}	
	}

  }
}
