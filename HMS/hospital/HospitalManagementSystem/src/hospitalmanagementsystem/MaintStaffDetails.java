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
public class MaintStaffDetails extends AbstractTableModel {
    private static final String[] COLUMN_NAMES ={"Member ID","First Name", "Last Name", "Gender", "Contact Number"};    //coloum names of basic details 
    private static ArrayList<Employee>  list;
    
    MaintStaffDetails(ArrayList<Employee> msList){
        list = msList; 
    }

    @Override
    public int getRowCount() {
        return list.size();       //design number of rows the table
    }
    
    public String getColumnName(int columnIndex){
        return COLUMN_NAMES[columnIndex];   //set coloum names to the table
    }

    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;      //design number of coloums the table
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {    //set the details in the table getting one by one object from table of the database
         switch(columnIndex){ 
            case 0:return list.get(rowIndex).getEmpID();
            case 1:return list.get(rowIndex).getFirstName(); 
            case 2:return list.get(rowIndex).getLastName();
            case 3:return list.get(rowIndex).getGender();
            case 4:return list.get(rowIndex).getContactNumber();
            
           
            default:
                return "Error";
        }
    }
    
}
