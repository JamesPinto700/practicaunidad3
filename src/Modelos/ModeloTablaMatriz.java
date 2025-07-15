/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import controller.LaberintoControlador;
import javax.swing.table.AbstractTableModel;
import views.Laberinto;

/**
 *
 * @author James
 */
public class ModeloTablaMatriz extends AbstractTableModel {
    private Integer [][] data;
    public Integer[][] getData(Integer[][]data) {
        return data;
    }

    public void setLaberinto(Integer[][]data) {
        this.data = data;
    }
    
    @Override
    public int getRowCount() {
        return data.length;        
    }

    @Override
    public int getColumnCount() {
        return data[0].length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            default:
                return data[rowIndex][columnIndex];
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        data[rowIndex][columnIndex] = Integer.parseInt(aValue.toString());
        fireTableChanged();
    }

    private void fireTableChanged() {
    }

}
