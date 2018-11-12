/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.modelosTabla;

import java.util.ArrayList;
import java.util.List;
import javax.swing.RowSorter.SortKey;
import javax.swing.SortOrder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.TableView;

/**
 *
 * @author dbarriof
 */
public class ModelosTabla{
    
    //Modelo de tabla para corredores
    public static DefaultTableModel tablaCorredor(){
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new String [] {"Nombre","Dni","Fecha Nac.","Dirección","Teléfono"});
        return dtm;
    }
    
    
    //Modelo de tabla para carreras
    public static DefaultTableModel tablaParticipante(){
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new String [] {"Dorsal","Nombre","Dni","Tiempo","Pos. Final"});
        return dtm;
    }
    
    public static TableRowSorter ordenaTabla(DefaultTableModel dtm, int col){
       TableRowSorter ordenador = new TableRowSorter(dtm);     
       List<SortKey> sortKeys = new ArrayList<>();
       sortKeys.add(new SortKey(col, SortOrder.ASCENDING));
       ordenador.setSortKeys(sortKeys);
       
       return ordenador;
    }
    
}