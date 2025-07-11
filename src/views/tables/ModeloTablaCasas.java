/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views.tables;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author USUARIO
 */
public class ModeloTablaCasas extends AbstractTableModel {

    private String[][] datos;

    public String[][] getDatos() {
        return datos;
    }

    public void setDatos(String[][] datos) {
        this.datos = datos;
    }

    @Override
    public int getRowCount() {
        return datos.length;
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return datos[rowIndex][0];
            case 1:
                return datos[rowIndex][1];
            case 2:
                return datos[rowIndex][2];
            case 3:
                return datos[rowIndex][3];
            case 4:
                return datos[rowIndex][4];    
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nro";
            case 1:
                return "Direccion";
            case 2:
                return "Color";
            case 3:
                return "Dimencion m^2";
            case 4:
                return "Pisos";    
            default:
                return null;
        }
    }
}
