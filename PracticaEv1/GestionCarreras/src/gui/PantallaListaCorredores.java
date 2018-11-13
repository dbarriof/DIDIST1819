/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Dto.Carrera;
import Dto.Corredor;
import gui.modelosTabla.ModelosTabla;
import Dto.Participante;
import Logica.LogicaCarreras;
import Logica.LogicaCorredores;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dbarriof
 */
public class PantallaListaCorredores extends javax.swing.JDialog {

    private LogicaCorredores listaCorredores;
    private LogicaCarreras listaCarreras;
    private Carrera carrera;
    
    /**
     * Constructor para ver el listado completo de corredores dados de alta en
     * la aplicación
     *
     * @param parent
     * @param modal
     * @param listaCorredores
     */
    public PantallaListaCorredores(java.awt.Frame parent, boolean modal, LogicaCorredores listacorredores) {
        super(parent, modal);
        this.listaCorredores = listacorredores;
        initComponents();
        cargarTabla();

        jButtonAniadir.setVisible(false);
        jLabelTitular.setText("Listado de corredores:");
    }

    /**
     * Constructor para ver el listado de corredores importados desde un fichero
     *
     * @param parent
     * @param modal
     * @param listaCorredores
     * @param importados
     */
    public PantallaListaCorredores(java.awt.Frame parent, boolean modal, LogicaCorredores listacorredores, File archivo) {
        super(parent, modal);
        this.listaCorredores = listacorredores;
        listacorredores.importarCorredores(archivo);
        initComponents();
        cargarTabla();

        jButtonAniadir.setVisible(false);
        jLabelTitular.setText("Corredores importados:");
    }

    /**
     * Constructor para mostrar listado de corredores y dar de alta en una
     * carrera
     * 
     * @param parent
     * @param modal
     * @param listaCarreras
     * @param listaCorredores
     * @param carrera 
     */
    public PantallaListaCorredores(java.awt.Dialog parent, boolean modal, LogicaCarreras listaCarreras, LogicaCorredores listaCorredores, Carrera carrera) {
        super(parent, modal);
        this.listaCarreras = listaCarreras;
        this.listaCorredores = listaCorredores;
        this.carrera = carrera;
        initComponents();
        
        cargarTabla();
        jLabelTitular.setText("Listado de corredores:");
    }

    public void cargarTabla() {
        jTableCorredores.setModel(ModelosTabla.tablaCorredor());
        DefaultTableModel dtm = (DefaultTableModel) jTableCorredores.getModel();
        for (Corredor c : listaCorredores.verCorredores()) {
            dtm.addRow(c.arrayToStrings());
        }

        jTableCorredores.setRowSorter(ModelosTabla.ordenaTabla(dtm, 0));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitular = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCorredores = new javax.swing.JTable();
        jButtonVolver = new javax.swing.JButton();
        jButtonAniadir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listado de corredores");

        jLabelTitular.setText("null");

        jTableCorredores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableCorredores);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jButtonVolver.setText("Volver...");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jButtonAniadir.setText("Añadir");
        jButtonAniadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAniadirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonAniadir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonVolver)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVolver)
                    .addComponent(jButtonAniadir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonAniadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAniadirActionPerformed
        if (!carrera.getDorsales().isEmpty()) {
            int filaSeleccionada = jTableCorredores.convertRowIndexToModel(jTableCorredores.getSelectedRow());
            Corredor seleccionado = listaCorredores.buscaCorredor(listaCorredores.verCorredores().get(filaSeleccionada).getDni());
            boolean resultado = listaCarreras.aniadirParticipante(carrera, seleccionado);
            if (!resultado) {
                JOptionPane.showMessageDialog(this, "El corredor seleccionado ya está inscrito en está carrera y no se añadirá", "Confirmación", JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Se han completado todas las plazas disponibles para esta carrera", "Confirmación", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_jButtonAniadirActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAniadir;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabelTitular;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCorredores;
    // End of variables declaration//GEN-END:variables
}
