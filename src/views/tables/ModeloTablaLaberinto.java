/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views.tables;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author James Pinto
 */
public class ModeloTablaLaberinto extends AbstractTableModel{
    
    private String [][] laberinto;

    public String[][] getLaberinto() {
        return laberinto;
    }

    public void setLaberinto(String[][] laberinto) {
        this.laberinto = laberinto;
    }

    @Override
    public int getRowCount() {
        return laberinto.length;
    }

    @Override
    public int getColumnCount() {
        return laberinto[0].length;
    }

    @Override
    public Object getValueAt(int i, int j) {
        return laberinto[i][j];
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        laberinto[rowIndex][columnIndex] = Integer.parseInt(aValue.toString());
        fireTableDataChanged();
    }
    
    
}
