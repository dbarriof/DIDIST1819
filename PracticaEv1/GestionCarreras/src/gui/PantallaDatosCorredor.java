/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Dto.Corredor;
import Logica.LogicaCorredores;
import java.awt.Color;
import java.util.Date;
import javax.swing.JOptionPane;
import org.netbeans.validation.api.builtin.stringvalidation.StringValidators;
import org.netbeans.validation.api.ui.ValidationGroup;

/**
 *
 * @author dbarriof
 */
public class PantallaDatosCorredor extends javax.swing.JDialog {

    private LogicaCorredores logicaCorredores;
    private ValidationGroup group;
  
    
    //Constructor para dar de alta un corredor
    public PantallaDatosCorredor(java.awt.Frame parent, boolean modal, LogicaCorredores logicacorredores) {
        super(parent, modal);
        setTitle("Alta corredor");
        this.logicaCorredores = logicacorredores;
        initComponents();
        validador();

        jButtonAceptarMoficacion.setVisible(false);
        jButtonEliminarCorredor.setVisible(false);
    }
    
    //Constructor para modificar un corredor
    public PantallaDatosCorredor(java.awt.Frame parent, boolean modal, LogicaCorredores logicacorredores, Corredor c) {
        super(parent, modal);
        setTitle("Modificar corredor");
        this.logicaCorredores = logicacorredores;
        initComponents();
        validador();
        
        //Detalles de pantalla
        jLabelAltaCorredor.setText("Modifica los campos necesarios:");
        
        jTextFieldNombre.setText(c.getNombre());
        jTextFieldDni.setText(c.getDni());
        jTextFieldDni.setEditable(false);
        jTextFieldDni.setToolTipText("No es posible modificar el Dni");
        jTextFieldDni.setForeground(Color.GRAY);
        jSpinnerFechaNac.setValue(c.getFechaNac());
        jTextAreaDireccion.setText(c.getDireccion());
        jTextFieldTelefono.setText(String.valueOf(c.getTelefono()));
        
        jButtonAceptarAlta.setVisible(false);
        jButtonEliminarCorredor.setVisible(false);
    }
    
    //Constructor para eliminar un corredor
    public PantallaDatosCorredor(java.awt.Frame parent, boolean modal, LogicaCorredores logicacorredores, Corredor c, boolean eliminar) {
        super(parent, modal);
        setTitle("Eliminar corredor");
        this.logicaCorredores = logicacorredores;
        initComponents();
        validador();
        
        //Detalles de pantalla
        jLabelAltaCorredor.setText("Datos del corredor:");
        
        jTextFieldNombre.setText(c.getNombre());
        jTextFieldNombre.setEditable(false);
        jTextFieldNombre.setForeground(Color.GRAY);
        jTextFieldDni.setText(c.getDni());
        jTextFieldDni.setEditable(false);
        jTextFieldDni.setForeground(Color.GRAY);
        jSpinnerFechaNac.setValue(c.getFechaNac());
        jSpinnerFechaNac.setEnabled(false);
        jSpinnerFechaNac.setForeground(Color.GRAY);
        jTextAreaDireccion.setText(c.getDireccion());
        jTextAreaDireccion.setEditable(false);
        jTextAreaDireccion.setForeground(Color.GRAY);
        jTextFieldTelefono.setText(String.valueOf(c.getTelefono()));
        jTextFieldTelefono.setEditable(false);
        jTextFieldTelefono.setForeground(Color.GRAY);
        
        jButtonAceptarMoficacion.setVisible(false);
        jButtonAceptarAlta.setVisible(false);
    }
    
    public void validador(){
        //Validación de campos de entrada
        group = validationPanelValidacionDatos.getValidationGroup();

        group.add(jTextFieldNombre, StringValidators.REQUIRE_NON_EMPTY_STRING);
        group.add(jTextFieldDni, StringValidators.REQUIRE_NON_EMPTY_STRING);
        group.add(jTextFieldDni, StringValidators.maxLength(9));
        group.add(jTextFieldDni, StringValidators.minLength(9));
        group.add(jTextAreaDireccion, StringValidators.REQUIRE_NON_EMPTY_STRING);
        group.add(jTextFieldTelefono, StringValidators.REQUIRE_VALID_INTEGER);
        group.add(jTextFieldTelefono, StringValidators.minLength(9));
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
        jLabelAltaCorredor = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelDni = new javax.swing.JLabel();
        jLabelFechaNac = new javax.swing.JLabel();
        jLabelDireccion = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldDni = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDireccion = new javax.swing.JTextArea();
        jTextFieldTelefono = new javax.swing.JTextField();
        jSpinnerFechaNac = new javax.swing.JSpinner();
        validationPanelValidacionDatos = new org.netbeans.validation.api.ui.swing.ValidationPanel();
        jButtonAceptarAlta = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonAceptarMoficacion = new javax.swing.JButton();
        jButtonEliminarCorredor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelAltaCorredor.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelAltaCorredor.setText("Datos del corredor:");

        jLabelNombre.setText("Nombre:");

        jLabelDni.setText("Dni:");

        jLabelFechaNac.setText("Fecha de Nacimiento:");

        jLabelDireccion.setText("Dirección");

        jLabelTelefono.setText("Teléfono:");

        jTextFieldNombre.setToolTipText("Espacio para insertar nombre del corredor");
        jTextFieldNombre.setName("Nombre"); // NOI18N

        jTextFieldDni.setToolTipText("Espacio para insertar el dni del corredor");
        jTextFieldDni.setName("Dni"); // NOI18N

        jTextAreaDireccion.setColumns(20);
        jTextAreaDireccion.setRows(5);
        jTextAreaDireccion.setToolTipText("Espacio para insertar la dirección del corredor");
        jTextAreaDireccion.setName("Dirección"); // NOI18N
        jScrollPane1.setViewportView(jTextAreaDireccion);

        jTextFieldTelefono.setToolTipText("Espacio para insertar el teléfono del corredor");
        jTextFieldTelefono.setName("Telefóno"); // NOI18N

        jSpinnerFechaNac.setModel(new javax.swing.SpinnerDateModel());
        jSpinnerFechaNac.setToolTipText("Selecciona la fecha de nacimiento del corredor");
        jSpinnerFechaNac.setName("Fecha de nacimiento"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDni, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAltaCorredor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNombre)
                    .addComponent(jTextFieldDni)
                    .addComponent(jTextFieldTelefono)
                    .addComponent(jSpinnerFechaNac)
                    .addComponent(validationPanelValidacionDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelAltaCorredor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(validationPanelValidacionDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelDni, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSpinnerFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jButtonAceptarAlta.setText("Aceptar");
        jButtonAceptarAlta.setToolTipText("");
        jButtonAceptarAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarAltaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAceptarAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 340, 80, -1));

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setMaximumSize(new java.awt.Dimension(71, 23));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 340, -1, -1));

        jButtonAceptarMoficacion.setText("Aceptar");
        jButtonAceptarMoficacion.setToolTipText("");
        jButtonAceptarMoficacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarMoficacionActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAceptarMoficacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 80, -1));

        jButtonEliminarCorredor.setText("Eliminar");
        jButtonEliminarCorredor.setToolTipText("");
        jButtonEliminarCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarCorredorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEliminarCorredor, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 340, 80, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed

        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAceptarMoficacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarMoficacionActionPerformed
        if (group.performValidation() == null) {
            //Mostrar dialogo de confirmacion
            int aceptar = JOptionPane.showConfirmDialog(this, "¿Confirmar cambios?", "Confirmar", JOptionPane.YES_NO_OPTION);

            if (aceptar == JOptionPane.YES_OPTION) {

                String nombre = jTextFieldNombre.getText();
                String dni = jTextFieldDni.getText();
                Date fecNac = (Date) jSpinnerFechaNac.getValue();
                String Direccion = jTextAreaDireccion.getText();
                int telefono = Integer.parseInt(jTextFieldTelefono.getText());

                Corredor c = new Corredor(nombre, dni, fecNac, Direccion, telefono);
                logicaCorredores.altaCorredor(c);

                JOptionPane.showConfirmDialog(this, "Cambios realizados con éxito.", "Confirmación", JOptionPane.CLOSED_OPTION);

                dispose();
            } else if (aceptar == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(this, "Se han cancelado los cambios", "Confirmación", JOptionPane.WARNING_MESSAGE);

            }

        } else {
            JOptionPane.showMessageDialog(this, "No se ha rellenado el formulario correctamente", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAceptarMoficacionActionPerformed

    private void jButtonAceptarAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarAltaActionPerformed
        if (group.performValidation() == null) {
            //Mostrar dialogo de confirmacion
            int aceptar = JOptionPane.showConfirmDialog(this, "¿Confirmar alta?", "Confirmar", JOptionPane.YES_NO_OPTION);

            if (aceptar == JOptionPane.YES_OPTION) {

                String nombre = jTextFieldNombre.getText();
                String dni = jTextFieldDni.getText();
                Date fecNac = (Date) jSpinnerFechaNac.getValue();
                String Direccion = jTextAreaDireccion.getText();
                int telefono = Integer.parseInt(jTextFieldTelefono.getText());

                Corredor c = new Corredor(nombre, dni, fecNac, Direccion, telefono);
                logicaCorredores.altaCorredor(c);

                JOptionPane.showConfirmDialog(this, "Alta realizada con éxito.", "Confirmación", JOptionPane.CLOSED_OPTION);

                dispose();
            } else if (aceptar == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(this, "Se ha cancelado la alta", "Confirmación", JOptionPane.WARNING_MESSAGE);

            }

        } else {
            JOptionPane.showMessageDialog(this, "No se ha rellenado el formulario correctamente", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAceptarAltaActionPerformed
    
    private void jButtonEliminarCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarCorredorActionPerformed
                 //Mostrar dialogo de confirmacion
            int aceptar = JOptionPane.showConfirmDialog(this, "¿Confirmar eliminación del corredor?", "Confirmar", JOptionPane.YES_NO_OPTION);

            if (aceptar == JOptionPane.YES_OPTION) {

                String nombre = jTextFieldNombre.getText();
                String dni = jTextFieldDni.getText();
                Date fecNac = (Date) jSpinnerFechaNac.getValue();
                String Direccion = jTextAreaDireccion.getText();
                int telefono = Integer.parseInt(jTextFieldTelefono.getText());

                Corredor c = new Corredor(nombre, dni, fecNac, Direccion, telefono);
                logicaCorredores.bajaCorredor(c);

                JOptionPane.showConfirmDialog(this, "Se ha eliminado el corredor.", "Confirmación", JOptionPane.CLOSED_OPTION);

                dispose();
            } else if (aceptar == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(this, "Se ha cancelado la eliminación", "Confirmación", JOptionPane.WARNING_MESSAGE);

            }      
    }//GEN-LAST:event_jButtonEliminarCorredorActionPerformed
    
     @Override

        public void setTitle(String title) {
            super.setTitle(title);
        }
        
    /**
     * @param args the command line arguments
     */

    public PantallaDatosCorredor() {
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptarAlta;
    private javax.swing.JButton jButtonAceptarMoficacion;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEliminarCorredor;
    private javax.swing.JLabel jLabelAltaCorredor;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelDni;
    private javax.swing.JLabel jLabelFechaNac;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerFechaNac;
    private javax.swing.JTextArea jTextAreaDireccion;
    private javax.swing.JTextField jTextFieldDni;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    private org.netbeans.validation.api.ui.swing.ValidationPanel validationPanelValidacionDatos;
    // End of variables declaration//GEN-END:variables
}