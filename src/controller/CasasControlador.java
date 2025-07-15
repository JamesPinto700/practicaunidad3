/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import utiles.CUtilidades;

/**
 *
 * @author James
 */
public class CasasControlador {
     CUtilidades U = new CUtilidades();
    private String file_name = "registro.casas";
    public boolean registrar_casas (String direccion, String color, int dimencion, int pisos) {
        String data = numero_casas()+"\t"+direccion+"\t"+color+"\t"+dimencion+"\t"+pisos+"\n";
        try {
            U.save(data, file_name);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    public String [][] listar (){
        try {
            return U.listAll(file_name);
        } catch (IOException e) {
            System.out.println("Error en listar "+e);
            return null;
        }
    }
    
    public String numero_casas(){
        String numero = "";
        String [][] listado = listar();
        if (listado != null) {
            Integer num = 0;
            num = listado.length + 1;
            numero = "00";
            numero = numero.substring(num.toString().length());
            numero += num.toString();
        }else{
            numero = "01";
        }
        return numero;
    }
}
