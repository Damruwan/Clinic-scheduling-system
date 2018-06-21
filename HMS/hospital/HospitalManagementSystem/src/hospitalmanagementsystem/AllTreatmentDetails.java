/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author AMSA Damruwan
 */
public class AllTreatmentDetails extends AbstractTableModel{
    private static final String[] COLUMN_NAMES ={"Treatment ID", "Treatment", "Prescribe Year", "Prescribe Month", "Prescribe Date", "Result", "Treatment Amount"};  //coloum names of basic details 
    private static ArrayList<Treatment>  list;
    
    AllTreatmentDetails(ArrayList<Treatment> atrList){
        list = atrList; 
    }

    @Override
    public int getRowCount() {
        return list.size();     //design number of rows the table
    }
    
    public String getColumnName(int columnIndex){
        return COLUMN_NAMES[columnIndex];      //set coloum names to the table
    }

    @Override
    public int getColumnCount() {
       return COLUMN_NAMES.length;    //design number of coloums the table
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {      //set the details in the table getting one by one object from table of the database
        switch(columnIndex){ 
            case 0:return list.get(rowIndex).getTreatmentID();
            case 1:return list.get(rowIndex).getTreatment(); 
            case 2:return list.get(rowIndex).getPrescribeYear();
            case 3:return list.get(rowIndex).getPrescribeMonth();
            case 4:return list.get(rowIndex).getPrescribeDate();
            case 5:return list.get(rowIndex).getResult();
            case 6:return list.get(rowIndex).getTreatmentAmount();
            default:
                return "Error";
        }
    }
    
}
