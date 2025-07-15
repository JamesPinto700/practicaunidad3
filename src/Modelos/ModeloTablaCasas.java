/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author James
 */
public class ModeloTablaCasas extends DefaultTableModel {

    private String[][] data;

    public String[][] getData() {
        return data;
    }

    public void setDatos(String[][] data) {
        this.data = data;
    }
    @Override
    public int getRowCount() {
        return 10;
    }
    
    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                return data[rowIndex][0];
            case 1:
                return data[rowIndex][1];
            case 2:
                return data[rowIndex][2];
            case 3:
                return data[rowIndex][3];
            case 4:
                return data[rowIndex][4];
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nro casa";
            case 1:
                return "Propietario";
            case 2:
                return "Color";
            case 3:
                return "Dimensiones";
            case 4:
                return "Nro de pisos";
            default:
                return null;
        }
    }

    

    
}
